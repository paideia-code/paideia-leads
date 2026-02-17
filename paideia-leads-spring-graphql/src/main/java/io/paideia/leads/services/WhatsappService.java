package io.paideia.leads.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import io.paideia.leads.dtos.LeadResponse;
import io.paideia.leads.dtos.WhatsappInput;

@Service
public class WhatsappService {

    public LeadResponse insertWhatsappLead(WhatsappInput input) {

        return new LeadResponse("success",
                new LeadResponse.LeadData("whatsapp-" + UUID.randomUUID().toString(), input.nombre()));
    }

}
