package com.mock.test.mockdemo.api;

import java.util.List;

public interface ServiceDemo {
	public List<String> retrieve(String user);

	public List<String> getAllUsers();

}
