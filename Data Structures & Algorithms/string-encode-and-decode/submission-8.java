class Solution {

    static final char bulletDelimiter = '\u2022';

    public String encode(List<String> strs) {
      String result = "";
      if(!strs.isEmpty()){
        for(String str: strs)
          result += str + bulletDelimiter;
      }
      return result;
    }

    public List<String> decode(String str) {
      if(str.equals(""))
        return List.of();
      List<String> result = new ArrayList<>();
      String tmp = "";
      for(int i = 0; i<str.length();i++){
        if(str.charAt(i)==bulletDelimiter){
          result.add(tmp);
          tmp="";
          continue;
        }
        tmp+=str.charAt(i);
     }
     return result;
    }
}
