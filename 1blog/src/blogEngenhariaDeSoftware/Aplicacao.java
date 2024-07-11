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
	    Scanner scanner = new Scanner(System.in);
	    
	    while (true) {
	        if (usuarios.isEmpty()) {
	            menuCriaUsuario();
	            break;
	        }
	        
	        System.out.println("Possui usuário? s/n");
	        String resposta = scanner.nextLine();
	        
	        if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
	            System.out.println("Insira o seu e-mail de usuário:");
	            String emailUsuario = scanner.nextLine();
	            
	            boolean usuarioEncontrado = false;
	            for (Usuario usuario : getUsuarios()) {
	                if (usuario.getEmail().equals(emailUsuario)) {
	                    menuUsuario(usuario);
	                    usuarioEncontrado = true;
	                    break;
	                }
	            }
	            
	            if (!usuarioEncontrado) {
	                System.out.println("Usuário não encontrado.");
	            }
	        } else if (resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("nao")) {
	            menuCriaUsuario();
	            break;
	        } else {
	            System.out.println("Resposta inválida. Por favor, responda com 's' ou 'n'.");
	        }
	    }
	    scanner.close();
	}
	
	public void menuUsuario(Usuario usuario) {    

		System.out.println("----------------------------------------------------------");
		System.out.println("------------------  MENU DE OPÇÕES  ----------------------");
		System.out.println("USUARIO LOGADO: " + usuario.getNome());
		System.out.println("E-MAL DO USUARIO: " + usuario.getEmail() + "\n");
		System.out.println("1. CRIAR USUARIO                                         |");
		System.out.println("2. CRIAR BLOG                                            |");
		System.out.println("3. CRIAR NOTA P/ BLOG                                    |");
		System.out.println("4. VER NOTAS DE BLOG                                     |");
		System.out.println("5. CRIAR COMENTARIO PARA NOTA                            |");
		System.out.println("6. TROCAR DE USUARIO                                     |");
		System.out.println("7. REMOVER COMENTARIO                                    |");
		System.out.println("8. FECHAR                                                |");
		System.out.println("--------------------------------------------------------- ");
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
            	criaComentarioNota(usuario);
                break;
                
            case "6":
            	trocaUsuario(usuario);
                break;
                
            case "7":
            	removeComentario(usuario);
                break;
                
            case "8":
            	System.out.println("Aplcação encerrada.");
            	if (scanner.hasNextLine()) {
        		    scanner.nextLine();
        		}
            	break;                
            default:
                System.out.println("Opção inválida!");
		}
		scanner.close();
	}

	public void voltaAoMenu(Usuario usuario) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIr para o menu? s/n \n");
        String resposta = scanner.nextLine();
        if (resposta.equals("s") || resposta.equals("sim")) {
        	menuUsuario(usuario);
        } else if ((resposta.equals("n") || resposta.equals("não") || resposta.equals("nao"))) {
        	System.out.println("Aplcação encerrada.");
        } else {
        	System.out.println("Resposta inválida. Por favor, responda com 's' ou 'n'.");
        	voltaAoMenu(usuario);
        }
        scanner.close();
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
	        if (scanner.hasNextInt()) {
	            int numeroBlog = scanner.nextInt();
	            
	            scanner.nextLine();

	            if (numeroBlog < 1 || numeroBlog > usuario.getBlogs().size()) {
	                System.out.println("Opção não identificada");
	                voltaAoMenu(usuario);
	                scanner.close();
	                return;
	            }
	            Blog blogSelecionado = usuario.getBlogs().get(numeroBlog - 1);
	            System.out.println("Escreva uma nota para o blog " + blogSelecionado.getTitulo() + ": ");
	            String novaNota = scanner.nextLine();
	            Nota nota = new Nota(novaNota, blogSelecionado, new Date(), usuario);
	            blogSelecionado.adicionarNota(nota, usuario);
	            nota.getNota();
	            voltaAoMenu(usuario);
	        } else {
	            System.out.println("Opção inválida. Por favor, selecione um número válido.");
	            voltaAoMenu(usuario);
	        }
	        scanner.close();
	    }
	}

	// 4. VER NOTAS DE BLOG
    public void lerConteudo(Usuario usuario) {
    	
    	if (getBlogs().isEmpty()) {
    		System.out.println("Não existem Blogs.");
    		voltaAoMenu(usuario);
    		return;
    	} else {
        	for (Blog blog : getBlogs()) {
        		System.out.println("------------ NOTAS DO BLOG ( " + blog.getTitulo() + " ) ------------");
        		for (Nota nota : blog.getNotas()) {
	        		System.out.print("* \n");
	        		nota.getNota();
	        		System.out.print("----------------------------------------------------------");
	        		System.out.print("\n");
	        	}
        	}
    	}
    	voltaAoMenu(usuario);
    }
    
	// 5. CRIAR COMENTARIO PARA NOTA
    private void criaComentarioNota(Usuario usuario) {
        if (getBlogs().isEmpty()) {
            System.out.println("Não existem Blogs.");
            voltaAoMenu(usuario);
            return;
        } else {
            int numero = 1;
            int numero2 = 1;
            Boolean possuiAlgumaNota = false;
            for (Blog blog : getBlogs()) {
                if (blog.getNotas().isEmpty()) {
                    System.out.println(" -  " + blog.getTitulo() + " - NÃO POSSUI NOTAS.\n");
                    continue;
                } else {
                	possuiAlgumaNota = true;
                    System.out.println(numero + ". " + blog.getTitulo() + " - NOTAS:\n");
                    for (Nota nota : blog.getNotas()) {
                        System.out.println(" --> " + numero + "." + numero2 + " <-- Blog ( " + blog.getTitulo() + " ) - NOTAS: ");
                        nota.getNota();
                        numero2++;
                    }
                    System.out.println("----------------------------------------------------------\n");
                }
                numero++;
            }
            if (possuiAlgumaNota == false) {
            	System.out.println("Blogs sem conteúdo");
            	voltaAoMenu(usuario);
            }
            
            System.out.println("Digite o número da nota que deseja comentar no formato 'numero.numero' ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) { // Verifica se há uma próxima linha disponível
                String numeroSelecionado = scanner.nextLine();

                char primeiro = numeroSelecionado.charAt(0);
                char segundo = numeroSelecionado.charAt(2);

                int primeiroInt = primeiro - '0';
                int segundoInt = segundo - '0';
                if (numeroSelecionado.equals(primeiro + "." + segundo)) {
                    System.out.println("Você selecionou a nota " + primeiroInt + "." + segundoInt);
                    getBlogs().get(primeiroInt - 1).getNotas().get(segundoInt - 1).getNota();
                    
                	System.out.println("----------------------------------------------------------\nAdicione um comentário:");
                    if (scanner.hasNextLine()) {
                        String comentarioNota = scanner.nextLine();

                        Comentario comentario = new Comentario(comentarioNota, getBlogs().get(primeiroInt - 1), new Date(), usuario);
                        getBlogs().get(primeiroInt - 1).getNotas().get(segundoInt - 1).adicionarComentario(comentario, usuario);

                        getBlogs().get(primeiroInt - 1).getNotas().get(segundoInt - 1).getNota();
                    } else {
                        System.out.println("Nenhuma entrada encontrada para o comentário.");
                    }
                    
                    
                } else {
                    System.out.println("Opção inválida. Por favor, selecione um número válido.");
                }
                
            } else {
                System.out.println("Nenhuma entrada encontrada para o número da nota.");
            }
            voltaAoMenu(usuario);
            scanner.close();
            return;
        }
    }

    // 6. TROCAR DE USUARIO
    private void trocaUsuario(Usuario usuario) {
    	
    	System.out.println("Digite o e-mail de seu usuário:");
    	Scanner scanner = new Scanner(System.in);
    	String emailDigitado = scanner.nextLine();
    	
    	for (Usuario usuarioAtual : getUsuarios()) {
    		if (usuarioAtual.getEmail().equals(emailDigitado)) {
    			System.out.println("Login realizado com sucesso.");
    			menuUsuario(usuarioAtual);
    		}
    	}
    	System.out.println("Usuario não encontrado.");
    	voltaAoMenu(usuario);
    	scanner.close();
    }

    // 7. REMOVER COMENTARIO
    private void removeComentario(Usuario usuario) {
    	if (getBlogs().isEmpty()) {
            System.out.println("Não existem Blogs para remoção de um comentario.");
            voltaAoMenu(usuario);
            return;
        } else {
            int numero = 1;
            int numero2 = 1;
            Boolean possuiAlgumaNota = false;
            for (Blog blog : usuario.getBlogs()) {
                if (blog.getNotas().isEmpty()) {
                    System.out.println(" Blog ( " + blog.getTitulo() + " ) - NÃO POSSUI NOTAS.\n");
                    continue;
                } else {
                	possuiAlgumaNota = true;
                    System.out.println(numero + ". " + blog.getTitulo() + " - NOTAS:\n");
                    for (Nota nota : blog.getNotas()) {
                        System.out.println(" --> " + numero + "." + numero2 + " <-- Blog ( " + blog.getTitulo() + " ) - NOTAS: ");
                        nota.getNota();
                        numero2++;
                    }
                    System.out.println("----------------------------------------------------------\n");
                }
                numero++;
            }
            
            if (possuiAlgumaNota == false) {
            	System.out.println("Você não pode remover esse tipo de nota.");
            	voltaAoMenu(usuario);
            }
            
            System.out.println("Digite o número da nota que deseja remover o comentário no formato 'numero.numero' ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) { // Verifica se há uma próxima linha disponível
                String numeroSelecionado = scanner.nextLine();

                char primeiro = numeroSelecionado.charAt(0);
                char segundo = numeroSelecionado.charAt(2);

                int primeiroInt = primeiro - '0';
                int segundoInt = segundo - '0';
                if (numeroSelecionado.equals(primeiro + "." + segundo)) {
                    System.out.println("Você selecionou a nota " + primeiroInt + "." + segundoInt);
                    usuario.getBlogs().get(primeiroInt - 1).getNotas().get(segundoInt - 1).getNota();
                    
                    if (getBlogs().get(primeiroInt - 1).getNotas().get(segundoInt - 1).getComentarios().isEmpty()) {
                        voltaAoMenu(usuario);
                    } else {
                    	System.out.println("----------------------------------------------------------\n");
                        
                        System.out.println("Selecione um comentario para remover");
                        int idComentario = scanner.nextInt();
                        
                        getBlogs().get(primeiroInt - 1).getNotas().get(segundoInt - 1).removerComentario(idComentario);
                        usuario.getBlogs().get(primeiroInt - 1).getNotas().get(segundoInt - 1).getNota();
                        voltaAoMenu(usuario);
                    }
                } else {
                    System.out.println("Opção inválida. Por favor, selecione um número válido.");
                }
            } else {
                System.out.println("Nenhuma entrada encontrada para o número da nota.");
            }
            scanner.close();
            voltaAoMenu(usuario);
            return;
        }
    }
	
	public Blog criaBlog(String titulo, Date date, Usuario usuario) {
		Blog novoBlog = new Blog(titulo, new Date(), usuario);
	    adicionarBlogAplicacao(novoBlog);
	    usuario.adicionarBlogUsuario(novoBlog);
	    System.out.println("Blog criado com sucesso! Informações:");
	    novoBlog.getBlog();
	    return novoBlog;
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
    
    public List<Blog> getBlogs() {
    	return AllBlogs;
    }
    
    public List<Usuario> getUsuarios() {
    	return usuarios;
    }

}
