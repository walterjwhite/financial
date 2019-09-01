package com.walterjwhite.financial.api.service;

public interface CreditService {
  void requestCreditIncrease();

  void addAuthorizedUser();

  void removeAuthorizedUser();

  void updatePin();

  void updatePaperlessDelivery();

  void updateContactInformation();

  void addBankAccount();

  void removeBankAccount();

  void listBankAccounts();

  void listPendingPayments();

  void freezeAccount();

  void unfreezeAccount();
}
