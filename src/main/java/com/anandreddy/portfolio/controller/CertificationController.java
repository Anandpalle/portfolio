package com.anandreddy.portfolio.controller;

import com.anandreddy.portfolio.model.Certification;
import com.anandreddy.portfolio.service.CertificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certifications")
public class CertificationController {
    private final CertificationService certificationService;

    public CertificationController(CertificationService certificationService) {
        this.certificationService = certificationService;
    }

    @GetMapping
    public List<Certification> getAllCertifications() {
        return certificationService.getAllCertifications();
    }

    @PostMapping
    public Certification createCertification(@RequestBody Certification certification) {
        return certificationService.saveCertification(certification);
    }

    @DeleteMapping("/{id}")
    public void deleteCertification(@PathVariable Long id) {
        certificationService.deleteCertification(id);
    }
}
