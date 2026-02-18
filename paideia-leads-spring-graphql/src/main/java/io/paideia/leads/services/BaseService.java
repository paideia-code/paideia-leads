package io.paideia.leads.services;

import io.paideia.leads.dtos.LeadResponse;

public abstract class BaseService<T> {

    /* ORQUESTER */
    public LeadResponse process(T input) {
        /* MAPPER */
        LeadResponse leadDTO = map(input);

        /* NORMALIZAR */
        normalize(leadDTO);

        /* HOMOLOGAR */

        /* PERSISTIR */
        persist(leadDTO);

        /* NOTIFICAR */
        notify(leadDTO);

        return leadDTO;
    }

    /* MAPPER */
    protected abstract LeadResponse map(T source);

    /* NORMALIZAR */
    protected void normalize(LeadResponse leadDTO) {
        /* Implementación */
    }

    /* HOMOLOGAR */

    /* PERSISTIR */
    private void persist(LeadResponse leadDTO) {

        if (leadDTO == null) {
            throw new IllegalArgumentException("LeadResponse no puede ser nulo");
        }

        /* repository.save(leadDTO) */

    }

    /* NOTIFICAR */
    protected void notify(LeadResponse leadDTO) {
        /* Implementación */
    }

}
