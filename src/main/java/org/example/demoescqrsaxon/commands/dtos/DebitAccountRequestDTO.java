package org.example.demoescqrsaxon.commands.dtos;

public record DebitAccountRequestDTO(String accountId, double amount, String currency) {
}