package mate.academy.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String password;
}
