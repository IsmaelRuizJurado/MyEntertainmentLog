package myentertainmentlog.entry;

import java.util.List;

import org.hibernate.validator.constraints.URL;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import myentertainmentlog.model.NamedEntity;
import myentertainmentlog.period.Period;

@Getter
@Setter
@Entity
public class Entry extends NamedEntity {

  public Entry(String name, String image, String extraInfo) {
    super(name);
    this.image = image;
    this.extraInfo = extraInfo;
  }

  @URL
  private String image;

  private String extraInfo;

  @OneToMany
  private List<Period> period;
}
