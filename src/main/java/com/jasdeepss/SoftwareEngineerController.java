package com.jasdeepss;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    @DeleteMapping
    public List<SoftwareEngineer> getEngineers() {
        return SoftwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    @DeleteMapping
    public SoftwareEngineer getEngineerById(@PathVariable Integer id) {
        return SoftwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
