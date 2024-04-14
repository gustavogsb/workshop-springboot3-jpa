package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;

//Não vou precisar criar uma implementação para essa interface
//Porque o SpringDataJPA já tem uma implementação padrão para essa interface
//Só com essa definição abaixo já está pronto
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
