package com.apper;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GetAccountResponse {
    private String firstName;
    private String lastName;
    private Double balance;
    private String accountId;
    private String username;
    private LocalDateTime registrationDate;
}
