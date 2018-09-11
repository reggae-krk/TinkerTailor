import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {

    private List<Integer> list;
    private final int step;
    private int size;

    public TinkerTailor(int size, int step) {
        this.list = new ArrayList<Integer>();
        this.size = size;
        this.step = step;
        fillList();
    }

    private void fillList() {
        for (int i = 0; i < this.size; i++) {
            this.list.add(i + 1);
        }
    }

    private int nextStep(int lastIndex) {
        int next = lastIndex + this.step - 1;
        if(next > this.size) {
            next = next - this.size;
        }
        if(next == this.size) return 0;
        return next;
    }

    public int getWinner() {
        int removedIndex = this.step - 1;
        this.list.remove(removedIndex);
        this.size--;
        System.out.println(size);
        while (this.size > 2) {
            int indexToRemove = nextStep(removedIndex);
            this.list.remove(indexToRemove);
            this.size--;
            removedIndex = indexToRemove;
        }
        return this.list.get(0);
    }
}
