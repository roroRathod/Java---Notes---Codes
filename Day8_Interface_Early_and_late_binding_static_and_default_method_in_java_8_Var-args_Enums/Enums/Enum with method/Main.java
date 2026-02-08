public class Main {
    public static void main(String[] args) {
        Item[] itr = Item.values();
        for (Item item : itr) {
            item.info();
        }
    }
}
