package com.anandreddy.portfolio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anandreddy.portfolio.dto.ProjectDTO;
import com.anandreddy.portfolio.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<ProjectDTO> getAllProjects() {
        return projectService.getAllProjects()
                .stream()
                .map(project -> {
                    ProjectDTO dto = new ProjectDTO();
                    dto.setTitle(project.getTitle());
                    dto.setDescription(project.getDescription());
                    dto.setLink(project.getLink());
                    dto.setTechnologies(project.getTechnologies());
                    return dto;
                })
                .toList();
    }
}
