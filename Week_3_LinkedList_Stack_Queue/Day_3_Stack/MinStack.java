import java.util.*;

class MinStack {

    Stack<Integer> values;

    Stack<Integer> minimum;

    public MinStack() {

        values =
            new Stack<>();

        minimum =
            new Stack<>();
    }

    public void push(
        int value
    ) {

        values.push(value);

        if(
            minimum.isEmpty()
            ||
            value <= minimum.peek()
        ) {

            minimum.push(value);
        }
    }

    public void pop() {

        if(
            values.peek()
            ==
            minimum.peek()
        ) {

            minimum.pop();
        }

        values.pop();
    }

    public int top() {

        return values.peek();
    }

    public int getMin() {

        return minimum.peek();
    }
}
