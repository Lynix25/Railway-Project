package com.railway.data;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    private String id;
    private String name;
    private Integer age;

    @JsonManagedReference
//    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER) // -> Add New Table For Relation Mapping
    private List<Toy> toys;
}
