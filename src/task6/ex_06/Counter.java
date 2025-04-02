package task6.ex_06;

public class Counter {

    public String counterName;
    public int counter;

    public Counter(String counterName, int counter) {
        this.counterName = counterName;
        this.counter = counter;
    }

    public int plusCounter(int plusCounter) {
        counter = counter + 1 + plusCounter;
        return counter;
    }

    public int minusCounter(int minusCounter) {
        counter = counter - 1 - minusCounter;
        return counter;
    }
}
