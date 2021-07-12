package dev.crud.leaflearn.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class controllerx {
@RequestMapping("/pageone")
    public ModelAndView getPageone(){
    return new ModelAndView("page1.html");
}
 @RequestMapping("/students")
    public String listStudents(HttpServletRequest request, Model model){
        return  "students";
 }
}
