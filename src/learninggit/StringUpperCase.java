package learninggit;

class StringUppercase1{
    public static void main(String as[]){
         String str="krishna";
         for(int i=0;i<str.length();i++){
	   char ch=(char)(str.charAt(i)-32);
	    System.out.print(ch);
         }
}
}	

