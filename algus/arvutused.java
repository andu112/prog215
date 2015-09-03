import java.io*.;
public class arvutused{
	public static void main (String[] arg){
			throws IOException{
		double kotimass=2.5;
		int kottidearv=3;
		System.out.println("Kokku: "+kotimass*kottidearv);
		System.out.println("Mitu kotti seekord?");
		BufferedReader lugeja=new BufferedReader();
			new inputStreamReader(system.in)
		);
		String rida=lugeja.readLine();
		try{
			kottidearv=Integer.parseInt(rida);
			System.out.println("Kokku: "+kotimass*kottidearv);
		} catch(Exception ex){
			System.out.println("Probleem: "+ex.getMessage());
	}
}