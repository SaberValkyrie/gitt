package thymeleafdemo.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleafdemo.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
@RequestMapping("/employees")
public class EmployeeController {
    private List<Employee> theEmpoyees;

    @PostConstruct
    private void loadData(){
        Employee emp = new Employee(1,"Nguyen","Hai","hai@gg,v");
        Employee emp1 = new Employee(2,"Dang","Hai","hai@4r,v");
        Employee emp2 = new Employee(3,"Vu","Hai","csc2@gg,v");

        theEmpoyees = new ArrayList<>();

        theEmpoyees.add(emp);
        theEmpoyees.add(emp1);
        theEmpoyees.add(emp2);

    }
    @GetMapping("/list")
    public String listEmployees(Model theModel){
        theModel.addAttribute("employees",theEmpoyees);
        return "list_employees";
    }
}
