package com.grpc.demo.db;

import com.grpc.demo.dto.UserResponseDTO;
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

    private void addRandomData() {
        if (users.isEmpty())
            for (int i = 1; i < 2000; i++)
                users.add(new User(i, "Shiv" + i, "pass" + i, new Detail(i, "Chanraiya" + i, LocalDateTime.now()), LocalDateTime.now()));
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
