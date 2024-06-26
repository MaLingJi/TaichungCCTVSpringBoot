package com.cctv.cctv.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cctv.cctv.entity.CCTV;
import com.cctv.cctv.service.CCTVService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/cctv")
public class CCTVController {

    private static final Logger logger = LoggerFactory.getLogger(CCTVController.class);

    @Autowired
    private CCTVService cctvService;

    @GetMapping
    public String listCCTVs(Model model) {
        List<CCTV> cctvs = cctvService.findAll();
        logger.info("Found " + cctvs.size() + " CCTVs");
        model.addAttribute("cctvs", cctvs);
        return "cctv/list";
    }

    @GetMapping("/search")
    public String searchCCTVs(@RequestParam("roadsection") String roadsection, Model model) {
        logger.info("Searching for road section: " + roadsection);
        List<CCTV> cctvs = cctvService.findByRoadsection(roadsection);
        logger.info("Found " + cctvs.size() + " CCTVs");
        model.addAttribute("cctvs", cctvs);
        return "cctv/list";
    }

    @GetMapping("/add")
    public String addCCTVForm(Model model) {
        model.addAttribute("cctv", new CCTV());
        return "cctv/form";
    }

    @PostMapping
    public String saveCCTV(@ModelAttribute CCTV cctv) {
        cctvService.save(cctv);
        return "redirect:/cctv";
    }

    @GetMapping("/edit/{id}")
    public String editCCTVForm(@PathVariable String id, Model model) {
        CCTV cctv = cctvService.findById(id);
        model.addAttribute("cctv", cctv);
        return "cctv/form";
    }

    @PostMapping("/update")
    public String updateCCTV(@ModelAttribute CCTV cctv) {
        cctvService.save(cctv);
        return "redirect:/cctv";
    }

    @GetMapping("/delete/{id}")
    public String deleteCCTV(@PathVariable String id) {
        cctvService.deleteById(id);
        return "redirect:/cctv";
    }

    @GetMapping("/view/{id}")
    public String viewCCTV(@PathVariable String id, Model model) {
        CCTV cctv = cctvService.findById(id);
        logger.info("Viewing CCTV with ID: " + id);
        model.addAttribute("cctv", cctv);
        return "cctv/view";
    }
}