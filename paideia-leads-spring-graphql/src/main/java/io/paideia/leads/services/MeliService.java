package io.paideia.leads.services;

import org.springframework.stereotype.Service;

import io.paideia.leads.dtos.LeadResponse;
import io.paideia.leads.dtos.MeliInput;

@Service
public class MeliService extends BaseService<MeliInput> {

    @Override
    protected LeadResponse map(MeliInput source) {
        return new LeadResponse("success", new LeadResponse.LeadData("meli-" + source.dni(), source.name()));
    }

    @Override
    protected void normalize(LeadResponse mapped) {
        // Implementar lógica de normalización si es necesario A

    }

}
