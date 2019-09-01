package com.walterjwhite.financial.model.command;

import com.walterjwhite.financial.model.FinancialAccount;
import java.math.BigDecimal;
import java.time.LocalDate;

public class TransferCommand {
  protected FinancialAccount sourceAccount;
  protected FinancialAccount targetAccount;
  protected BigDecimal amount;
  protected BigDecimal fees;
  protected LocalDate effectiveDate;
}
