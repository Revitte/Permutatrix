package com.permutatrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.permutatrix.infrastructure.entitys.Tarefa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.permutatrix.infrastructure.entitys.Usuario;

@SpringBootApplication
public class PermutatrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PermutatrixApplication.class, args);

		/* Essa parte do codigo foi desenvolvida para
		nova funcionaria que ajuda-ra na organizacao da casa */

		// Criando um usuario Governanta
		Usuario governanta = new Usuario();
		Tarefa tarefas = new Tarefa();
		Scanner sn = new Scanner(System.in);

		System.out.println("Cadastre seu nome de Usuario: ");
		governanta.setNome(sn.nextLine());

		System.out.println("Cadastre um e-mail: ");
		governanta.setEmail(sn.nextLine());

		System.out.println("Cadastre uma senha: ");
		governanta.setSenha(sn.nextLine());

		System.out.println("Usuaria cadastrada com sucesso");
		System.out.println("Nome: " + governanta.getNome());
		System.out.println("E-mail: "+ governanta.getEmail());
		System.out.println("Senha cadastrada");

		ArrayList<String> tarefasDaCasa = new ArrayList<String>();

		tarefasDaCasa.add("Ilustrar Moveis");
		tarefasDaCasa.add("Lavar Louça");
		tarefasDaCasa.add("Lavar Roupa");
		tarefasDaCasa.add("Varrer a Casa");
		tarefasDaCasa.add("Passar Pano na Casa");

		HashMap<String, Boolean> tarefasDaGovernanta = new HashMap<>();

		System.out.println("Esseas são as tarefas da casa: ");
		for(int i = 0; i< tarefasDaCasa.size(); i++){
			System.out.println((i + 1) + " - " + tarefasDaCasa.get(i));
		}

		System.out.println("Atribuidas para " + governanta.getNome());
		sn.close();
	}
}
