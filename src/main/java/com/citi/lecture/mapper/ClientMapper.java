package com.citi.lecture.mapper;

import com.citi.lecture.entity.Client;
import com.citi.lecture.model.ClientDto;
import com.sun.xml.internal.ws.api.policy.ModelTranslator;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(uses = ModelTranslator.class, componentModel = "spring")
public interface ClientMapper {

    @Mappings({@Mapping(source = "name", target = "name"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "company", target = "company"),
            @Mapping(source = "last_update_by", target = "last_update_by", defaultValue = "trade_service")})
    Client dtoToClient(ClientDto clientDto);
}
