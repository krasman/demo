package com.example.demo.controller;

import javax.validation.Valid;

import com.example.demo.entity.Human;
import com.example.demo.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HumanController {
    private final HumanRepository humanRepository;

    @Autowired
    public HumanController(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String Humans(ModelMap model) {
            List<Human> humans = new ArrayList<Human>();

            *//*if (title == null)
                tutorialRepository.findAll().forEach(tutorials::add);
            else
                tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);
*//*
            humanRepository.findAll().forEach(humans::add);

        model.addAttribute("humans", humans);
        return "showHuman";
    }*/
    @GetMapping("/")
    public String homePage(Model model){
        return "redirect:/index";
    }
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("humans", humanRepository.findAll());
        return "show-human";
    }

    @GetMapping("/signup")
    public String showSignUpForm(Human human) {
        return "add-human";
    }

    @PostMapping("/addhuman")
    public String addUser(@Valid Human human, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-human";
        }

        humanRepository.save(human);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Human human = humanRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("human", human);

        return "update-human";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Human human, BindingResult result, Model model) {
        if (result.hasErrors()) {
            human.setId(id);
            return "update-human";
        }

        humanRepository.save(human);

        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        Human human = humanRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        humanRepository.delete(human);

        return "redirect:/index";
    }
}
