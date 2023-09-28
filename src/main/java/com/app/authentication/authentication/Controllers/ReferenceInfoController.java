package com.app.authentication.authentication.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.authentication.authentication.Models.ReferenceInformation;
import com.app.authentication.authentication.Repository.ReferenceInfoRepo;


@RestController
@CrossOrigin
@RequestMapping("/reference_info")
public class ReferenceInfoController {

    @Autowired
    private ReferenceInfoRepo referenceInfoRepo;


    @GetMapping
    public List<ReferenceInformation> getReferenceInformations(){
        return referenceInfoRepo.findAll();
    }

}
