package mate.academy.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Movie {

    private Long id;

    private String title;

    private String description;
}
