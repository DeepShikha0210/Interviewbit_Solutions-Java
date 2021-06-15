public class Solution {
    public String minWindow(String A, String B) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : B.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();
        int end = 0,start = 0;
        int minLength = Integer.MAX_VALUE;
        int startIdx = -1;
        int endIdx = -1;

        while (end < A.length()) {
            if (map.containsKey(A.charAt(end))) {
                map.put(A.charAt(end), map.get(A.charAt(end)) - 1);
                if (map.get(A.charAt(end)) == 0) {
                    count--;
                }
            }

            while (start < A.length() && count == 0) {
                if (minLength > end - start + 1) {
                    startIdx = start;
                    endIdx = end + 1;
                    minLength = end - start + 1;
                }
                if (map.containsKey(A.charAt(start))) {
                    map.put(A.charAt(start), map.get(A.charAt(start)) + 1);
                    if (map.get(A.charAt(start)) == 1) {
                        count++;
                    }
                }

                start++;
            }

            end++;
        }

        return minLength == Integer.MAX_VALUE ? "" : A.substring(startIdx, endIdx);
    }
}