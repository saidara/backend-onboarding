package zealthy.backend_flow.repository;

import zealthy.backend_flow.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AdminRepository extends JpaRepository<Admin, Long> {
    List<Admin> findByPageNumber(int pageNumber);
}