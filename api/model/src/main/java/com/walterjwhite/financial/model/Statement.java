package com.walterjwhite.financial.model;

import com.walterjwhite.datastore.api.model.entity.AbstractEntity;
import com.walterjwhite.file.api.model.File;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(doNotUseGetters = true)
// @PersistenceCapable
@Entity
public class Statement extends AbstractEntity {
  @ManyToOne @JoinColumn protected FinancialAccount account;

  @Column(nullable = false)
  protected LocalDate fromDate;

  @Column(nullable = false)
  protected LocalDate toDate;

  // TODO: for encrypted files, store encryption key / compression scheme somewhere useful
  @EqualsAndHashCode.Exclude @ManyToOne @JoinColumn protected File file;
}
