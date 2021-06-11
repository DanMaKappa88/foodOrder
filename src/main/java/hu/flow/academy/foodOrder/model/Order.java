package hu.flow.academy.foodOrder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String id;
    private List<Food> foods;
    private User orderedBy;

    @ManyToOne
    User user;

    @ManyToOne
    Food food;
}
