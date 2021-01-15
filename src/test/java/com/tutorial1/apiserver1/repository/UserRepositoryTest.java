package com.tutorial1.apiserver1.repository;

import com.tutorial1.apiserver1.models.User;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @After
    public void cleanup() { userRepository.deleteAll(); }

    @Test
    public void User_저장() {
        //given
        String username = "user";
        String password = "pwd";
        String email    = "user@gmail.com";

        userRepository.save(User.builder()
            .username(username)
            .password(password)
            .email(email)
            .build());

        //when
        List<User> usersList = userRepository.findAll();

        User users = usersList.get(0);
        assertThat(users.getUsername()).isEqualTo(username);
        assertThat(users.getPassword()).isEqualTo(password);
        //then
    }
}
