package org.example.demoescqrsaxon.commands.dtos;

public record CreditAccountRequestDTO(String accountId, double amount, String currency) {
}