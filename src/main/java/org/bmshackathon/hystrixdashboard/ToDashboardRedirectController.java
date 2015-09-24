package org.bmshackathon.hystrixdashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDashboardRedirectController {
    @RequestMapping(value = "/")
    public String redirectToHystrixDashboard() {
        return "redirect:/hystrix";
    }
}
