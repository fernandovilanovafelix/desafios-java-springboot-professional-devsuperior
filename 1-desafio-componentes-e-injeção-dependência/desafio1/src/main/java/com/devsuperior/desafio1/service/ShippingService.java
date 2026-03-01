package com.devsuperior.desafio1.service;

import com.devsuperior.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double valorPedido = order.getBasic();
        double valorFrete = 0;

        if(valorPedido < 100) {
            valorFrete = 20.00;
        } else if(valorPedido >= 100 && valorPedido < 200) {
            valorFrete = 12.00;
        } else {
            valorFrete = 0;
        }

        return valorFrete;
    }
}
