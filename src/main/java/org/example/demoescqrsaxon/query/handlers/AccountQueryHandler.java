package org.example.demoescqrsaxon.query.handlers;

import org.axonframework.queryhandling.QueryHandler;
import org.example.demoescqrsaxon.query.entities.Account;
import org.example.demoescqrsaxon.query.queries.GetAllAccountsQuery;
import org.example.demoescqrsaxon.query.repository.AccountRepository;
import org.example.demoescqrsaxon.query.repository.OperationRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountQueryHandler {
    private AccountRepository accountRepository;
    private OperationRepository operationRepository;

    public AccountQueryHandler(AccountRepository accountRepository, OperationRepository operationRepository) {
        this.accountRepository = accountRepository;
        this.operationRepository = operationRepository;
    }

    @QueryHandler
    public List<Account> on(GetAllAccountsQuery query){
        return accountRepository.findAll();
    }
}
