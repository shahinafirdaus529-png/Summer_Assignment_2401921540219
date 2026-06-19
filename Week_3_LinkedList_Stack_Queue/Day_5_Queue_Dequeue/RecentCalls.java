import java.util.*;

class RecentCounter {

    Queue<Integer> calls;

    public RecentCounter() {

        calls =
            new LinkedList<>();
    }

    public int ping(
        int time
    ) {

        calls.offer(time);

        while(
            calls.peek()
            <
            time - 3000
        ) {

            calls.poll();
        }

        return calls.size();
    }
}
