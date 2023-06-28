public class without_recursion {
    public static String dup(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "appnnacollege";
        System.out.println(dup(str));
    }
}
