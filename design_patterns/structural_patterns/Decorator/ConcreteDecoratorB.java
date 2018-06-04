/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.structural_patterns.Decorator;

public class ConcreteDecoratorB extends Decorator {

	public void action() {
		super.action();
		System.out.println("ConcreteDecoratorB.action() called.");
		addedMethod();
	}

	private void addedMethod() {
		System.out.println("ConcreteDecoratorB.addedMethod() called.");
	}
}
