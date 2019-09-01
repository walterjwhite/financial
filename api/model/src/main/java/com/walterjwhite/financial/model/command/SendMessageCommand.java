package com.walterjwhite.financial.model.command;

import com.walterjwhite.financial.model.FinancialAccount;

public class SendMessageCommand {
  protected FinancialAccount account;
  protected String message;
}
