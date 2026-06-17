package com.workshop.curso.repository;

import com.workshop.curso.model.OrderItem;
import com.workshop.curso.model.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
