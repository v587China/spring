package com.ultra.spring.transaction.xml.service;

import java.util.List;

public interface BookManager {

	public void buy(int userId, List<Integer> bookIds);
}
