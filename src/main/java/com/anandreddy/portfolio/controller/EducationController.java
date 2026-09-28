package com.anandreddy.portfolio.controller;

import com.anandreddy.portfolio.model.Education;
import com.anandreddy.portfolio.service.EducationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education")
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public List<Education> getAllEducation() {
        return educationService.getAllEducation();
    }

    @PostMapping
    public Education createEducation(@RequestBody Education education) {
        return educationService.saveEducation(education);
    }

    @DeleteMapping("/{id}")
    public void deleteEducation(@PathVariable Long id) {
        educationService.deleteEducation(id);
    }
}
