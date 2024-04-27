package com.grpc.demo.db;

import com.grpc.demo.dto.UserResponseDTO;
import com.grpc.demo.model.Contact;
import com.grpc.demo.model.Detail;
import com.grpc.demo.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class StaticDatabase {
    @Autowired
    private ModelMapper modelMapper;

    private final List<User> users = new CopyOnWriteArrayList<>();
    private final List<Contact> contacts = List.of(
            new Contact(1, "shiv1@gmail.com", "7081525454", LocalDateTime.now()),
            new Contact(2, "shiv1@gmail.com", "7081525454", LocalDateTime.now()),
            new Contact(3, "shiv1@gmail.com", "7081525454", LocalDateTime.now()),
            new Contact(4, "shiv1@gmail.com", "7081525454", LocalDateTime.now()),
            new Contact(5, "shiv1@gmail.com", "7081525454", LocalDateTime.now()),
            new Contact(12, "shiv1@gmail.com", "7081525454", LocalDateTime.now())
    );

    private void addRandomData() {
        if (users.isEmpty())
            for (int i = 1; i < 20; i++)
                users.add(new User(i, "Shiv" + i, "pass" + i, new Detail(i, "Chanraiya" + i, LocalDateTime.now()), contacts, LocalDateTime.now()));
    }

    /**
     * Mapping the db layer data into response dto
     *
     * @return
     */
    public List<UserResponseDTO> getAllUsers() {
        addRandomData();
        final List<UserResponseDTO> userResponseDTOS = new CopyOnWriteArrayList<>();
        users.forEach(user -> userResponseDTOS.add(modelMapper.map(user, UserResponseDTO.class)));
        return userResponseDTOS;
    }

}
