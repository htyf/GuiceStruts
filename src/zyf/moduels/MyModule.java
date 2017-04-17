package zyf.moduels;

import zyf.service.TestService;
import zyf.service.impl.TestServiceImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class MyModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(TestService.class).to(TestServiceImpl.class);
		
	}

}
