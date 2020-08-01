public class Main {

    public static void main(String[] args) {
        Elf elf1 = new Elf();
        Elf elf2 = new Elf();
        elf1.writeDownGift("Cookies and Milk - Tina");
        elf2.writeDownGift("A book - Michelangelo");

        elf1.getSantaList().printGiftItems();
        System.out.println("------------------------------");
        elf2.getSantaList().printGiftItems();
    }
}
