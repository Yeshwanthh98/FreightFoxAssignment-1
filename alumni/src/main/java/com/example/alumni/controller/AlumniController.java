package com.example.alumni.controller;

import com.example.alumni.entity.Alumni;
import com.example.alumni.service.AlumniService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumni")
public class AlumniController {

    private final AlumniService alumniService;

    public AlumniController(AlumniService alumniService) {
        this.alumniService = alumniService;
    }

    @PostMapping("/save")
    public Alumni addAlumni(@RequestBody Alumni alumni) {
        return alumniService.saveAlumni(alumni);
    }

    @GetMapping("/all")
    public List<Alumni> getAllAlumni() {
        return alumniService.getAllAlumni();
    }
}
