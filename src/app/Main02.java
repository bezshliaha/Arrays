package app;

public class Main02 {

    public static void main(String[] args) {

        String[] dayOfWeek = {"Mo", "Tu", "We", "Th", "Fr"};
        String[] items = {"Apple", "Banana", "Mango", "Plum", "Apple"};
        int cnt = 1;

        if (dayOfWeek.length != items.length) {
            System.out.println("Error: incorrect data");
            return;
        }
        System.out.println("\nShopping list of the week:\n");

        for (int i = 0; i < dayOfWeek.length; i++) {
            System.out.println(cnt + ")" + items[i] + " (" + dayOfWeek[i] + ")");
            cnt++;
        }

        String searchItem = "cherry";
        boolean found = false;

        System.out.println("\nResults of searching for '" + searchItem + "':\n");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(searchItem)) {
                System.out.println("Found item: " + searchItem + " Number " + (i + 1)
                                   + " (" + dayOfWeek[i] + ")");
                found = true;
            }
        }
        if (!found) {

            System.out.println("Items named '" + searchItem + "' not found");
        }

    }
}
