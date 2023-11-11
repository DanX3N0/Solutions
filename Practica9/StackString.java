public class StackString {
    private Integer size;
    private String stack[];
    private Integer top = -1;

    public StackString(Integer size) {
        this.size = size;
        stack = new String[size];
    }

    public void push(String data) {
        stack[++top] = data; 
    }

    public String pop() {
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
