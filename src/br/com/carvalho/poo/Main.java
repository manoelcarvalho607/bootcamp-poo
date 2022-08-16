package br.com.carvalho.poo;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("curso javascript");
		curso2.setDescricao("Descrição curso javascript");
		curso2.setCargaHoraria(10);
		
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

		
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Manoel");
		dev1.inscreverBootcampo(bootcamp);
		System.out.println("Conteúdos inscritos: " + dev1.getNome() + dev1.getConteudosInscritos());
		
		dev1.progredir();
		dev1.progredir();
		
		System.out.println("-");
		System.out.println("Conteúdos inscritos: " + dev1.getNome() + dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluidos: " + dev1.getNome() + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		
		
		System.out.println("---------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Maria");
		dev2.inscreverBootcampo(bootcamp);
		System.out.println("Conteúdos inscritos: " + dev2.getNome() +  dev2.getConteudosInscritos());
		
		dev2.progredir();
		
		System.out.println("-");
		System.out.println("Conteúdos inscritos: " + dev2.getNome() +  dev2.getConteudosInscritos());
		System.out.println("Conteúdos concluidos: " + dev2.getNome() + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}

}
