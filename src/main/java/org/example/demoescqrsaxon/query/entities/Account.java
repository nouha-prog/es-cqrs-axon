package org.example.demoescqrsaxon.query.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;
import org.example.demoescqrsaxon.enums.AccountStatus;

import java.time.Instant;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Account {
    @Id
    private String id;
    private Instant createdAt;
    private double balance;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private String currency;
}
