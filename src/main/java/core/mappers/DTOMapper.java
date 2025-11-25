package core.mappers;

import api.dto.*;
import data.entities.*;
import java.util.List;
import java.util.stream.Collectors;

public class DTOMapper {

    // Patient
    public static PatientDTO toPatientDTO(Patient patient, boolean eager) {
        PatientDTO dto = new PatientDTO();
        dto.id = patient.getId();
        dto.fullName = patient.getFullName();
        dto.email = patient.getEmail();

        return dto;
    }

    // Practitioner
    public static PractitionerDTO toPractitionerDTO(Practitioner practitioner, boolean eager) {
        PractitionerDTO dto = new PractitionerDTO();
        dto.id = practitioner.getId();
        dto.fullName = practitioner.getFullName();
        dto.email = practitioner.getEmail();
        dto.userType = practitioner.getUserType();
        dto.organizationType = practitioner.getOrganization() != null
                ? practitioner.getOrganization().getOrganizationType().name()
                : null;

        return dto;
    }
}
