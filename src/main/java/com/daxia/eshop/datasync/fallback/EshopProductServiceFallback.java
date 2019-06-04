package com.daxia.eshop.datasync.fallback;

import com.daxia.eshop.datasync.service.EshopProductService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/3 17:49
 * @Version 1.0
 */

@Component
public class EshopProductServiceFallback implements EshopProductService {
    @Override
    public String findBrandById(Long id) {
        return null;
    }

    @Override
    public String findBrandByIds(String ids) {
        return null;
    }

    @Override
    public String findCategoryById(Long id) {
        return null;
    }

    @Override
    public String findProductIntroById(Long id) {
        return null;
    }

    @Override
    public String findProductPropertyById(Long id) {
        return null;
    }

    @Override
    public String findProductById(Long id) {
        return null;
    }

    @Override
    public String findProductSpecificationById(Long id) {
        return null;
    }
}
