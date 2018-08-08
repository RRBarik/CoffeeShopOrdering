package com.sg.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sg.coffee.domain.Order;
import com.sg.coffee.domain.Person;
import com.sg.coffee.domain.Product;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findDistinctOrderByOrderLines_Product(Product product);

    List<Order> findOrderByPerson(Person person);

    List<Order> findOrderByOrderDateBetween(Date minDate, Date maxDate);


}
