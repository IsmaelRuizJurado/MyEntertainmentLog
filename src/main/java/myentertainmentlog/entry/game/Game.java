package myentertainmentlog.entry.game;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import myentertainmentlog.entry.Entry;

@Getter
@Setter
@Entity
public class Game extends Entry {

  public Game(String name, String image, String extraInfo, Console system) {
    super(name, image, extraInfo);
    this.system = system;
  }

  private Console system;
}
