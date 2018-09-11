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
}
