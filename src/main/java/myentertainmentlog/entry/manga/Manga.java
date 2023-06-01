package myentertainmentlog.entry.manga;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import myentertainmentlog.entry.Entry;

@Getter
@Setter
@Entity
public class Manga extends Entry {

  public Manga(String name, String image, String extraInfo, Boolean onAir) {
    super(name, image, extraInfo);
    this.onAir = onAir;
  }

  private Boolean onAir;
}
