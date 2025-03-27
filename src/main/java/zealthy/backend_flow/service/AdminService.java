package zealthy.backend_flow.service;

import zealthy.backend_flow.model.Admin;
import zealthy.backend_flow.repository.AdminRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AdminService {
    private final AdminRepository adminRepository;
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    public List<Admin> getConfig() {
        return adminRepository.findAll();
    }
    public String updateConfig(List<Admin> configs) {
        adminRepository.saveAll(configs);
        return "Configuration updated successfully!";
    }
}


