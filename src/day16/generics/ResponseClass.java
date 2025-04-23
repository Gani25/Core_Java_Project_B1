package day16.generics;

public class ResponseClass<T> {
	
	// Automatically field will be assigned to that data type which will be selected on creation of ResponseClass Object
	public T t;
	

	public T getT() {
		return t;
	}


	public void setT(T t) {
		this.t = t;
	}


	@Override
	public String toString() {
		return "ResponseClass [t=" + t + "]";
	}
	
	
	
	

}
