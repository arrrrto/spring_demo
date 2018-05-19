package com.arto.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController {
@Autowired
private Demo demo;
@RequestMapping("/sum")
String sum(@RequestParam("a") Integer a,
@RequestParam("b") Integer b) {
return String.valueOf(demo.sum(a, b));
}
}
