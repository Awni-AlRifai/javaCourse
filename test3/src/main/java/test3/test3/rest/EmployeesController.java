package test3.test3.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

    @GetMapping("/")
    public String sayHello(){
        return "awni rifai 123";
    }
}
