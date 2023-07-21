public class mar5_1 {
    public static void main(String[] args) {
        String str = "Hello World, World is amazing!";
        String subStr = "World";
        int index = str.indexOf(subStr);
        if (index != -1) {
            str = str.substring(0, index) + str.substring(index + subStr.length());
        }

        System.out.println(str);
    }
}
