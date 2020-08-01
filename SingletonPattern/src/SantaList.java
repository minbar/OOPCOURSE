import java.util.ArrayList;
import java.util.List;

public class SantaList {

    private final List<String> gifts = new ArrayList<>();
    private static SantaList santaList;

    private SantaList() {
    }

    public static SantaList getInstance() {
        if (santaList == null) {
            santaList = new SantaList();
        }

        return santaList;
    }

    public void addGiftItem(String gift) {
        gifts.add(gift);
    }

    public void printGiftItems() {
        gifts.forEach(System.out::println);
    }
}
