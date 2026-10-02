class MyCircularDeque {

    int arr[];
    int k;
    int bottom;
    int top;

    public MyCircularDeque(int k) {
        arr = new int[k];
        this.k = k;
        bottom = -1;
        top = -1;
    }

    public boolean insertFront(int value) {

        if ((bottom + 1) % k == top) {
            return false;
        }

        if (top == -1) {
            top = bottom = 0;
        }
        else if (top == 0) {
            top = k - 1;
        }
        else {
            top--;
        }

        arr[top] = value;
        return true;
    }

    public boolean insertLast(int value) {

        if ((bottom + 1) % k == top) {
            return false;
        }

        if (top == -1) {
            top = bottom = 0;
        }
        else if (bottom == k - 1) {
            bottom = 0;
        }
        else {
            bottom++;
        }

        arr[bottom] = value;
        return true;
    }

    public boolean deleteFront() {

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

    public boolean deleteLast() {

        if (top == -1) {
            return false;
        }

        if (top == bottom) {
            top = bottom = -1;
        }
        else if (bottom == 0) {
            bottom = k - 1;
        }
        else {
            bottom--;
        }

        return true;
    }

    public int getFront() {

        if (top == -1) {
            return -1;
        }

        return arr[top];
    }

    public int getRear() {

        if (top == -1) {
            return -1;
        }

        return arr[bottom];
    }

    public boolean isEmpty() {

        if (top == -1 && bottom == -1) {
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
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */