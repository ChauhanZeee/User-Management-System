package com.Geekster.UserManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Date;
import java.sql.Time;
import java.util.Timer;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "System_Model")
public class SystemModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    @NotEmpty
    @Size(min = 4, max = 10, message = "username must be between 3 and 11 character")
    @Column(name="student_user_name")
    private String userName;
    @NotEmpty
    @Size(min = 10, message = "dob is invalid")
    @Column(name="student_date_of_birth")
    private Date dateOfBirth;
    @Email(message = "your email address is invalid")
    @Column(name = "student_email")
    private String email;
    @NotEmpty
    @Size(min = 12, max = 12, message = "phone no is invalid, first two digit is your country code and rest phone number.")
    @Column(name="student_phoneNo")
    private String phoneNo;
    @Column(name= "date")
    private Date date;
    @Column(name="time")
    private Time time;
}
