package com.email.sender;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(ContactRequest request) {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo("ravi.verma2320@gmail.com");
        mail.setSubject(request.getSubject());

        mail.setText(
                "Name: " + request.getName() +
                        "\nEmail: " + request.getEmail() +
                        "\n\nMessage:\n" + request.getMessage()
        );

        mailSender.send(mail);
    }
}