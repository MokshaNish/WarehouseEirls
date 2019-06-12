package com.warehouseeirls.warehouseeirls.Controllers;

import com.warehouseeirls.warehouseeirls.Models.GoodReceivedNotice;
import com.warehouseeirls.warehouseeirls.Repositories.GoodReceivedNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/goodReceivedNotice")
public class GoodReceivedNoticeController {

    @Autowired
    GoodReceivedNoticeRepository goodReceivedNoticeRepo;


    @GetMapping("/{id}")
    public Optional<GoodReceivedNotice> get(@PathVariable int id) {
        return goodReceivedNoticeRepo.findById(id);
    }

    @GetMapping
    public List<GoodReceivedNotice> getAll() {
        return goodReceivedNoticeRepo.findAll();
    }


    @PostMapping
    public List<GoodReceivedNotice> addGoodItems(@RequestBody List<GoodReceivedNotice> goodReceivedNotice) {
        return goodReceivedNoticeRepo.saveAll(goodReceivedNotice);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        goodReceivedNoticeRepo.deleteById(id);
    }
}
