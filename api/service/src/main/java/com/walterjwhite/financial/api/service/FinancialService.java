package com.walterjwhite.financial.api.service;

import com.walterjwhite.financial.model.Statement;
import com.walterjwhite.financial.model.command.QueryCurrentBalanceCommand;
import com.walterjwhite.financial.model.command.RequestStatementCommand;

public interface FinancialService {
  Statement requestStatement(RequestStatementCommand requestStatementCommand);

  void queryCurrentBalance(QueryCurrentBalanceCommand queryCurrentBalanceCommand);

  void sendMessage();

  void listAccounts();

  // change te name of this, make payment
  void payCurrentBalance();

  void manageAlerts();

  void getPendingTransactions();

  void getPostedTransactions();

  void disputeTransaction();

  void getTaxForms();

  // PNC, discover
  void getFicoScore();
}
