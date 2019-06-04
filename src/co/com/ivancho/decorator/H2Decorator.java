package co.com.ivancho.decorator;

import co.com.ivancho.pattern.PageConstructor;
import co.com.ivancho.pattern.PageDecorator;

public class H2Decorator extends PageDecorator {

	private String property = "<h2>H2</h2><br>";

	public H2Decorator(PageConstructor constructor) {
		super(constructor);
	}

	public String decorate() {
		return super.decorate() + decorateWithH2();
	}

	public String decorateWithH2() {
		return property;
	}

}
