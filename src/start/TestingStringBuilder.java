package start;

public class TestingStringBuilder {

    public static void main(String[] args) {
        int max = 100_000;

        long time_pre_string = System.currentTimeMillis();
        String s1 = concatWithString(max);
        long duration_string = System.currentTimeMillis() - time_pre_string;
        System.out.println("Adding as String " + duration_string + "ms" + " Length is " + s1.length());

        long time_pre_stringbuilder = System.currentTimeMillis();
        String s2 = concatWithStringBuilder(max);
        long duration_stringbuilder = System.currentTimeMillis() - time_pre_stringbuilder;
        System.out.println("Adding as StringBuilder " + duration_stringbuilder + "ms" + " Length is " + s2.length());

        long time_pre_stringrepeat = System.currentTimeMillis();
        String s3 = concatWithStringRepeat(max);
        long duration_stringrepeat = System.currentTimeMillis() - time_pre_stringrepeat;
        System.out.println("Adding as StringRepeat " + duration_stringrepeat + "ms" + " Length is " + s3.length());

    }

    private static String concatWithString(int rounds) {
        String result = "";
        for (int i = 0; i < rounds; i++) {
            result += "a";
        }
        return result;
    }

    private static String concatWithStringBuilder(int rounds) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rounds; i++) {
            result.append("a");
        }
        return result.toString();
    }

    private static String concatWithStringRepeat(int rounds) {
        return "a".repeat(Math.max(0, rounds));
    }
}
