package com.email.sender;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

    private final EmailService emailService;

    public ContactController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(
            @RequestBody ContactRequest request) {

        emailService.sendEmail(request);

        return ResponseEntity.ok("Email sent successfully");
    }
}