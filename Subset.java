public class Subset{
    public static void findSubset(String str, String ans, int i){
        //[recursion (work)] base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //Yes Choice
        findSubset(str, ans+str.charAt(i), i+1);
        //No Choice
        findSubset(str, ans, i+1);

    }
    public static void main(String args[]){
        String str = "abc";
        findSubset(str, "",0);
    }
}