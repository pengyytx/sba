package com.dharma.api.sba.dao;

import com.dharma.api.sba.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
}
