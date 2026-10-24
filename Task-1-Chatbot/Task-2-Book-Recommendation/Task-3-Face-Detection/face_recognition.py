import cv2
import numpy as np

# Load saved face image
image = cv2.imread("known_faces/vedika.jpg")

# Convert image to grayscale
gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

# Load face detector
face_cascade = cv2.CascadeClassifier(
    cv2.data.haarcascades + "haarcascade_frontalface_default.xml"
)

# Find face in saved image
faces = face_cascade.detectMultiScale(
    gray,
    scaleFactor=1.1,
    minNeighbors=5
)

# Create face recognizer
recognizer = cv2.face.LBPHFaceRecognizer_create()

# Use the detected face as training data
x, y, w, h = faces[0]
training_face = gray[y:y+h, x:x+w]

recognizer.train(
    [training_face],
    np.array([1])
)

print("Face training completed!")

# Open webcam
camera = cv2.VideoCapture(0)

while True:

    success, frame = camera.read()

    if not success:
        break

    gray_frame = cv2.cvtColor(
        frame,
        cv2.COLOR_BGR2GRAY
    )

    detected_faces = face_cascade.detectMultiScale(
        gray_frame,
        scaleFactor=1.1,
        minNeighbors=5
    )

    for (x, y, w, h) in detected_faces:

        face = gray_frame[y:y+h, x:x+w]

        label, confidence = recognizer.predict(face)

        if confidence < 80:
            name = "Vedika"
        else:
            name = "Unknown"

        cv2.rectangle(
            frame,
            (x, y),
            (x+w, y+h),
            (0, 255, 0),
            2
        )

        cv2.putText(
            frame,
            name,
            (x, y-10),
            cv2.FONT_HERSHEY_SIMPLEX,
            0.8,
            (0, 255, 0),
            2
        )

    cv2.imshow(
        "Face Recognition",
        frame
    )

    if cv2.waitKey(1) & 0xFF == ord("q"):
        break

camera.release()
cv2.destroyAllWindows()