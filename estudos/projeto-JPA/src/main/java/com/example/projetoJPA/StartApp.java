package com.example.projetoJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.projetoJPA.model.User;
import com.example.projetoJPA.repository.UserRepository;

public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository repository;
    
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("João");
        user.setUsername("carvalhaus");
        user.setPassword("tatubolamacaco");

        repository.save(user);

        for(User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
