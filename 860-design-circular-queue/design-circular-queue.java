class MyCircularQueue {

    int arr[];
    int bottom;
    int top;
    int k;

    public MyCircularQueue(int k) {
        arr = new int[k];
        this.k = k;
        bottom = -1;
        top = -1;
    }

    public boolean enQueue(int value) {

        if ((bottom + 1) % k == top) {
            return false;
        }
        else if (top == -1) {
            top = bottom = 0;
        }
        else if (bottom == k - 1 && top != -1) {
            bottom = 0;
        }
        else {
            bottom++;
        }

        arr[bottom] = value;
        return true;
    }

    public boolean deQueue() {

        if (top == -1) {
            return false;
        }

        if (top == bottom) {
            top = bottom = -1;
        }
        else if (top == k - 1) {
            top = 0;
        }
        else {
            top++;
        }

        return true;
    }

    public int Front() {

        if (top == -1) {
            return -1;
        }

        return arr[top];
    }

    public int Rear() {

        if (bottom == -1) {
            return -1;
        }

        return arr[bottom];
    }

    public boolean isEmpty() {

        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {

        if ((bottom + 1) % k == top) {
            return true;
        }
        else {
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */