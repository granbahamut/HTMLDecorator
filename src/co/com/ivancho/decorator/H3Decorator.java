package co.com.ivancho.decorator;

import co.com.ivancho.pattern.PageConstructor;
import co.com.ivancho.pattern.PageDecorator;

public class H3Decorator extends PageDecorator {

	private String property = "<h3>H3</h3><br>";

	public H3Decorator(PageConstructor constructor) {
		super(constructor);
	}

	public String decorate() {
		return super.decorate() + decorateWithH3();
	}

	public String decorateWithH3() {
		return property;
	}

}