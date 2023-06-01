package myentertainmentlog.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;

@MappedSuperclass
@AllArgsConstructor
public class NamedEntity extends BaseEntity {

  @Size(min = 1, max = 75)
  @Column(name = "name")
  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.getName();
  }

}