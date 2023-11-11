public class StackInteger {
    
    private Integer size;
    private Integer stack[];
    private Integer top = -1;

    public StackInteger(Integer size) {
        this.size = size;
        stack = new Integer[size];
    }

    public void push(Integer data) {
        stack[++top] = data; 
    }

    public Integer pop() {
        return stack[top--];
    }

    public boolean isEmpty() {
        if(top == -1) return true;
        return false;
    }

    public boolean isFull() {
        if(top == this.size - 1) return true;
        return false;
    }

}
