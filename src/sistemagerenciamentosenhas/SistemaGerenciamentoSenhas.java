package sistemagerenciamentosenhas;

import java.util.Scanner;
import model.EntidadesDominio.ConfiguracaoForcaSenha;
import model.EntidadesDominio.DadosAutenticacaoUsuario;
import model.EntidadesDominio.Sistema;
import model.EntidadesDominio.Telefone;
import model.EntidadesDominio.Usuario;

/**
 * @author Gabriel Frederico Barbosa
 */


public class SistemaGerenciamentoSenhas {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seja bem-vindo(a) ao sistema de gestão de senhas.");
        
        System.out.println("Qual o seu usuário?");
        
        String usuario = scanner.next();
        
        System.out.println("Qual a sua senha?");
        
        String senha = scanner.next();
        
        scanner.close();
        
        if (verificaAdmin()){
            System.out.println("Seja bem-vindo(a)! Você é um administrador.");
            exibirMenuAdmin();
        }
        else{
            exibirMenuUsuarioComum(scanner);
        }
        
    }
        
    public static void exibirMenuAdmin(){
        int opcao;
        
        Scanner scanner = new Scanner(System.in);      
                
        do
        {
            System.out.println("Selecione uma das opções seguintes referentes ao que deseja fazer:");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    //Gerir Usuarios
                    System.out.println("Ótimo, você deseja gerir usuários.");
                    exibirMenuGerirUsuarios(scanner);
                case 2:
                    //Gerir Sistemas
                default:
                    //Opção Inexistente!
            }
         
        }while(opcao != 0);
        
        scanner.close();
    }
    
    public static void exibirMenuUsuarioComum(Scanner scanner){
        
    }

    private static boolean verificaAdmin() {
        return false;
    }
    
    public static void exibirMenuGerirUsuarios(Scanner scanner){
        int opcao;
        String nome;
        
         do
        {
            System.out.println("O que deseja fazer?");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    //Cadastrar Usuário
                    System.out.println("Por favor, informe os dados seguintes para cadastrar um novo usuário:");
                    System.out.println("Nome: ");
                    nome = scanner.next();
                    System.out.println("E-mail: ");
                    String email = scanner.next();
                    Usuario usuario = new Usuario(nome, email); 
                    
                    informeTelefones(scanner, usuario);
                    
                    informeDadosAutenticacao(scanner, usuario);
                    
                    System.out.println("Usuario adicionado com sucesso!");
                case 2:
                    //Desativar Usuário
                    System.out.println("Informe o nome do usuário que deseja desativar:");
                    
                    nome = scanner.next();                  
                    
                case 3:
                    //Listar Usuários
                default:
                    //Opção Inexistente!
                    System.out.println("Opção inexistente!");
            }
         
        }while(opcao != 4);
    }

    private static void informeTelefones(Scanner scanner, Usuario usuario) {
        String descricao;
        String numero;
        int codOperadora;
        
        System.out.println("Quantos telefones deseja cadastrar para este usuario?");
        int numeroTelefones = scanner.nextInt();
            
        for (int i=1; i<=numeroTelefones; i++){
            System.out.println("Digite a descricao do primeiro telefone: ");
            descricao = scanner.next();
            System.out.println("Digite o numero do " + i + " telefone: ");
            numero = scanner.next();
            System.out.println("Digite o codigo de operadora do " + i + " telefone: ");
            codOperadora = scanner.nextInt();
            Telefone telefone = new Telefone(numero, codOperadora, descricao);
            usuario.addTelefone(telefone); 
        } 
    }

    private static void informeDadosAutenticacao(Scanner scanner, Usuario usuario) {
        String login;
        String senha;
        
        System.out.println("Qual login deseja utilizar para acessar este sistema?");
        login = scanner.next();
        
        System.out.println("Digite uma senha: ");
        senha = scanner.next();
        
        ConfiguracaoForcaSenha confgForcaSenha = new ConfiguracaoForcaSenha(5,1,1,1,1);
        
        Sistema sistema = new Sistema("SistemaGerenciamentoSenhas", confgForcaSenha);
        
        DadosAutenticacaoUsuario dadosAutenticacao = new DadosAutenticacaoUsuario(login, senha, sistema);
        
        usuario.addDadosAutenticacao(dadosAutenticacao);        
    }
    
    public void exibirMenuGerirSistemas(){
        
    }
    
    public void exibir(){
        
    }
    
}
