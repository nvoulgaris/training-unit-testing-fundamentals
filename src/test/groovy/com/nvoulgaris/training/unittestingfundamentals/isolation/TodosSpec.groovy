package com.nvoulgaris.training.unittestingfundamentals.isolation

import spock.lang.Specification

class TodosSpec extends Specification {

  Todos todos = new Todos()

  def "should remove an existing Todo item when it is done"() {
    given:
      todos.add("Get eggs")
    when:
      todos.done("Get the eggs")
    then:
      todos.countTodos() == 0
  }

  def "should contain no todo items initially"() {
    when:
      Integer initialTodoCount = todos.countTodos()
    then:
      initialTodoCount == 0
  }
}