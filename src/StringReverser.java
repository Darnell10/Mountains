public class StringReverser {

    public String reverse(String string) {

        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }


}
