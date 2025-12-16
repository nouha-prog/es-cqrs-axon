package org.example.demoescqrsaxon.commands.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.demoescqrsaxon.enums.AccountStatus;

@Getter
@AllArgsConstructor
public class AccountStatusUpdatedEvent {
    private String accountId;
    private AccountStatus status;
}