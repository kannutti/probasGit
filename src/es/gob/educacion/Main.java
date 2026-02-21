package es.gob.educacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String prueba = "<p>Link antiguo: <a href=\"fiscalicexlink:?p=|https://local-demo.tcu.es:8443/webdav2/IDFICHERO_26257/papel5áéàùü -_(ñÑ).temp\">[papel5.docx]</a></p>";
		//String regexComplemento = "fiscalicexlink:\\?p=\\|https://[a-zA-Z\\.\\-]+:[\\d]+/webdav2/IDFICHERO_(\\d+)/[^\"]*";
		//^[\w\-. ]+\.(txt|jpg|pdf)$ nombre de fichero y extensión
		String regexComplemento = "fiscalicexlink:\\?p=\\|https://[\\w\\.\\-]+:[\\d]+/webdav2/IDFICHERO_(\\d+)/[^\"]*\\.(?i)(?:docx|doc|xls)";
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Texto inicial: " + prueba);
		//System.out.println("Texto Reemplazado: " + prueba.replaceAll(regexComplemento, "javascript:abrirFicheroDesdeEditorHTML($1,178);"));
		System.out.println("Texto Reempl.: " + prueba.replaceAll(regexComplemento, "javascript:abrirFicheroDesdeEditorHTML($1,178);"));
		

		System.out.println("-------------------------------------------------------------------------------------------");
		
		String prueba2 = "<p>Link antiguo: <a href=\"fiscalicexlink:?p=|https://local-demo.tcu.es:8443/webdav2/IDFICHERO_26257/papel5.docx\" rel=\"noopener noreferrer\">[papel5.docx]</a></p>";
		
		
		texto = "<p>Link antiguo: <a href=\"fiscalicexlink:?p=|https://local-demo.tcu.es:8443/webdav2/tecnico/fiscalizacion/5/5.1/5.1.3/papel5.docx\" rel=\"noopener noreferrer\">[papel5.docx]</a></p><p>Link antiguo: <a href=\"fiscalicexlink:?p=|https://local-demo.tcu.es:8443/webdav2/tecnico/fiscalizacion/5/5.1/papel6.docx\" rel=\"noopener noreferrer\">[papel6.docx]</a></p>";
	    //String buscar = "fiscalicexlink.*$\" rel";
		//String buscar = "fiscalicexlink:\\?p=\\|https://[\\w\\.\\-]+:[\\d]+/webdav2/[^\"]*\\.docx(?=\" rel)";
        String buscar = "fiscalicexlink:\\?p=\\|https://[\\w\\.\\-]+:[\\d]+/webdav2/[^\"]*\\.docx";
        		
	    // Crear el patrón (Pattern)
	    Pattern pattern = Pattern.compile(buscar);
	    
	    // Crear el buscador (Matcher) sobre el texto
	    Matcher matcher = pattern.matcher(texto);

	    String enlace;
	    String ruta;
	    String fichero;	    
	    
	    // Bucle para encontrar todas las apariciones
	    while (matcher.find()) {
	        
	    	enlace = matcher.group();	    	
	    	ruta = enlace.substring(enlace.indexOf("webdav2") + 7, enlace.lastIndexOf("/"));
	    	fichero = enlace.substring(enlace.lastIndexOf("/") + 1);
	    	texto = texto.replace(enlace, "javascript:abrirFicheroDesdeEditorHTML(5433,178,1);");	    	    			
	    		    	
	    	System.out.println("Coincidencia: " + matcher.group() + " --> Inicio: " + matcher.start() + " ** Fin: " + matcher.end());
	    	System.out.println("Enlace Fiscalicex: " + enlace);
	        System.out.println("Ruta extraída: " + ruta);
	        System.out.println("Fichero extraído: " + fichero);        
	        System.out.println("Texto después de reemplazo parcial: " + texto);
	        
	        System.out.println("-------------------------------------------------------------------------------------------");
	        
	    }
		
		
		
		
		
		
	}

}
