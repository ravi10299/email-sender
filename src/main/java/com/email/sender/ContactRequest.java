package com.email.sender;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ContactRequest {

    private String name;
    private String email;
    private String subject;
    private String message;


}