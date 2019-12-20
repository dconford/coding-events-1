package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        Map<String, String> eventMap = new HashMap<>();
        eventMap.put("Code With Pride", "A 2 day seminar focused on supporting alternative people and pathways to coding.");
        eventMap.put("Strange Loop", "Learn about the interaction of small food businesses and the programming world");
        eventMap.put("Apple WWDC", "The Premier conference for Apple Developers. Focused seminars and " +
                "presentations from the best in the Apple universe.");
        //context.setVariable("eventMap", eventMap);
//        List<String> events = new ArrayList<>();
//        events.add("Code With Pride");
//        events.add("Strange Loop");
//        events.add("Apple WWDC");
//        events.add("SpringOne Platform");
//        model.addAttribute("events", events);
       // addAllAttributes(Map<String,?> attributes)
       //model.addAllAttributes("eventNames", "eventDescriptions");
    //put("eventNames", eventMap.keySet());
       model.addAttribute("eventDescriptions", eventMap.values());
       model.addAttribute("events", eventMap.entrySet());
        return "events/index";
    }

}



//    @GetMapping
//    public String displayAllEvents (Model model) {
////        List<String> events = new ArrayList<>();
////        events.add("Code With Pride");
////        events.add("StrangeLoop");
////        events.add("Apple WWDC");
////        events.add("SpringOne Platform");
////        events.add("Geek Gala 2020");
////        events.add("MoonShot Awards 2020");
//        model.addAttribute("events", events);
//        return "events/index";
//    }
