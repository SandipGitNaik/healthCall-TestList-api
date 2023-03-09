package com.healthCallTestList.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test")
public class Test {
 @Id
 @Column(name="test_id")
 private int test_id;
 @Column(name="test_name")
 private String test_name;
 @Column(name="test_price")
 private String test_price;
 @Column(name="test_offer_price")
 private String test_offer_price;
 @Column(name="test_description")
 private String test_description;
 @Column(name="test_img_path")
 private String test_img_path;
public int getTest_id() {
	return test_id;
}
public void setTest_id(int test_id) {
	this.test_id = test_id;
}
public String getTest_name() {
	return test_name;
}
public void setTest_name(String test_name) {
	this.test_name = test_name;
}
public String getTest_price() {
	return test_price;
}
public void setTest_price(String test_price) {
	this.test_price = test_price;
}
public String getTest_offer_price() {
	return test_offer_price;
}
public void setTest_offer_price(String test_offer_price) {
	this.test_offer_price = test_offer_price;
}
public String getTest_description() {
	return test_description;
}
public void setTest_description(String test_description) {
	this.test_description = test_description;
}
public String getTest_img_path() {
	return test_img_path;
}
public void setTest_img_path(String test_img_path) {
	this.test_img_path = test_img_path;
}
 
}
