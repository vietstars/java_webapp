package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
// import org.springframework.web.bind.annotation.GetMapping; //get only
import org.springframework.web.bind.annotation.RequestMapping; //restful
import org.springframework.web.bind.annotation.RequestMethod; //restful
import org.springframework.web.bind.annotation.RequestParam; //request param
import org.springframework.web.bind.annotation.PathVariable; //url variable
import org.springframework.util.StringUtils;

@Controller
public class GreetingController {

    // @GetMapping("/greeting")
    // public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    //     model.addAttribute("name", name);
    //     return "greeting";
    // }

    @RequestMapping(value = {"/greeting/{name}","/greeting"}, method = RequestMethod.GET)
    public String greeting(@PathVariable(required = false) String name, Model model) {
    	String username = StringUtils.hasLength(name) ? name : "World";
        model.addAttribute("name", username);
        return "greeting";
    }

}