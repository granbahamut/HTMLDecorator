package co.com.ivancho.pattern;

public abstract class PageDecorator extends PageConstructor{

	private PageConstructor constructor;
	
	public PageDecorator(PageConstructor constructor) {
		this.constructor = constructor;
	}
	
	public String decorate() {
		return constructor.decorate();
	}

}
