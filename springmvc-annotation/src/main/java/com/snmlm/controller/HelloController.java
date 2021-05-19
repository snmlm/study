package com.snmlm.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author: snmlm
 * @create: 2021-05-19
 */
@Controller
@RestController
@Component
@Service
@Repository
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam Model model){
        model.addAttribute("msg","Hello");
        return "hello";
    }
}
