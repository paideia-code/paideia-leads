package io.paideia.leads.dtos;

public record LeadResponse(String status, LeadData data) {

    public record LeadData(String id, String name) {
    }

}
