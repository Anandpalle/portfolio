package com.anandreddy.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Summary from your resume
        model.addAttribute("summary", 
            "Java Full Stack Developer (Fresher) with strong knowledge of Core Java, Advanced Java, OOP concepts, exception handling, and SQL/PL-SQL. Experienced in developing backend logic using Java, JDBC, and MySQL. Familiar with HTML, CSS, JavaScript, Bootstrap, Spring, and Spring Boot.");

        // Skills from your resume
        List<String> skills = Arrays.asList(
            "Programming: Java (OOP, Exception Handling, Collections, Multithreading, Java 8, Stream API)",
            "Advanced Java: JDBC, Servlets, JSP, Apache Tomcat",
            "Frameworks: Spring, Spring Boot",
            "Web Technologies: HTML5, CSS3, JavaScript, Bootstrap",
            "Databases: SQL, MySQL, PL-SQL",
            "SQL Concepts: Joins, Subqueries, Views, Indexes, Constraints",
            "Database Design: ER Modeling, Normalization (1NF-3NF)"
        );
        model.addAttribute("skills", skills);

        return "index"; // Refers to index.html in templates folder
    }
}