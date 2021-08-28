package com.nvoulgaris.training.unittestingfundamentals.mocking;

import java.util.HashSet;
import java.util.Set;

public class UsedIds {

  private Set<Id> usedIds = new HashSet<>();

  public void add(Id id) {
    this.usedIds.add(id);
  }

  public int countIds() {
    return usedIds.size();
  }
}
