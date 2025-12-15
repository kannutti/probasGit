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
		
		
		String texto = "Primer enlace: '/fileID_23543/fiscID_178' meto aquí más texto y más cosas. segundo enlace: href='/fileID_5643/fiscID_1' y más cosas...";
		String regex = "/fileID_(\\d+)/fiscID_(\\d+)";
		String textoNew = texto.replaceAll(regex, "javascript:abrirModoLectura($1,$2);");
		
		System.out.println("Texto original: " + texto);
		System.out.println("Texto sustituido: " + textoNew);
		
		

	}

}
