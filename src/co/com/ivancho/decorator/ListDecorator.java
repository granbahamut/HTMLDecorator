package co.com.ivancho.decorator;

import co.com.ivancho.pattern.PageConstructor;
import co.com.ivancho.pattern.PageDecorator;

public class ListDecorator extends PageDecorator {

	private String property = "<ul><li>x</li><li>y</li><li>z</li></ul><br>";

	public ListDecorator(PageConstructor constructor) {
		super(constructor);
	}

	public String decorate() {
		return super.decorate() + decorateWithList();
	}

	public String decorateWithList() {
		return property;
	}

}