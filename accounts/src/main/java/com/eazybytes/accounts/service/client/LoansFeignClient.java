package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
    * This is a Feign Client interface for communicating with the Cards microservice.
    * and it is annotated with @FeignClient to specify the name of the service to connect to.
    * Remember: the cards should be same as the name of the Cards microservice registered with Eureka Server .
    * Remember: the fetchCardsDetails method Should match with the method defined in the CardsController class in Cards microservice.
    * I need to create a CardsDto class to hold the response from the Cards microservice we can copy the CardsDto class from the Cards microservice.
    * and Also the Endpoint /api/fetch should match with the endpoint defined in the CardsController class in Cards microservice.
 */
@FeignClient("loans")
public interface LoansFeignClient {

    @GetMapping(value = "/api/fetch", consumes = "application/json")
    public ResponseEntity<LoansDto> fetchCardsDetails(@RequestParam String mobileNumber);
}
