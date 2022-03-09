package br.com.dio.diopoo.main;

import java.time.LocalDate;

import br.com.dio.diopoo.dominio.Curso;
import br.com.dio.diopoo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Curso JS");
		curso1.setDescricao("Curso de JS Básico");
		curso1.setCargaHoraria(4);
		
		curso2.setTitulo("Curso Java");
		curso2.setDescricao("Curso de Java Básico");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Mentoria para alunos do curso Java");
		mentoria.setData(LocalDate.now());
				
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	}
}
