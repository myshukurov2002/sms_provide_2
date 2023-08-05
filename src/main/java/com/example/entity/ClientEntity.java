package com.example.entity;import com.example.enums.Status;import jakarta.persistence.*;import jakarta.validation.constraints.Size;import lombok.Data;import lombok.NoArgsConstructor;@Entity@Data@NoArgsConstructor@Table(name = "client")public class ClientEntity extends BaseEntity{    @Column(name = "company_name")    @Size(min = 3, message = "Name should be at least 3 characters")    private String companyName;    @Column(name = "login")    @Size(min = 6, message = "login should be at least 6 characters")    private String login;    @Column(name = "password")    @Size(min = 6, message = "password should be at least 6 characters")    private String password;    @Enumerated(EnumType.STRING)    private Status status;    @Column(name = "message", columnDefinition = "TEXT")    @Size(min = 3, message = "message should be at least 3 characters")    private String message;}