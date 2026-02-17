package io.paideia.leads.controllers;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import io.paideia.leads.dtos.LeadResponse;
import io.paideia.leads.dtos.WhatsappInput;
import io.paideia.leads.services.WhatsappService;

@Controller
public class WhatsappController {

    private final WhatsappService whatsappService;

    public WhatsappController(WhatsappService whatsappService) {
        this.whatsappService = whatsappService;
    }

    @MutationMapping
    public LeadResponse insertWhatsappLead(@Argument WhatsappInput input) {
        return whatsappService.insertWhatsappLead(input);
    }
}
