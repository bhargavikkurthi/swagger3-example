package dev.bhargav.swagger3.example.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Tutorial {

  @Schema(accessMode = Schema.AccessMode.READ_ONLY)
  private long id = 0;

  private String title;

  private String description;

  private boolean published;

  public Tutorial(String title, String description, boolean published) {
    this.title = title;
    this.description = description;
    this.published = published;
  }

}
