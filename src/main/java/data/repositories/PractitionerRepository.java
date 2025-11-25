package data.repositories;

import data.entities.Practitioner;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class PractitionerRepository implements PanacheRepositoryBase<Practitioner, UUID> {

    public List<Practitioner> findAllPractitioners(int pageIndex, int pageSize) {
        return findAll().page(pageIndex, pageSize).list();
    }

    public List<Practitioner> findAllPractitionersWithRelations(int pageIndex, int pageSize) {
        return findAll().page(pageIndex, pageSize).list();
    }

    public Practitioner findById(UUID id) {
        return find("id", id).firstResult();
    }

    public Practitioner findByIdWithRelations(UUID id) {
        return find("id", id).firstResult();
    }

    public Practitioner findByEmail(String email) {
        return find("email = ?1", email).firstResult();
    }

    public Practitioner findByEmailWithRelations(String email) {
        return find("email", email).firstResult();
    }

    public List<Practitioner> findByOrganizationId(UUID organizationId) {
        return find("organization.organizationId = ?1", organizationId).list();
    }

    public List<Practitioner> findByOrganizationIdWithRelations(UUID organizationId) {
        return find("organization.organizationId = ?1", organizationId).list();
    }

    public Long countByOrganization(UUID organizationId) {
        return count("organization.organizationId = ?1", organizationId);
    }

}