package br.com.dio.diopoo.main;

import java.time.LocalDate;

import br.com.dio.diopoo.dominio.BootCamp;
import br.com.dio.diopoo.dominio.Curso;
import br.com.dio.diopoo.dominio.Dev;
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
				
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao: Bootcamp para desenvolvedores Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Camila");
		dev1.inscreverBootCamp(bootcamp);
		
		Dev dev2 = new Dev();
		dev2.setNome("Paulo");
		dev2.inscreverBootCamp(bootcamp);
		
		System.out.println("Conteudos inscristos Camila: " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos inscristos Camila: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos concluidos Camila: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println();
		
		System.out.println("Conteudos inscritos Paulo: " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteudos inscritos Paulo: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos concluidos Paulo: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}
}
