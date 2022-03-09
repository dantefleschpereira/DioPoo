package br.com.dio.diopoo.main;

import java.time.LocalDate;

import br.com.dio.diopoo.dominio.Curso;
import br.com.dio.diopoo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso("Curso JS", "Curso de JS B�sico", 4);
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso de Java B�sico");
		curso1.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria("Mentoria de Java", "Mentoria para alunos do curso Java", LocalDate.now());
		
				
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);


	}

}
