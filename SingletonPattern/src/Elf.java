public class Elf {
    private SantaList santaList = SantaList.getInstance();

    public void writeDownGift(String gift) {
        santaList.addGiftItem(gift);
    }

    public SantaList getSantaList() {
        return santaList;
    }
}
