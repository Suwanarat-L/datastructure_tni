public class TrainLinkedList {
    public static void main(String[] args) {
        LinkedList greenline = new LinkedList();

        greenline.insert("Mo-chit");
        greenline.insert("Ari");
        greenline.insert("Sanam-Pao");
        System.out.println("All stations \t: " + greenline.traversal());

        greenline.insert(2,"Rachakru");
        System.out.println("All Stations \t: " + greenline.traversal());

        System.out.println("Total Station \t: " + greenline.length());

        System.out.println("First Station \t: " + greenline.get(0));

        greenline.set(0, "Mo-Chit (Central Ladprao)");
        System.out.println("All Stations \t: " + greenline.traversal());

        greenline.remove(2);
        System.out.println("All Stations \t: " + greenline.traversal());

        greenline.removeLastElement();
        System.out.println("All Stations \t: " + greenline.traversal());

        greenline.clear();
        System.out.println("Total Station \t: " + greenline.length());
        System.out.println("All Stations \t: " + greenline.traversal());
    }
}
