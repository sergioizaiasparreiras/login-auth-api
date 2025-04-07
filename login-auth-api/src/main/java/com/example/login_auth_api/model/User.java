package com.example.login_auth_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// Entitdade de Usuário

@Entity
@Table(name= "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String password;


}
