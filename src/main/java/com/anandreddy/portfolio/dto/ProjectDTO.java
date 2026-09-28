package com.anandreddy.portfolio.dto;

import jakarta.persistence.*;

@Entity
public class ProjectDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String link;
    private String technologies;

    // ✅ Add getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public String getTechnologies() {
        return technologies;
    }
    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }
}
