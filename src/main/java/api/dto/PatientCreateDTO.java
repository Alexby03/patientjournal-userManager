package api.dto;

import java.util.UUID;

public class PatientCreateDTO {
    public String fullName;
    public String email;
    public String password;
    public UUID patientId;

    public PatientCreateDTO() {}

    public PatientCreateDTO(String fullName, String email, String password, UUID patientId) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.patientId = patientId;
    }
}
