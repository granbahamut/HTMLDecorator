package co.com.ivancho.decorator;

import co.com.ivancho.pattern.PageConstructor;
import co.com.ivancho.pattern.PageDecorator;

public class BoldDecorator extends PageDecorator {
	
	private String property = "<b>this is bold</b>";

	public BoldDecorator(PageConstructor constructor) {
		super(constructor);
	}

	public String decorate() {
		return super.decorate() + decorateWithBold();
	}

	public String decorateWithBold() {
		return property;
	}
}
