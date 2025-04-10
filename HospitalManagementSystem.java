import java.time.LocalDateTime;
import java.util.List;

public class HospitalManagementSystem {
    public static void main(String[] args) throws InvalidPatientIdException {

        Hospital hospital = new Hospital();

        // Create a patient and doctor
        Patient patient = new Patient("P001", "Alice");
        Doctor doctor = new Doctor("D001", "Dr. Smith", Specialty.Cardiology);

        hospital.addPatient(patient);
        hospital.addDoctor(doctor);

        // Schedule an appointment
        try {
            doctor.scheduleAppointment(LocalDateTime.now().plusHours(1), patient);
            doctor.scheduleAppointment(LocalDateTime.now().plusHours(3), patient);
            doctor.scheduleAppointment(LocalDateTime.now().plusDays(1), patient);
        } catch (DoctorUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Appointments for " + patient.getname() + " ID: " + patient.getID());
        List<Appointment> patientAppointments = hospital.getPatientAppointments("P001");

        if (patientAppointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (Appointment appt : patientAppointments) {
                System.out.println(" - Date: " + appt.getDate() +
                        ", Doctor: " + appt.getDoctor().getname() +
                        ", Specialty: " + appt.getDoctor());
            }
        }

        // Display the last three appointments from the patient's array
        System.out.println("\nLast Three Appointments for " + patient.getname() + ":");
        Appointment[] lastAppointments = patient.getLastThreeAppointments();
        for (int i = 0; i < lastAppointments.length; i++) {
            if (lastAppointments[i] != null) {
                System.out.println(" - [" + i + "] Date: " + lastAppointments[i].getDate() +
                        ", Doctor: " + lastAppointments[i].getDoctor().getname());
            } else {
                System.out.println(" - [" + i + "] No appointment recorded.");
            }
        }
    }

}
