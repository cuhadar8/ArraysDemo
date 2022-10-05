
public class Main {
	
	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "İbrahim";
		ogrenciler[1] = "Hakkı";
		ogrenciler[2] = "Çuhadar";
		ogrenciler[3] = "01";
		for(int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
