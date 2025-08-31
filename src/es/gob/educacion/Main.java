package es.gob.educacion;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {

	public static void main(String[] args) {
		String nombre = "Miguel";
		System.out.println(nombre);
		
		System.out.println(DigestUtils.sha256Hex(nombre));
		
		String rama = "Estamos en la rama develop";
		
		System.out.println(rama);
		
		String otra;

	}

}
