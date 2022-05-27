package net.tonick.htmx.htmxdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/string")
public class StringController {
    @GetMapping
    public String revert(@RequestParam("text") String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
