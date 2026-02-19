package io.paideia.leads.services;

import java.util.UUID;

import io.paideia.leads.repository.LeadRepository;
import io.paideia.leads.repository.entity.Lead;
import org.springframework.stereotype.Service;

import io.paideia.leads.dtos.LeadResponse;
import io.paideia.leads.dtos.WhatsappInput;

@Service
public class WhatsappService {

    private final LeadRepository repository;

    public WhatsappService(LeadRepository repository) {
        this.repository = repository;
    }

    public LeadResponse insertWhatsappLead(WhatsappInput input) {

        Lead lead = repository.save(new Lead(null, "whatsapp-" + UUID.randomUUID().toString(), input.nombre()));

        return new LeadResponse("success",
                new LeadResponse.LeadData(lead.getLeadId(), lead.getName()));
    }

}
