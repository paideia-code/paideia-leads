package io.paideia.leads.services;

import io.paideia.leads.dtos.LeadResponse;
import io.paideia.leads.repository.LeadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadService {

    private final LeadRepository repository;

    public LeadService(LeadRepository repository) {
        this.repository = repository;
    }

    public List<LeadResponse.LeadData> getAllLeads() {
        return repository.findAll().stream()
                .map(lead -> new LeadResponse.LeadData(lead.getLeadId(), lead.getName())).toList();
    }
}
