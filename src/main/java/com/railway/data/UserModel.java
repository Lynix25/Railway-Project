package com.railway.data;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserModel {
    @Id
    private String id;
    private String name;
    private Integer age;

}
