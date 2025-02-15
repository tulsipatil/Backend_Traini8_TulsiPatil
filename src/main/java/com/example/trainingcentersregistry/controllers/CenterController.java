package com.example.trainingcentersregistry.controllers;

import com.example.trainingcentersregistry.payloads.CenterDto;
import com.example.trainingcentersregistry.services.CenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/centers")
public class CenterController
{
    @Autowired
    private CenterService centerService;

    @PostMapping("/")
    public ResponseEntity<CenterDto> createCenter(@Valid @RequestBody CenterDto centerDto){
        CenterDto createCenterDto = this.centerService.createCenter(centerDto);
        return new ResponseEntity<>(createCenterDto, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<CenterDto>> getAllCenters(){
        return ResponseEntity.ok(this.centerService.getAllCenters());
    }


}
