package bg.softuni.marketplace.repository;

import bg.softuni.marketplace.model.domain.UserActivationLinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserActivationLinkRepository extends JpaRepository<UserActivationLinkEntity, Long> {
    Optional<UserActivationLinkEntity> findByActivationLink(String code);
}
