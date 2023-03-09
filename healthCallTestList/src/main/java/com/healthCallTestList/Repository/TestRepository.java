package com.healthCallTestList.Repository;

import org.springframework.stereotype.Repository;

import com.healthCallTestList.Entity.Test;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TestRepository extends JpaRepository<Test,Integer> {

}
