
class Solution {
    public String replaceWords(List<String> dic, String sentence) {
        String sen="";
        Collections.sort(dic);
        for(String str:sentence.split(" ")){
            int n=0;
            for(String str2:dic){
                    if(str.startsWith(str2)){
                    sen+=str2+" ";
                    n=1;
                    break;}}
                if(n==0) sen+=str+" ";
               }
        return sen.trim();
    }
}
