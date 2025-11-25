package data.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import core.enums.UserType;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("PRACTITIONER")
public class Practitioner extends User {

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    public Practitioner() {}

    public Practitioner(String fullName, String email, String password, UserType userType, Organization organization) {
        super(fullName, email, password, userType);
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

}