package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {
	
	private static class InstanceLazyHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
		return InstanceLazyHolder.instancia;
	}

}
