package org.example.demoescqrsaxon.commands.events;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.demoescqrsaxon.enums.AccountStatus;

@Getter @AllArgsConstructor
public class AccountCreditedEvent {
    private String accountId;
    private double amount;
    private String currency;
}