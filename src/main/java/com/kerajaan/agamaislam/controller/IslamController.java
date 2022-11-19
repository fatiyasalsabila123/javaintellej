package com.kerajaan.agamaislam.controller;


import com.kerajaan.agamaislam.model.IslamModel;
import com.kerajaan.agamaislam.service.IslamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/kerajaanislam")
public class IslamController {

    @Autowired
    private IslamService islamService;

    //menmbahkan data
    @PostMapping
    public IslamModel addSekolahModel(@RequestBody IslamModel islamModel) {
        return islamService.addIslamModel(islamModel);
    }
    //mengambil atau melihat data sesuai id
    @GetMapping("/{id}")
    public IslamModel getIslamById(@PathVariable("id") Long id) {
        return islamService.getIslamModelById(id);
    }

    //merubah data
    @PutMapping("/{id}")
    public IslamModel update(@PathVariable("id")Long id, @RequestBody IslamModel islamModel) {
        return islamService.editIslamModelById(id, islamModel.getKerajaanIslam(), islamModel.getLetak(), islamModel.getTahunBerdiri(), islamModel.getRajaTerkenal(), islamModel.getPeninggalanSejarh());
    }
    //melihat semua data
    @GetMapping("/all")
    public List<IslamModel> getAllIslamModel() {
        return islamService.getAllIslamModel();
    }
    //menghapus data
    @DeleteMapping("/{id}")
    public void getIslamModelById(@PathVariable("id") Long id) {
        islamService.deleteIslamById(id);
    }
}
