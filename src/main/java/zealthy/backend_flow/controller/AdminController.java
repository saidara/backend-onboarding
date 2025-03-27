package zealthy.backend_flow.controller;

import zealthy.backend_flow.model.Admin;
import zealthy.backend_flow.service.AdminService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
    private final AdminService adminService;
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @GetMapping("/config")
    public List<Admin> getConfig() {
        return adminService.getConfig();
    }
    @PostMapping("/config")
    public String updateConfig(@RequestBody List<Admin> configs) {
        return adminService.updateConfig(configs);
    }
}


