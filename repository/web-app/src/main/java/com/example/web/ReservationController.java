package com.example.web;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
 
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
 
@Scope(value = "session")
@Component(value = "reservationController")
@ELBeanName(value = "reservationController")
@Join(path = "/reservation", to = "/reservation-form.jsf")
public class ReservationController {  
    @RequestMapping("/bookingForm")  
public String bookingForm(Model model)  
{  
      //create a reservation object   
    Reservation res=new Reservation();  
      //provide reservation object to the model   
    model.addAttribute("reservation", res);  
    return "reservation-page";  
}  
@RequestMapping("/submitForm")  
public String submitForm(@ModelAttribute("reservation") Reservation res)  
{  
    return "confirmation-form";  
}  
}  