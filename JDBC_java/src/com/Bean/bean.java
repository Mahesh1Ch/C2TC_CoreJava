package com.Bean;

public class bean {
	public long rule_no;
	public String name;
	
	public bean() {
	}
	
	public bean(long rule_no, String name) {
		super();
		this.rule_no = rule_no;
		this.name = name;
	}
	
	public long getRule_no() {
		return rule_no;
	}
	public void setRule_no(long rule_no) {
		this.rule_no = rule_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
