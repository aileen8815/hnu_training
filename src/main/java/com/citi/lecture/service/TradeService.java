package com.citi.lecture.service;

import com.citi.lecture.exception.TradeException;
import com.citi.lecture.model.ClientDto;

public interface TradeService {

    void createClient(ClientDto client) throws TradeException;
}
