package tw.sheng.controller;


import org.apache.catalina.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class MainController {

    @RequestMapping(value = {"/","/index"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String index(HttpServletRequest request){
        return "index";
    }

    @RequestMapping(value = {"/blank"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String blank(HttpServletRequest request){
        return "blank";
    }

    @RequestMapping(value = {"/buttons"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String buttons(HttpServletRequest request){
        return "buttons";
    }

    @RequestMapping(value = {"/cards"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String cards(HttpServletRequest request){
        return "cards";
    }

    @RequestMapping(value = {"/charts"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String charts(HttpServletRequest request){
        return "charts";
    }

    @RequestMapping(value = {"/tables"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String tables(HttpServletRequest request){
        return "tables";
    }

    @RequestMapping(value = {"/login"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request){
        return "login";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = {"/404"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String Html404(HttpServletRequest request){
        return "404";
    }


}
