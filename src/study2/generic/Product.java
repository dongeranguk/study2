package study2.generic;

public class Product<T, M> {
	
	private T kind;
	private M model;
	
	public Product() {};
	
	public Product(T t, M m) {
		this.kind = t;
		this.model = m;
	}
	
	public T getKind() {
		return kind;
	}
	
	public M getModel() {
		return model;
	}
	
	public void setKind(T t) {
		this.kind = t;
	}
	
	public void setModel(M m) {
		this.model = m;
	}
	
	@Override
	public String toString() {
		return this.kind + ", " + this.model;
	}
}
