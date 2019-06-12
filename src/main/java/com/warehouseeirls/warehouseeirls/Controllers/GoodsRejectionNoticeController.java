package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.GoodReceivedNotice;
import com.warehouseeirls.warehouseeirls.Models.GoodsRejectionNotice;
import com.warehouseeirls.warehouseeirls.Repositories.GoodReceivedNoticeRepository;
import com.warehouseeirls.warehouseeirls.Repositories.GoodsRejectionNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goodsRejectionNotice")
public class GoodsRejectionNoticeController {

    @Autowired
    GoodsRejectionNoticeRepository goodsRejectionNoticeRepository;

    @PostMapping
    public List<GoodsRejectionNotice> addbadItems(@RequestBody List<GoodsRejectionNotice> goodsRejectionNotice) {
        return goodsRejectionNoticeRepository.saveAll(goodsRejectionNotice);
    }
}

