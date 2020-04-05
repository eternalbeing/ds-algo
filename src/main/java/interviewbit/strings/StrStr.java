package interviewbit.strings;

public class StrStr {

    public int strstr(String s, String x) {
        int low = 0, high = x.length();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (s.substring(low, high).equals(x)) {
                return low;
            }
            low = high-1;
            high = high + low;

        }

        return -1;
    }


}
