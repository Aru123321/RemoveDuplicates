import java.util.*;
public class with_recursion {
public static void removeDup(String str, int idx, StringBuilder newStr, boolean map[]){
    //BASE CASE
    if(idx==str.length()){
        System.out.println(newStr);
        return;
    }
    //do the work
    char currChar = str.charAt(idx);
    if(map[currChar-'a']==true){
        //duplicate
        removeDup(str, idx+1, newStr, map);
    }
    else{
        map[currChar-'a'] = true;
        removeDup(str, idx+1, newStr.append(currChar), map);
    }
}


    public static void main(String[] args) {
    String str = "appnnacollege";
    StringBuilder newStr = new StringBuilder("");
    boolean map[] = new boolean[26];
    removeDup(str, 0, newStr, map);
    }
}
    

