package com.example.testapi.controller;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@RestController
@RequestMapping("/test")
public class WebController {

    @GetMapping(value = "/getJson", produces = MediaType.APPLICATION_JSON_VALUE)
    public String responseJSON() {
        var map = new HashMap<String, String>();
        map.put("message", "hello");
        return new Gson().toJson(map);
    }

    @GetMapping("/get500")
    public String responseInternalError() throws Exception {
        throw new Exception();
    }
}
