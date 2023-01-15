/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyProject;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;


@ManagedBean(name = "direction")
@SessionScoped
public class Direction implements Serializable{
    private static final long serialVersionUID = -7250065889869767422L;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public void validateFirstname(FacesContext context, UIComponent comp,Object value) {
        System.out.println("inside validate method");
        String firstname = (String) value;
        
        if(firstname.length()<3){
            ((UIInput) comp).setValid(false);
            FacesMessage message = new FacesMessage(
            "Minimum length of firstname is 3");
            context.addMessage(comp.getClientId(context), message);
        }
        
     }
    public void validateLastname(FacesContext context, UIComponent comp,Object value) {
        System.out.println("inside validate method");
        String lastname = (String) value;
        
        if(lastname.length()<3){
            ((UIInput) comp).setValid(false);
            FacesMessage message = new FacesMessage(
            "Minimum length of password is 3");
            context.addMessage(comp.getClientId(context), message);
        }
    }
        
    public void validateEmail(FacesContext context, UIComponent comp,Object value) {
        System.out.println("inside validate method");
        String email = (String) value;
        
        
    }
    
    
    
     public void validatePassword(FacesContext context, UIComponent comp,Object value) {
        System.out.println("inside validate method");
        String password = (String) value;
        
        if(password.length()<4){
            ((UIInput) comp).setValid(false);
            FacesMessage message = new FacesMessage(
            "Minimum length of password is 4");
            context.addMessage(comp.getClientId(context), message);
        }
        
     }
      public String login(){
        
       return "HomePage";
       
}
  
   }
      

