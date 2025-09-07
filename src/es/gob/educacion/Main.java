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
		
		String yotramas;
		
		String laultima;
		
		System.out.println("Hago commit en rama1_dev");
		
		System.out.println("Escribo esto en develop");

		System.out.println("Commit en rama1_dev");
		
		
		
		System.out.println("Escrito en rama 2, primer commit");
		
		System.out.println("Escrito en rama 2, segundo commit");
		
		
		
	}

}
