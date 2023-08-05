package com.example.entity;import jakarta.persistence.*;import lombok.Data;import lombok.NoArgsConstructor;@Entity@Data@NoArgsConstructor@Table(name = "sms")public class SmsEntity extends BaseStringEntity {    @Column(name = "company_id", nullable = false)    private Long companyId;    @ManyToOne(fetch = FetchType.LAZY)    @JoinColumn(name = "company_id", insertable = false, updatable = false)    private ClientEntity clientEntity;    @Column(name = "phone", nullable = false)    private String phone;    @Column(name = "message", columnDefinition = "TEXT", nullable = false)    private String message;}