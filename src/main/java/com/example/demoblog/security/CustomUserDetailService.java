package com.example.demoblog.security;

import com.example.demoblog.entities.User;
import com.example.demoblog.exception.ResourceNotFoundException;
import com.example.demoblog.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        //loading user from database
        User user = this.userRepo.findByEmail(username)
                .orElseThrow(()->new ResourceNotFoundException("user","email:"+username,0));

        return user;
    }
}

