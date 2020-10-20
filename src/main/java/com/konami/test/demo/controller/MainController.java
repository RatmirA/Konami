package com.konami.test.demo.controller;

import com.konami.test.demo.model.Request;
import com.konami.test.demo.model.Response;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Using Controller to send requests
@Controller
public class MainController {
//    With POST we send our request
    @PostMapping(value = "/", //  URL for this method
            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE}, // Using consumes/produces indicate XML format
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
    public Response printCommand(@RequestParam Request request) { return new Response(); } // Method

/* Alternative version
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Response processXMLRequest(@RequestBody Request request) {
        return new Response();
    }
 */
}