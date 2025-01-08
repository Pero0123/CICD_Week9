package ie.atu.week11example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByEmployeeId(String employeeId);

    Optional<Person> findByEmail(String email);
}