package com.example.demoblog.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Role{


   // public String getName;
    @Id
    private int id;
    private String name;

}
