package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // связь зависимотей
import org.springframework.data.repository.query.Param; // привязываем параметры
import org.springframework.stereotype.Controller; // класс управляющий
import org.springframework.ui.Model; // взаимодействия view controller
import org.springframework.web.bind.annotation.ModelAttribute; // связывание параметра и метода , который выводится в веб интейфейс
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView; // название html страниц которые подвязываются к контролеру

@Controller
public class AppController {

    @Autowired
    private PlayService service;

    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword){
        List<Play> listPlay = service.listAll(keyword);
        model.addAttribute("listPlay", listPlay);
        model.addAttribute("keyword", keyword);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewSessionForm(Model model){
        Play play = new Play();
        model.addAttribute("Play", play);
        return "new_play";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveSession(@ModelAttribute("Session") Play play){
        service.save(play);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditSessionFrom(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit_play");
        Play play = service.get(id);
        mav.addObject("Play", play );
        return mav;
    }
    @RequestMapping("/delete/{id}")
    public String deleteSession(@PathVariable(name = "id") Long id){
        service.delete(id);
        return "redirect:/";

    }


}
