package com.nvoulgaris.training.unittestingfundamentals.isolation;

import java.util.ArrayList;
import java.util.List;

public class Todos {

  private List<String> todos = new ArrayList<>();

  public void add(String todo) {
    this.todos.add(todo);
  }

  public void done(String todo) {
    this.todos.remove(todo);
  }

  public int countTodos() {
    return this.todos.size();
  }
}
