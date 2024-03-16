package com.personal.producer;

import com.personal.producer.models.User;
import com.personal.producer.repositories.UserPostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//@Configuration
public class DummyData implements CommandLineRunner {

    @Autowired
    private UserPostgresRepository userPostgresRepository;

    @Override
    public void run(String... args) {

        int userQuantity = 200_000;

        for (int i = 1; i <= userQuantity; i++) {
            System.out.println("Inserting User " + i);
            final User user = new User();
            user.setId(i);
            user.setName("User " + i);
            userPostgresRepository.save(user);
        }

    }
}
