package com.anandreddy.portfolio.controller;

import com.anandreddy.portfolio.dto.ContactRequestDTO;
import com.anandreddy.portfolio.model.Contact;
import com.anandreddy.portfolio.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
