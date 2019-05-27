package learninggit;

class StringReverse{
    public static void main(String as[]){
           String str="madam";
           
           String rev="";
           for(int i=str.length()-1;i>=0;i--){
           rev=rev+str.charAt(i);
           }
           System.out.println(rev);
           if(str.equals(rev))
           System.out.println("String is palindrome");
           else
           
           System.out.println("String not is palindrome");
           
        }           
}	



