package edunova;

public class OmotaciPrimitivnihTipova {

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		
		int i = Integer.parseInt("5");
		System.out.println(i);
		
		
		boolean a = Boolean.parseBoolean("True");
		System.out.println(a);
		byte b = Byte.parseByte("22");
		System.out.println(b);
		short c = Short.parseShort("222");
		System.out.println(c);
		long d = Long.parseLong("2222");
		System.out.println(d);
		float e = Float.parseFloat("3.14f");
		System.out.println(e);
		double f = Double.parseDouble("3.141414");
		System.out.println(f);
		char g = Character.valueOf('A');
		System.out.println("A");
	}
}
