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
		
		
		//String prueba = "<p>Esto es una prueba.</p><p><br></p><p><br></p><table style=\"border: 1.0px solid rgb(0,0,0);\"><tbody><tr><td style='border: 1px solid black; padding: 5px;'><strong><em><u>Segunda en negrita</u></em></strong></td></tr></tbody></table><p><br></p><p>Link antiguo: <a href=\"fiscalicexlink:?p=|https://local.tcu.es:8443/webdav2/IDFICHERO_26257/papel5.docx\" rel=\"noopener noreferrer\">[papel5.docx]</a></p>";
		String prueba = "<p>Link antiguo: <a href=\"fiscalicexlink:?p=|https://local.tcu.es:8443/webdav2/IDFICHERO_26257/papel5.docx\">[papel5.docx]</a></p>";
		//String regexComplemento = "fiscalicexlink:\\?p=|^https?://([^/]+)/webdav2/IDFICHERO_(\\d+)/(^/)+\\\"";
		String regexComplemento = "fiscalicexlink:\\?p=\\|https://[a-zA-Z\\.]+:[\\d]+/webdav2/IDFICHERO_(\\d+)/[^\"]*";
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Texto inicial: " + prueba);
		//System.out.println("Texto Reemplazado: " + prueba.replaceAll(regexComplemento, "javascript:abrirFicheroDesdeEditorHTML($1,178);"));
		System.out.println("Texto Reemplazado: " + prueba.replaceAll(regexComplemento, "javascript:abrirFicheroDesdeEditorHTML($1,178);"));
		

	}

}
