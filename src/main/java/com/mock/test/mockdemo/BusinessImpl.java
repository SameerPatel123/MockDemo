package com.mock.test.mockdemo;

import java.util.ArrayList;
import java.util.List;

import com.mock.test.mockdemo.api.ServiceDemo;

public class BusinessImpl {
	private ServiceDemo serviceDemo;

	public BusinessImpl(ServiceDemo serviceDemo) {
		this.serviceDemo = serviceDemo;
	}

	public List<String> retrieveRelatedToSpring(String user) {
		List<String> filter = new ArrayList<String>();
		List<String> actual = serviceDemo.retrieve(user);

		for (String result : actual) {
			if (result.contains("Spring")) {
				filter.add(result);
			}
		}

		return filter;
	}

	public List<String> getAllUsers() {
		List<String> list = new ArrayList<String>();
		List<String> actual = serviceDemo.getAllUsers();
		for (String result : actual) {
			list.add(result);
		}
		return list;

	}

}
