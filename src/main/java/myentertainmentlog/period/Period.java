package myentertainmentlog.period;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import myentertainmentlog.entry.Entry;
import myentertainmentlog.model.BaseEntity;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Period extends BaseEntity {

  private String description;

  private Date startPeriod;

  private Date endPeriod;

  @ManyToOne(optional = true)
  private Entry entry;
}
