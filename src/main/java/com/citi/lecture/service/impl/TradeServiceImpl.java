package com.citi.lecture.service.impl;

import com.citi.lecture.entity.Client;
import com.citi.lecture.enums.ClientEnum;
import com.citi.lecture.enums.TradeStatus;
import com.citi.lecture.exception.TradeException;
import com.citi.lecture.mapper.ClientMapper;
import com.citi.lecture.model.ClientDto;
import com.citi.lecture.repository.ClientRepository;
import com.citi.lecture.service.TradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TradeServiceImpl implements TradeService {

    private static Logger LOGGER = LoggerFactory.getLogger(TradeServiceImpl.class);

    @Autowired
    ClientMapper clientMapper;

    @Autowired
    ClientEnum clientEnum;

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void createClient(ClientDto clientDto) throws TradeException {
        validateClient(clientDto);
        LOGGER.info("validate client successfully");

        Client client = clientMapper.dtoToClient(clientDto);
        LOGGER.info("convert client dto to client: {}", client);

        transactionTrade(client);
    }

    @Transactional
    private void transactionTrade (Client client) {
        clientRepository.save(client);
        LOGGER.info("save client successfully");
    }

    private void validateClient(ClientDto clientDto) throws TradeException {
        if (null == clientEnum.getClientEnum(clientDto.getName())) {
            throw new TradeException(TradeStatus.INVALID_CLIENT_NAME);
        }
    }
}
