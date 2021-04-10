package utils;

public class Nullable<T> {
	public T orElse(T value) {
		return this != null ? this.get() : value;
	}
	
	@SuppressWarnings("unchecked")
	public T get() {
		return (T) this;
	}
}
