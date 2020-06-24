package com.utn.LabVParcial2.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "calls")
public class Call {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "price_per_minute")
    private float pricePerMinute;

    @Column(name = "duration_secs")
    private Integer durationSecs;

    @Column(name = "total_cost")
    private float totalCost;

    @Column(name = "total_price")
    private float totalPrice;

}
