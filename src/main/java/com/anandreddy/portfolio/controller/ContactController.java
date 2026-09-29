package com.anandreddy.portfolio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anandreddy.portfolio.dto.ContactRequestDTO;
import com.anandreddy.portfolio.model.Contact;
import com.anandreddy.portfolio.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService contactService;

    // ✅ Constructor injection
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping
    public Contact createContact(@RequestBody ContactRequestDTO contactRequest) {
        Contact contact = new Contact();
        contact.setEmail(contactRequest.getEmail());
        contact.setMessage(contactRequest.getMessage());
        return contactService.saveContact(contact);
    }
}
