package com.jay.onetomany.librarymanagementlast.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="transaction_id")
    private long transactionId;
    @Column(name="book_id")
    private long bookId;
    @Column(name="member_id")
    private long memberId;
    @Column(name="transaction_type")
    private String transactionType;
    @Column(name="due_date")
    private LocalDateTime dueDate;
    @Column(name="return_date")
    private LocalDateTime returnDate;




}
