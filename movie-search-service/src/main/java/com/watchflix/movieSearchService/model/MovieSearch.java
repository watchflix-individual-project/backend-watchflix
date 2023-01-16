package com.watchflix.movieSearchservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="movieSearch")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MovieSearch {
    @Id
    private String id;
    private String title;
    private String thumbnail;
    private String description;
    private String link;
    private String year;
}
