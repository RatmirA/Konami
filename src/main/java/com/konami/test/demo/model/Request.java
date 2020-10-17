package com.konami.test.demo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Request")
public class Request {

        @JacksonXmlProperty(isAttribute=true)
        String command;

        @JacksonXmlProperty
        Long ticket;

        public String getCommand() {
                return command;
        }

        public void setCommand(String command) {
                this.command = command;
        }

        public Long getTicket() {
                return ticket;
        }

        public void setTicket(Long ticket) {
                this.ticket = ticket;
        }
}
