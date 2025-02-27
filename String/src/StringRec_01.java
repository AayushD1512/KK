public class StringRec_01 {
    public static void main(String[] args) {
//        System.out.println(func("baccad","",0));
        System.out.println(func2("baccad"));
    }
//    static String func(String str, String ans, int i){
//        if(i==str.length()){
//            return ans;
//        }
//        if(str.charAt(i)!='a'){
//            ans+=str.charAt(i);
//            return func(str,ans,i+1);
//        }
//        return func(str,ans,i+1);
//    }

    static String func2(String str){

    if(str.isEmpty()){
        return "";
    }
        String ch ="";
        if(str.charAt(0)!='a'){

            ch=str.charAt(0)+ func2(str.substring(1));
        }else {
            ch = func2(str.substring(1));
        }
        return ch;
    }
}
