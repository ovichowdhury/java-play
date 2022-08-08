package com.biocore.fingerprint.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Map.entry; 

@RestController
@RequestMapping("api/v1")
public class HelloController {
    @GetMapping("hello")
    public Map<String, Object> hello()
    {
        Map<String, Object> m = new HashMap<>();
        m.put("statusCode", 200);
        m.put("data", Map.ofEntries(entry("id", 1), entry("age", 5)));
        return m;
    }
}
