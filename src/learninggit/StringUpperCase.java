package learninggit;

class StringUppercase1{
    public static void main(String as[]){
         String str1="krishna";
         String str2="Ram";
         for(int i=0;i<str1.length();i++){
	   char ch=(char)(str1.charAt(i)-32);
	    System.out.print(ch);
         }
         for(int i=0;i<str2.length();i++){
      	   char ch=(char)(str2.charAt(i)-32);
      	    System.out.print(ch);
               }
}
}	

