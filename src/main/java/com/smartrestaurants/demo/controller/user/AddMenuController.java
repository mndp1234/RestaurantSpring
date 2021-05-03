package com.smartrestaurants.demo.controller.user;

import com.smartrestaurants.demo.model.Menu;
import com.smartrestaurants.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class AddMenuController {

    @Autowired
    private MenuRepository menuRepository;

    @RequestMapping("/menu_item")
    public String add_menu(Model m){
        m.addAttribute("title","pizzahut");
        return "/user/menu_item";
    }

    @RequestMapping("/add_item")
    public String add_item(Model m){
        m.addAttribute("menu",new Menu());
        return "/user/add_item";
    }

    @RequestMapping("/do_add_menu")
    public String do_add_item(@ModelAttribute ("menu") Menu menu){
        Menu menu1 = this.menuRepository.save(menu);
        return "/user/add_item";
    }

    @RequestMapping("/user/home")
    public String user_home(Model m){
        List<Menu> menus= this.menuRepository.findAll();
        m.addAttribute("menu",menus);
        System.out.println(menus);

        return "/user/home";
    }

    @RequestMapping("/delete_item/{menu_id}")
    public String user_delete_item(Model m,@PathVariable ("menu_id") int menukiid){

        Optional<Menu> menu = this.menuRepository.findById(menukiid);
        Menu menu1 =menu.get();
        this.menuRepository.delete(menu1);
        List<Menu> menus= this.menuRepository.findAll();
        m.addAttribute("menu",menus);

        return "/user/home";
    }

}
