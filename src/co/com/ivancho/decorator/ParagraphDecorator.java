package co.com.ivancho.decorator;

import co.com.ivancho.pattern.PageConstructor;
import co.com.ivancho.pattern.PageDecorator;

public class ParagraphDecorator extends PageDecorator{

	private String property = "<p>PARAGRAPH</p><br>";
	
	public ParagraphDecorator(PageConstructor constructor) {
		super(constructor);
	}
	
	public String decorate() {
		return super.decorate() + decorateWithParagraph();
	}

	public String decorateWithParagraph() {
		return property;
	}

}
