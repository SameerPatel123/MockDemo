package com.mock.test.mockdemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mock.test.mockdemo.api.ServiceDemo;

public class BusinessImplMockTest {

	
	//MockTest
	@Test
	public void testRetrieveDemoRelatedToSpring_usingAMock() {

		ServiceDemo serviceMock = mock(ServiceDemo.class);

		List<String> populatingValue = Arrays.asList("Spring MVC", "Spring Core", "Spring IOC", "Hibernate");

		when(serviceMock.retrieve("DummyValue")).thenReturn(populatingValue);

		BusinessImpl businessImpl = new BusinessImpl(serviceMock);

		List<String> filteredDemo = businessImpl.retrieveRelatedToSpring("DummyValue");

		assertEquals(3, filteredDemo.size());
	}
//Mock Test
	@Test
	public void testRetriveUsers_usingMock() {
		ServiceDemo serviceMock = mock(ServiceDemo.class);
		List<String> lstuser = Arrays.asList("Mohan", "Ram", "Sohan", "Ramesh", "Rahul", "Geeta");
		when(serviceMock.getAllUsers()).thenReturn(lstuser);
		BusinessImpl businessImpl = new BusinessImpl(serviceMock);
		List<String> actualResult = businessImpl.getAllUsers();
		assertEquals(6, actualResult.size());
	}

}
