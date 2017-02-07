public class Sumado implements Sumador{

		@Override
		public int Suma(String datos) {
			int []a=convertidor(datos);
			return (a[0]+a[1]);
		}

		@Override
		public int[] convertidor(String datos) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}