package org.example.authorization;

import org.example.authorization.exception.InvalidCredentials;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.authorization.Authorities.READ;
@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("Artem") && password.equals("password")) {
            List<Authorities> authoritiesList = new ArrayList<>();
            authoritiesList.add(READ);
            return authoritiesList;
        }
        throw new InvalidCredentials("User name or password is invalid");
    }
}