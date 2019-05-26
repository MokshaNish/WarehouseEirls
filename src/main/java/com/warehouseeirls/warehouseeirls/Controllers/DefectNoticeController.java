package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.DefectNotice;
import com.warehouseeirls.warehouseeirls.Repositories.DefectNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/defectNotice")
public class DefectNoticeController {

    @Autowired
    DefectNoticeRepository defectNoticeRepo;

    @GetMapping("/{id}")
    public Optional<DefectNotice> get(@PathVariable int id){
        return defectNoticeRepo.findById(id);
    }

    @GetMapping
    public List<DefectNotice> getAll(){
        return defectNoticeRepo.findAll();
    }

    @PostMapping
    public DefectNotice add(@RequestBody DefectNotice defectNotice){
        return defectNoticeRepo.save(defectNotice);
    }

    @PostMapping("/save-list")
    public List<DefectNotice> addAll(@RequestBody List<DefectNotice> defectNoticeList){
        return defectNoticeRepo.saveAll(defectNoticeList);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        defectNoticeRepo.deleteById(id);
    }
}
