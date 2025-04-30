public class StackKonversi19 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi19() {
        this.size = 32; //asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Kosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi19 stack = new StackKonversi19();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }

        String biner = "";
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }

        return biner;
    }
}
