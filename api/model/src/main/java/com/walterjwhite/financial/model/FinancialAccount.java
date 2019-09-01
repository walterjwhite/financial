package com.walterjwhite.financial.model;

import com.walterjwhite.datastore.api.model.entity.AbstractEntity;
import com.walterjwhite.identity.api.model.account.ClientAccount;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(doNotUseGetters = true)
// @PersistenceCapable
@Entity
public class FinancialAccount extends AbstractEntity {
  @OneToOne @JoinColumn protected ClientAccount account;

  @EqualsAndHashCode.Exclude
  @Column(nullable = false)
  protected String accountNumber;

  @EqualsAndHashCode.Exclude
  // TODO: move to an audit table
  @Column(nullable = false)
  protected BigDecimal balance;

  @EqualsAndHashCode.Exclude @OneToMany
  protected List<FinancialTransaction> transactions = new ArrayList<>();
}
