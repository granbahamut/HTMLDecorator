package co.com.ivancho.decorator;

import co.com.ivancho.pattern.PageConstructor;
import co.com.ivancho.pattern.PageDecorator;

public class DivDecorator extends PageDecorator {

	private String property = "<div>DIV</div><br>";

	public DivDecorator(PageConstructor constructor) {
		super(constructor);
	}

	public String decorate() {
		return super.decorate() + decorateWithH1();
	}

	public String decorateWithH1() {
		return property;
	}

}