package psp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ej1_Basico {
	public static void main(String[] args) throws Exception{
		try {
			Process p = new ProcessBuilder(Utils.sh(String.join(" ", args))).start();
			
			InputStream flujo_de_entrada_de_datos = p.getInputStream();
			InputStreamReader lector_de_flujo = new InputStreamReader(flujo_de_entrada_de_datos);
			
			BufferedReader br = new BufferedReader(lector_de_flujo);
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
			int rc = p.waitFor();
			if (rc == 0) {
				
			}else {
				throw new Exception("El comando no es correcto");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
