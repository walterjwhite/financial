package com.walterjwhite.financial.model.billing;

import com.walterjwhite.datastore.api.model.entity.AbstractNamedEntity;

public class Organization extends AbstractNamedEntity {
  protected Organization parentOrganization;
  protected Region region;
}
