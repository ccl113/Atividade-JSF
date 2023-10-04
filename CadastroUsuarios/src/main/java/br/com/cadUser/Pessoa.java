package br.com.cadUser;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<String> nomesCadastrados = new ArrayList<>();

    // Construtor vazio (opcional)
    public Pessoa() {
    }

    // Getter para o atributo "nome"
    public String getNome() {
        return nome;
    }

    // Setter para o atributo "nome"
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo "nomesCadastrados"
    public ArrayList<String> getNomesCadastrados() {
        return nomesCadastrados;
    }

    // Método para cadastrar um nome na lista "nomesCadastrados"
    public void cadastrar() {
        if (nome != null && !nome.isEmpty()) {
            nomesCadastrados.add(nome);
            nome = ""; // Limpa o campo de nome após o cadastro
        }
    }
}
