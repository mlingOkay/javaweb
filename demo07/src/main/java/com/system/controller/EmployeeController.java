package com.system.controller;

import com.system.pojo.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * @Author: mlingOkay
 * @CreateTime: 2022-10-06  22:39
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
public class EmployeeController {
    @RequestMapping("/addEmployee")
    public ModelAndView add( Employee employee){
        System.out.println(111);
        System.out.println(employee);
        ModelAndView showEmp = new ModelAndView("showEmp");

        return showEmp;
    }
}
