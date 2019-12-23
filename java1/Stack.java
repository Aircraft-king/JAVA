package java作业.java1;

public interface Stack<E> {
	int getSize();
	boolean isEmpty();
	void push(E e);
	E pop();
	E peek();
}
