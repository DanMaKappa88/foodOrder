package hu.flow.academy.foodOrder.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/*
Food(String id; String name; String description; Double price,
@JsonIgnore List<Order> orders)
* **/
@Data
@Entity
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    @Id
    private String id;
    private String name;
    private String description;
    private double price;

    @JsonIgnore
    List<Order> orders;

    }
