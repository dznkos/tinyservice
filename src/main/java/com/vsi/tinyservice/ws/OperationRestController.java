package com.vsi.tinyservice.ws;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationRestController {

    @GetMapping("/suma")
    public String sumarValues(@RequestParam int n1,
                              @RequestParam int n2) {
        return String.valueOf(n1 + n2);
    }

    @GetMapping("/mult")
    public String multValues(@RequestParam int n1,
                              @RequestParam int n2) {
        return String.valueOf(n1 * n2);
    }
}
