public class asukohaProov{
   public static void main(String[] arg){
      asukoht haapsalu=new asukoht(58.936864, 23.540753);
	  asukoht tartu=new asukoht(58.371829, 26.729506);
	  System.out.println("Ajavahe: "+
	    (tartu.lng-haapsalu.lng)/360*24*60+" minutit");
   }
}