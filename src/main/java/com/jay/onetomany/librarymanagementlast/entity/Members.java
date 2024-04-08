package com.jay.onetomany.librarymanagementlast.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="members")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Members {

    @Id
    @Column(name="member_id")
    private long memberId;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="phone_number")
    private long phoneNumber;
    @Column(name="email")
    private String email;

    @OneToMany(targetEntity = Transactions.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    @JoinColumn(referencedColumnName = "member_id",name="member_id")
    List<Transactions> transactions;


}
