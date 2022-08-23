public class Solution {
  public boolean checkInclusion(String s1, String s2) {
    int s1Len = s1.length(), s2Len = s2.length();
    if (s1Len > s2Len) {
      return false;
    }
    int[] freq = new int[26];
    int left = 0, count = s1Len;
    for (int pos = 0; pos < s1Len; pos++) {
      freq[s1.charAt(pos)-'a']++;
    }
    for (int right = 0; right < s2Len; right++) {
      if (freq[s2.charAt(right)-'a'] > 0) {
        count--;
      }
      freq[s2.charAt(right)-'a']--;
      if (count == 0){
        return true;
      }
      if (right - left + 1 >= s1Len) {
        if (freq[s2.charAt(left)-'a'] >= 0) {
          count++;
        }
        freq[s2.charAt(left)-'a']++;
        left++;
      }
    }
    return false;
  }
}
