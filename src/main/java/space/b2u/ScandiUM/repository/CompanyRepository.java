package space.b2u.ScandiUM.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import space.b2u.ScandiUM.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findByInn(String inn);
    List<Company> findByNameContainingIgnoreCase(String name);
}
