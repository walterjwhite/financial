package com.walterjwhite.financial.model;

import com.walterjwhite.datastore.api.model.entity.AbstractEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(doNotUseGetters = true)
// @PersistenceCapable
@Entity
public class FinancialTransaction extends AbstractEntity {
  @ManyToOne @JoinColumn protected FinancialAccount source;
  @ManyToOne @JoinColumn protected FinancialAccount target;

  @Column protected LocalDateTime effectiveDate;

  @Column protected BigDecimal amount;

  // TODO: support tagging the transaction
}
