Hospital Management System
Overview
The Hospital Management System is a console-based Java application designed to manage hospital operations, including patient registration, doctor scheduling, appointment management, and medical record tracking.
This project serves as a practical implementation of key Java and Object-Oriented Programming (OOP) concepts, making it an excellent learning tool for developers.

Key Features
Patient Management: Register patients and maintain their medical history.
Doctor Management: Assign doctors with specialties and manage their appointment schedules.
Appointment Scheduling: Schedule appointments between patients and doctors, with conflict detection.
Medical Records: Track patient diagnoses and treatments with timestamps.
Appointment Retrieval: View all appointments for a specific patient, including the last three appointments.

Technologies Used
Java: Core programming language (JDK 8 or higher recommended).
OOP Concepts: Encapsulation, inheritance, polymorphism, and abstraction.
Java Features: Control flow, exception handling, generics, ArrayList, lambdas, enums, static/final keywords, and more.
Date/Time API: java.time.LocalDateTime for appointment scheduling and record timestamps.

HospitalManagementSystem/
├
│   ├── HospitalManagementSystem.java  # Main class with entry point
│   ├── Person.java                   # Abstract base class
│   ├── Patient.java                  # Patient class
│   ├── Doctor.java                   # Doctor class with Schedulable interface
│   ├── Appointment.java              # Appointment details
│   ├── MedicalRecord.java            # Medical record details
│   ├── Hospital.java                 # Manages patients and doctors
│   ├── Schedulable.java              # Interface for scheduling
│   ├── Specialty.java                # Enum for doctor specialties
│   └── DoctorUnavailableException.java  # Custom checked exception
