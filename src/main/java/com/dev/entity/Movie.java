package com.dev.entity;

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
