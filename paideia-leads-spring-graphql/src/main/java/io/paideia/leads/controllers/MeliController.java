package io.paideia.leads.controllers;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import io.paideia.leads.dtos.LeadResponse;
import io.paideia.leads.dtos.MeliInput;
import io.paideia.leads.services.MeliService;

@Controller
public class MeliController {

    private final MeliService meliService;

    public MeliController(MeliService meliService) {
        this.meliService = meliService;
    }

    @MutationMapping
    public LeadResponse insertMeliLead(@Argument MeliInput input) {
        return meliService.process(input);
    }

}
