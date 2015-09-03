public class asukohaProov{
   public static void main(String[] arg){
      asukoht haapsalu=new asukoht(58.936864, 23.540753);
	  asukoht tartu=new asukoht(58.371829, 26.729506);
      //System.out.println(haapsalu+" "+tartu);
	  //System.out.println(haapsalu.getLat());
	  System.out.println(tartu.kaugus(haapsalu));
	  asukoht[] teekond=new asukoht[3];
	  teekond[0]=haapsalu;
	  teekond[1]=new asukoht(58.887944, 25.568624);
	  teekond[2]=tartu;
	  for(int i=0; i<teekond.length; i++){
		System.out.println(teekond[i]);
	  }
   }
}