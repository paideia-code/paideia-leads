package io.paideia.leads.controllers;

import io.paideia.leads.dtos.LeadResponse;
import io.paideia.leads.services.LeadService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LeadController {

    private final LeadService service;

    public LeadController(LeadService service) {
        this.service = service;
    }

    @QueryMapping
    public List<LeadResponse.LeadData> getAllLeads() {
        return service.getAllLeads();
    }
}
