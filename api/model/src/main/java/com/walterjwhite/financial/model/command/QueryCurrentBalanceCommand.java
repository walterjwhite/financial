package com.walterjwhite.financial.model.command;

import com.walterjwhite.financial.model.FinancialAccount;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(doNotUseGetters = true)
// @PersistenceCapable
@Entity
public class QueryCurrentBalanceCommand {

  protected FinancialAccount account;

  protected LocalDateTime requestDateTime;
}
