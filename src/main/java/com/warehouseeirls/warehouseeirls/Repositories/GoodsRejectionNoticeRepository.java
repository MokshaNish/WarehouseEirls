package com.warehouseeirls.warehouseeirls.Repositories;

import com.warehouseeirls.warehouseeirls.Models.GoodReceivedNotice;
import com.warehouseeirls.warehouseeirls.Models.GoodsRejectionNotice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRejectionNoticeRepository extends JpaRepository<GoodsRejectionNotice,Integer> {
}
