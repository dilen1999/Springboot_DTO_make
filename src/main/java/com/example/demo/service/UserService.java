package com.example.demo.service;

import com.example.demo.dto.UserLocationDTO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUserLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::covertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserLocationDTO covertEntityToDto(User user) {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        userLocationDTO.setLongtitude(user.getLocation().getLongtitude());
        return userLocationDTO;
    }

}
