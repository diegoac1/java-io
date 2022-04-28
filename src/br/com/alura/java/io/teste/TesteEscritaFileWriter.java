package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum imperdiet sed sem eget pretium.");
		bw.write(System.lineSeparator());

		bw.write("\r\n");
		bw.write("Suspendisse eget pulvinar elit, tempus faucibus sem. Maecenas erat dolor, pharetra non viverra faucibus,");
		bw.close();
	}
	
	

}
