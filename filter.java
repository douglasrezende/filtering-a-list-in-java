import java.util.List;
import java.util.ArrayList;

void main() {

    var vals = List.of(-3, 0, 1, -1, 2, 5, 12, 8, -7, -2, 11);
    var res = new ArrayList<Integer>();

    for (int e: vals) {

        if (e > 0) {
            res.add(e);
        }
    }

    System.out.println(res);
}
