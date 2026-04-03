package com.usermanagement.user.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "user_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String name;
	 private String email;

}
