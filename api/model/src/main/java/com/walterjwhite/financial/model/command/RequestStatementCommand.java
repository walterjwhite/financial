package com.walterjwhite.financial.model.command;

import com.walterjwhite.datastore.api.model.entity.AbstractEntity;
import com.walterjwhite.financial.model.FinancialAccount;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import lombok.Data;
import lombok.ToString;

// TODO: make an abstract date/time entity
@Data
@ToString(doNotUseGetters = true)
// @PersistenceCapable
@Entity
public class RequestStatementCommand extends AbstractEntity {

  protected FinancialAccount account;

  protected LocalDate asOfDate;

  protected LocalDateTime requestDateTime;
}
