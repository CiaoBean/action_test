package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * KISSO 演示
 * </p>
 *
 * @author 青苗
 * @since 2017-08-08
 */
@Controller
public class SampleController {


    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "Hello Kisso!";
    }

}