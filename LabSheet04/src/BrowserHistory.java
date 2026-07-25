import java.util.LinkedList;

public class BrowserHistory {
    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<String>();

        history.add("google.com"); //1
        history.add("youtube.com"); //2
        history.add("github.com"); //3
        System.out.println(history); //4

        history.removeLast(); //5
        System.out.println(history); //6

        history.add("shopee.com");//7
        history.add("wikipedia.org");//8
        history.add("claude.ai");//9
        System.out.println(history);//10

        history.remove("youtube.com"); //11
        System.out.println(history);//12

        System.out.println("current page = " + history.getLast()); //13

        System.out.println("Visited youtube.com = " + history.contains("youtube.com")); //14

        System.out.println("Go back to previous page = " + history.get(2));//15

        System.out.println("Go back to previous page again = " + history.get(1));//16

        history.clear();//17
        System.out.println(history);//18
    }
}
