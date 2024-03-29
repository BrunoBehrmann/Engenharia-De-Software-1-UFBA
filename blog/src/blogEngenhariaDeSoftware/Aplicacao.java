package blogEngenhariaDeSoftware;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	private List<Blog> AllBlogs;
	private List<Usuario> usuarios;
	
	public Aplicacao() {
        this.AllBlogs = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
	
	public void iniciar() {
		if (usuarios.isEmpty()) {
			menuCriaUsuario();
			return;
		}
		System.out.println("Possui usuário? s/n");
		Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        
        if (resposta.equals("s") || resposta.equals("sim")) {
        	System.out.println("insira o seu e-mail do usuário.");
        	System.out.println("e-mail: ");
        	Scanner scanner2 = new Scanner(System.in);
            String resposta2 = scanner2.nextLine();
            for (Usuario usuario: getUsuarios()) {
            	if (usuario.getEmail().equals(resposta2)) {
            		menuUsuario(usuario);
            		scanner2.close();
            		return;
            	} else {
            		System.out.println("Usuário não encontrado.");
            		iniciar();
            		scanner2.close();
            		return;
            	}
            }
            scanner2.close();
        } else if (resposta.equals("n") || resposta.equals("nao") || resposta.equals("nao")) {
            menuCriaUsuario();
            scanner.close();
            return;
        } else {
            System.out.println("Resposta inválida. Por favor, responda com 's' ou 'n'.");
            iniciar();
            scanner.close();
            return;
        }scanner.close();
	}
	
	// 1. CRIAR USUARIO
	public void menuCriaUsuario() {
		System.out.println("Digite o nome do seu novo usuario: ");
		Scanner scanner = new Scanner(System.in);
		String nomeNovoUsuario = scanner.nextLine();
		
		System.out.println("Digite o seu e-mail: ");
		String emailNovoUsuario = scanner.nextLine();
		
		Usuario usuario = new Usuario(nomeNovoUsuario, emailNovoUsuario);
		
		adicionarUsuario(usuario);		
		System.out.println("\n\nNovo cadastrado.");
		System.out.println("nome: " + usuario.getNome() + "  email: " + usuario.getEmail());
		voltaAoMenu(usuario);
		scanner.close();
		return;
	}
	
	public void menuUsuario(Usuario usuario) {    

		System.out.println("----------------------------------------------------------");
		System.out.println("------------------  MENU DE OPÇÕES  ----------------------");
		System.out.println("1. CRIAR USUARIO");
		System.out.println("2. CRIAR BLOG");
		System.out.println("3. CRIAR NOTA P/ BLOG");
		System.out.println("4. VER NOTAS DE BLOG");
		System.out.println("5. CRIAR COMENTÁRIO PARA NOTA");
		System.out.println("OPÇÕES DE POSSE:");
		System.out.println("6. REMOVER BLOG");
		System.out.println("7. REMOVER COMENTÁRIO");
		System.out.println("8. FECHAR");
		
		Scanner scanner = new Scanner(System.in);
		String opcao = scanner.nextLine();
		switch (opcao) {
			case "1" :
				menuCriaUsuario();
				break;
			case "2":
				criaNovoBlog(usuario);
                break;
                
            case "3":
            	criarNota(usuario);
                break;
                
            case "4":
            	lerConteudo(usuario);
                break;
                
            case "5":
                break;
                
            case "6":
                break;
                
            case "7":
                break;
                
            case "8":
            	System.out.println("Aplcação encerrada.");
                break;
                
            default:
                System.out.println("Opção inválida!");
		
		}
		scanner.close();
		return;
	}
	
	public void voltaAoMenu(Usuario usuario) {
		System.out.println("\nIr para o menu? s/n \n");
		Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        if (resposta.equals("s") || resposta.equals("sim")) {
        	menuUsuario(usuario);
            scanner.close();
        } else if ((resposta.equals("n") || resposta.equals("não") || resposta.equals("nao"))) {
        	System.out.println("Aplcação encerrada.");
            scanner.close();
            return;
        } else {
        	System.out.println("Resposta inválida. Por favor, responda com 's' ou 'n'.");
        	voltaAoMenu(usuario);
            scanner.close();
            return;
        }
        scanner.close();
	}
	
	public Blog criaBlog(String titulo, Date date, Usuario usuario) {
		Blog novoBlog = new Blog(titulo, new Date(), usuario);
	    adicionarBlogAplicacao(novoBlog);
	    usuario.adicionarBlogUsuario(novoBlog);
	    System.out.println("Blog criado com sucesso! Informações:");
	    novoBlog.getBlog();
	    return novoBlog;
	}
	
	// 2. CRIAR BLOG
	public void criaNovoBlog(Usuario usuario) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Escolha o título do seu blog: ");
	    String tituloNovoBlog = scanner.nextLine();
	    criaBlog(tituloNovoBlog, new Date(), usuario);
	    
	    voltaAoMenu(usuario);
	    scanner.close();
	}
	
	// 3. CRIAR NOTA P/ BLOG
	public void criarNota(Usuario usuario) {
	    if (usuario.getBlogs().isEmpty()) {
	        System.out.println("Você ainda não possui um Blog para criar uma nova nota.");
	        voltaAoMenu(usuario);
	        return;
	    } else {
	        System.out.println("Escolha o Blog para criar uma nova nota: ");
	        int numero = 1;
	        for (Blog blog : usuario.getBlogs()) {
	            System.out.println(numero + ". " + blog.getTitulo());
	            numero++;
	        }
	        Scanner scanner = new Scanner(System.in);
	        int numeroBlog = scanner.nextInt();
	        
	        scanner.nextLine();

	        if (numeroBlog < 1 || numeroBlog > numero) {
	            System.out.println("Opção não identificada");
	            voltaAoMenu(usuario);
	            scanner.close();
	            return;
	        }
	        int number = 1;
	        for (Blog blog : usuario.getBlogs()) {
	            if (number == numeroBlog) {
	                System.out.println("Escreva uma nota para o blog " + blog.getTitulo() + ": ");
	                String novaNota = scanner.nextLine();
	                Nota nota = new Nota(novaNota, blog, new Date(), usuario);
	                blog.adicionarNota(nota);
	                System.out.println("Nova nota criada com sucesso. Informações:");
	                nota.getNota();
	                voltaAoMenu(usuario);
	                break;
	            } else {
	                number++;
	            }
	        }
	        scanner.close();
	    }
	}

	
	// 4. VER NOTAS DE BLOG
    public void lerConteudo(Usuario usuario) {
    	
    	if (usuario.getBlogs().isEmpty()) {
    		System.out.println("Você ainda não possuí um Blog para criar uma nova nota.");
    		voltaAoMenu(usuario);
    		return;
    	} else {
        	for (Blog blog : usuario.getBlogs()) {
        		System.out.println("------------ NOTAS DO BLOG ( " + blog.getTitulo() + " ) ------------");
        		for (Nota nota : blog.getNota()) {
	        		System.out.print("* \n");
	        		nota.getNota();
	        		System.out.print("----------------------------------------------------------");
	        		System.out.print("\n");
	        	}
        	}
    	}
    	voltaAoMenu(usuario);
    }

    public void adicionarBlogAplicacao(Blog blog) {
        AllBlogs.add(blog);
    }

    public void removerBlogAplicacao(Blog blog) {
        AllBlogs.remove(blog);
    }
    
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void criarComentario(Nota nota, Comentario comentario) {
        // Implementação para criar um comentário em uma nota
    }

    public void removerConteudo(Blog blog, Conteudo conteudo) {
        // Implementação para remover conteúdo de um blog
    }
    
    public List<Blog> getBlogs() {
    	return AllBlogs;
    }
    
    public List<Usuario> getUsuarios() {
    	return usuarios;
    }

}
