package org.launchcode.codingevents.controllers;


import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("eventCategories")
public class EventCategoryController {

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", eventCategoryRepository.findAll());
        return "eventCategories/index";
    }
    //    @GetMapping
//    public String displayAllCategories(Model model) {
//        model.addAttribute("title", "All Categories");
//        model.addAttribute("categories", eventCategoryRepository.findAll());
//        return "eventCategories/index";
//    }

    //    check - Use @GetMapping and return "eventCategories/index".
    //    check - Add an attribute for the title that uses "All Categories".
    //    check - Add an attribute for the categories that uses all of the
    //    values in your EventCategoryRepository variable.


    @GetMapping("create")
    public String displayCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventCategory());
        //model.addAttribute("types", EventType.values());
        return "eventCategories/create";
    }

    //
//    @GetMapping("create")
//    public String renderCreateEventCategoryForm(Model model) {
//        model.addAttribute("title", "Create Category");
//        model.addAttribute(new EventCategory());
//        return "eventCategories/create";
//    }

//    Add an attribute for the title and assign it "Create Category".
//    Use @GetMapping and return "eventCategories/create".
//    Add an attribute for a new instance of EventCategory.

    @PostMapping("create")
    public String processCreateEventCategoryForm(@ModelAttribute @Valid EventCategory eventCategory,
                                                 Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Category");
            return "eventCategories/create";
        }

        eventCategoryRepository.save(eventCategory);
        return "redirect:";
    }
}

//    @PostMapping("create")
//    public String processCreateEventCategoryForm(@Valid @ModelAttribute EventCategory eventCategory,
//                                                 Errors errors, Model model) {
//
//        if (errors.hasErrors()) {
//            model.addAttribute("title", "Create Category");
//            model.addAttribute(new EventCategory());
//            return "eventCategories/create";
//        }
//
//        eventCategoryRepository.save(eventCategory);
//        return "redirect:";
//    }
//    Use @PostMapping.
//    Use error validation and the Errors object appropriately.
//    If you want to review how to use the Errors object,
//    check out the section on error validation.
//    Add an attribute for the title and assign it "Create Category".
//    Add an attribute for a new instance of EventCategory.
//    Either return "eventCategories/create" or "redirect:".





//

//
//}