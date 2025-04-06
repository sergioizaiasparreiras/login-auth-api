package com.example.login_auth_api.security;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.example.login_auth_api.model.User;
import lombok.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String generetionToken(User user){
        try{
            Algorithm algorithm = Algorithm.HMAC256(secret);
        } catch(JWTCreationException exception){
            throw new RuntimeException("Error while authenticating");
        }
    }
}
