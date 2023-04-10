package com.citi.lecture.controller;

import com.citi.lecture.exception.TradeException;
import com.citi.lecture.model.ClientDto;
import com.citi.lecture.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trade-service")
public class TradeController {

    @Autowired
    TradeService tradeService;

    @RequestMapping(value="/createClient", method= RequestMethod.POST)
    public void createClient(@RequestBody ClientDto client) throws TradeException {
        tradeService.createClient(client);
    }

    @RequestMapping(value="/queryClient", method= {RequestMethod.GET, RequestMethod.POST})
    public String queryClient() throws TradeException {
        return "this is for query client purpose";
    }
}
