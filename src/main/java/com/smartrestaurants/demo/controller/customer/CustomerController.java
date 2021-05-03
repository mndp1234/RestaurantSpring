package com.smartrestaurants.demo.controller.customer;

import com.smartrestaurants.demo.model.Cart;
import com.smartrestaurants.demo.model.Customer;
import com.smartrestaurants.demo.model.Menu;
import com.smartrestaurants.demo.repository.CartRepository;
import com.smartrestaurants.demo.repository.CustomerRepository;
import com.smartrestaurants.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private CustomerRepository customerRepository;


    @RequestMapping("/customer/signup")
    public String signup(Model m){
        m.addAttribute("customer", new Customer());
        return "/customer/signup";
    }

    @PostMapping("/do_customer_register")
    public String do_user_register(@ModelAttribute ("customer") Customer customer,Model m){
        System.out.println(customer);
        Customer customer1 = this.customerRepository.save(customer);
        System.out.println(customer1);
        return "/customer/signup";
    }

    @RequestMapping("/select_item")
    public String selct_item(Model m){

        List<Menu> menus= this.menuRepository.findAll();
        m.addAttribute("menu",menus);
        return "/customer/order_select";
    }

    @RequestMapping("/cart_items/{menu_id}")
    public String cart_item(Model m, @PathVariable ("menu_id") int menu1_id){
        Cart cart = this.cartRepository.findByMenu(menu1_id);
        if(cart==null){
            Cart cart1 = new Cart();
            cart1.setMenu(menu1_id);
            cart1.setQuantity(1);
            Cart cart2 = this.cartRepository.save(cart1);
        }
        else {
            int a = cart.getQuantity();
            a++;
            cart.setQuantity(a);
            Cart cart3 = this.cartRepository.save(cart);
        }
        System.out.println(cart);

        Cart exmp = this.cartRepository.findByMenuEquals(8);
        System.out.println(exmp.getQuantity());

        return "/customer/cart";
    }

    @RequestMapping("/cart_items")
    public String cart_details(Model m){
        return "/customer/cart";
    }

    @RequestMapping("/order")
    public String order_place(Model m){
        return null;
    }
}
