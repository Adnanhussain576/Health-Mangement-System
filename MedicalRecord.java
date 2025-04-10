import java.time.LocalDateTime;

public class MedicalRecord {

    private LocalDateTime date;
    private String diagnosis;
    private String treatment;

    MedicalRecord(String diagnosis,String treatment){
        this.treatment=treatment;
        this.diagnosis=diagnosis;
        this.date=LocalDateTime.now();
    }

    public LocalDateTime getDate(){return date;}
    public String getDiagnosis(){return diagnosis;}
    public String getTreatment(){return treatment;}


}
