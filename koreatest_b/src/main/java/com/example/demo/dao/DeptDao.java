package com.example.demo.dao;

public class DeptDao {
	public int insert() {
		System.out.println("추가했습니다.");
		return 1;
	}
	
	public int update() {
		System.out.println("업데이트하였습니다.");
		return 0;
	}
	
	public int reset() {
		System.out.println("처음부터 다시.");
		return 3;
	}
}
