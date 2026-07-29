class Solution {

    static final char bulletDelimiter = '\u2022';

    public String encode(List<String> strs) {
      StringBuilder result = new StringBuilder();
      if(!strs.isEmpty()){
        for(String str: strs)
          result.append(str).append(bulletDelimiter);
      }
      return result.toString();
    }

    public List<String> decode(String str) {
      if(str.equals(""))
        return List.of();
      List<String> result = new ArrayList<>();
      StringBuilder tmp = new StringBuilder();
      for(int i = 0; i<str.length();i++){
        if(str.charAt(i)==bulletDelimiter){
          result.add(tmp.toString());
          tmp.setLength(0);
          continue;
        }
        tmp.append(str.charAt(i));
     }
     return result;
    }
}
