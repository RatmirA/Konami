package com.konami.test.demo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.LocalDateTime;

@JacksonXmlRootElement(localName = "Response")
public class Response {
    @JacksonXmlProperty(isAttribute=true)
    String status;

    @JacksonXmlProperty(localName = "ticketid")
    Long ticketId;

    @JacksonXmlProperty(localName = "datetime")
    LocalDateTime dateTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}