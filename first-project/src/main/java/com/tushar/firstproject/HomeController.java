package com.tushar.firstproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.tushar.firstproject.dao.EmployeeDao;
import com.tushar.firstproject.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    EmployeeDao repo;

    @RequestMapping("home")
    public String home(@RequestParam String name, HttpServletRequest req){
        System.out.println("Hi " + name);
        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        return "index";
    }

    @RequestMapping("add")
    public String add() {
        return "employee";
    }

    @RequestMapping("addemployee")
    public String addEmployee(Employee employee) {
        repo.save(employee);
        return "employee";
    }
}
