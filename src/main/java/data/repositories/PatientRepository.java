package data.repositories;

import data.entities.Patient;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class PatientRepository implements PanacheRepositoryBase<Patient, UUID> {

    public Patient findByEmail(String email) {
        return find("email", email).firstResult();
    }

    public Patient findByEmailWithRelations(String email) {
        return find("email", email).firstResult();
    }

    public Patient findById(UUID id) {
        return find("id", id).firstResult();
    }

    public Patient findByIdWithRelations(UUID id) {
        return find("id", id).firstResult();
    }

    public List<Patient> findAllPatients(int pageIndex, int pageSize) {
        return findAll().page(pageIndex, pageSize).list();
    }

    public List<Patient> findAllPatientsWithRelations(int pageIndex, int pageSize) {
        return findAll().page(pageIndex, pageSize).list();
    }

    public List<Patient> searchByName(String namePattern, int pageIndex, int pageSize) {
        return find("fullName like ?1", "%" + namePattern + "%")
                .page(pageIndex, pageSize).list();
    }

    public List<Patient> searchByNameWithRelations(String namePattern, int pageIndex, int pageSize) {
        return find("fullName like ?1", "%" + namePattern + "%")
                .page(pageIndex, pageSize).list();
    }
}
