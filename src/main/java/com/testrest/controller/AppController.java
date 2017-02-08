package com.testrest.controller;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Api(name = "Crud app ",description = "methods to work",stage = ApiStage.RC)
@Controller
public class AppController {

    @RequestMapping("/")
    String home(ModelMap modelMap) {
        modelMap.addAttribute("title", "CRUD REST ANGULAR");
        return "index";
    }


    @RequestMapping("/partials/{page}")
    String partialHandler(@PathVariable("page") final String page) {
        return page;
    }
}
