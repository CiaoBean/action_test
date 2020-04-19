package com.entrobus;
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
    @RequestMapping("/test")
    public String home() {
        return "Hello entrbous!";
    }

}