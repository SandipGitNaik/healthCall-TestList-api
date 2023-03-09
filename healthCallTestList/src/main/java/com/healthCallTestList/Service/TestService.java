package com.healthCallTestList.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCallTestList.Entity.Test;
import com.healthCallTestList.Repository.TestRepository;

@Service
public class TestService {
 @Autowired
 private TestRepository testrepository;

public Test oneSave(Test t) {
	// TODO Auto-generated method stub
	return testrepository.save(t);
}

public List<Test> get() {
	// TODO Auto-generated method stub
	return testrepository.findAll();
}

public void saveOrUpdate(Test s) {
	testrepository.save(s);
}


}
