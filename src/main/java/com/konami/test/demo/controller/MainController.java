package com.konami.test.demo.controller;

import com.konami.test.demo.model.Request;
import com.konami.test.demo.model.Response;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
//    With POST we send our request
    @PostMapping(value = "/", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
    public Response printCommand(@RequestParam Request request) {
        return new Response();
    }
}
