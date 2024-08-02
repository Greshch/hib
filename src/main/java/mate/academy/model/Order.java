package mate.academy.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate orderDate;

    @ManyToOne
    private User owner;
}
