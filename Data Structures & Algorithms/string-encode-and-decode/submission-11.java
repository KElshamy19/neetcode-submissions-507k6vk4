class Solution {

    static final char bulletDelimiter = '\u2022';

    public String encode(List<String> strs) {
        int totalLen = 0;
        for (String str : strs) totalLen += str.length() + 1;
        StringBuilder result = new StringBuilder(totalLen);
        for (String str : strs)
            result.append(str).append(bulletDelimiter);
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == bulletDelimiter) {
                result.add(str.substring(start, i));
                start = i + 1;
            }
        }
        return result;
    }
}