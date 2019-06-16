package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.GoodReceivedNotice;
import com.warehouseeirls.warehouseeirls.Models.GoodsRejectionNotice;
import com.warehouseeirls.warehouseeirls.Repositories.GoodReceivedNoticeRepository;
import com.warehouseeirls.warehouseeirls.Repositories.GoodsRejectionNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/goodsRejectionNotice")
public class GoodsRejectionNoticeController {

    @Autowired
    GoodsRejectionNoticeRepository goodsRejectionNoticeRepository;

    @GetMapping("/{id}")
    public Optional<GoodsRejectionNotice> get(@PathVariable int id) {
        return goodsRejectionNoticeRepository.findById(id);
    }

    @PostMapping
    public List<GoodsRejectionNotice> addBadItems(@RequestBody List<GoodsRejectionNotice> goodsRejectionNotice) {
        return goodsRejectionNoticeRepository.saveAll(goodsRejectionNotice);
    }

    @GetMapping
    public List<GoodsRejectionNotice> getAll() {
        return goodsRejectionNoticeRepository.findAll();
    }

}

