/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

package design_patterns.creational_patterns.Singleton;

/*
 * Singletons really are "per classloader" and
 * in a Java EE application, many developers make
 * the mistake of assuming that a singleton really
 * is a singleton in a cluster of application servers.
 * This is not true!
 */
public final class Singleton {
	private static Singleton instance;
	private int value;

	private Singleton() {
		System.out.println("Singleton constructed.");
	}

	public static synchronized Singleton getInstance() {
		// if it has not been instantiated yet
		if (instance == null) {
			// instantiate it here
			instance = new Singleton();
		}
		return instance;
	}

	/*
	 * remaining methods are for demo purposes your singleton would have it's
	 * business methods here ...
	 */
	public String getInfo() {
		return getClass().getName() + ", loaded by " + getClass().getClassLoader() + ", id#"
				+ System.identityHashCode(this);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int param) {
		value = param;
	}

	public boolean equals(Singleton param) {
		return (System.identityHashCode(this) == System.identityHashCode(param));
	}
}
