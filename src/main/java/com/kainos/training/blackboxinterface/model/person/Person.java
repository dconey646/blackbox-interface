package com.kainos.training.blackboxinterface.model.person;

public class Person {
    private String name;
    private int id;

    public void setId(int id) {
    	this.id = id;
    }
    
    public int getId() {
    	return id;
    }
    
    public String getName(){
	  return name;
    }

    public void setName(String name){
	  this.name = name;
    }
}
