package java作业.java1;

public class ArrayStack<E> implements Stack<E> {
        private Array<E> array;

        public ArrayStack(int capacity) {

            array = new Array<>(capacity);
        }

        public ArrayStack() {
            array = new Array<>();
        }

        @Override
        public int getSize() {
            return array.getSize();
        }

        @Override
        public boolean isEmpty() {
            return array.isEmpty();
        }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    public int getCspacity() {
            return array.getCapacity();
        }

        @Override
        public E pop() {
            // TODO Auto-generated method stub
            return array.removeLast();
        }

        @Override
        public E peek() {
            // TODO Auto-generated method stub
            return array.getLast();
        }

        @Override
        public String toString() {
            StringBuilder res = new StringBuilder();
            res.append("Stack: ");
            res.append('[');
            for (int i = 0; i < array.getSize(); i++) {
                res.append(array.get(i));
                if (i != array.getSize() - 1)
                    res.append(", ");
            }
            res.append("] top");
            return res.toString();
        }
}
