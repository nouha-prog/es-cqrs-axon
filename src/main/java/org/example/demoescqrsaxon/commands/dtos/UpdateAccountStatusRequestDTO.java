package org.example.demoescqrsaxon.commands.dtos;

import org.example.demoescqrsaxon.enums.AccountStatus;

public record UpdateAccountStatusRequestDTO(String accountId, AccountStatus status) {
}
