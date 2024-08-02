package mate.academy.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "movies")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Movie {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;
}
