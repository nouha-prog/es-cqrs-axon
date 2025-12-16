package org.example.demoescqrsaxon.query.controllers;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.example.demoescqrsaxon.query.entities.Account;
import org.example.demoescqrsaxon.query.queries.GetAllAccountsQuery;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/query/accounts")
@CrossOrigin("*")
public class AccountQueryController {
    private QueryGateway queryGateway;

    public AccountQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping("/all")
    public CompletableFuture<List<Account>> getAllAccounts(){
        CompletableFuture<List<Account>> response = queryGateway.query(
                new GetAllAccountsQuery(), ResponseTypes.multipleInstancesOf(Account.class)
        );
        return response;
    }

}