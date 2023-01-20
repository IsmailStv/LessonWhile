public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
//        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Hi!";
        strings[1] = "Bye!";
        strings[2] = "Java";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for(String string:strings){
            System.out.println(string);
        }
        int sum = 0;
        for(int x:numbers){
            sum = sum + x;
        }
        System.out.println(sum);
        int value = 0;
        String s;
    }
}