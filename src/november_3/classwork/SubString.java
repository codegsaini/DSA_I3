package november_3.classwork;

public class SubString {

    public static void main(String[] args) {

        String value = "Hyderabad";
        String key = "bad";

        for (int i=0; i < value.length() - 2; i++) {
            char s1 = value.charAt(i);
            char s2 = value.charAt(i+1);
            char s3 = value.charAt(i+2);

            String finalString = String.valueOf(s1 + s2 + s3);

            System.out.println(finalString);
            if (key.equals(finalString)) {
                System.out.println("Found");
            }

        }

    }

}
