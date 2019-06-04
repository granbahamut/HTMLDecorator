package co.com.ivancho.decorator;

import co.com.ivancho.pattern.PageConstructor;
import co.com.ivancho.pattern.PageDecorator;

public class H1Decorator extends PageDecorator {

	private String property = "<h1>H1</h1><br>";

	public H1Decorator(PageConstructor constructor) {
		super(constructor);
	}

	public String decorate() {
		return super.decorate() + decorateWithH1();
	}

	public String decorateWithH1() {
		return property;
	}
}
