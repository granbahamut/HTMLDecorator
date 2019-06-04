package co.com.ivancho.decorator;

import co.com.ivancho.pattern.PageConstructor;
import co.com.ivancho.pattern.PageDecorator;

public class H4Decorator extends PageDecorator {

	private String property = "<h4>H4</h4><br>";

	public H4Decorator(PageConstructor constructor) {
		super(constructor);
	}

	public String decorate() {
		return super.decorate() + decorateWithH4();
	}

	public String decorateWithH4() {
		return property;
	}

}