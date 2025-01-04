package com.example.demoinvento.service;/*  gaajiCode
    99
    04/01/2025
    */

import com.example.demoinvento.dtos.LoginRequestDTO;
import com.example.demoinvento.dtos.RegisterDTO;
import com.example.demoinvento.dtos.Response;
import com.example.demoinvento.dtos.UserDTO;
import com.example.demoinvento.enitity.User;

public interface UserService {

    Response registerUser(RegisterDTO registerRequest);

    Response loginUser(LoginRequestDTO loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
