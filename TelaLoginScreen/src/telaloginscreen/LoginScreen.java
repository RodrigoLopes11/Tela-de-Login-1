package TelaLoginScreen;
/**
 * Classe simples para autenticação de usuários, simulando uma base de dados de usuários.
 */
public class LoginScreen {
	private Map<String, String> userDatabase;

	/**
	 * Constrói uma nova instância de LoginScreen e inicializa a base de dados de usuários.
	 * Para exemplo, pré-carrega a base de dados com alguns usuários de amostra.
	 */
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("Rodrigo", "CR7better");
		userDatabase.put("Atacante", "Messibetter"); // Teste de autenticação
	}
	
	 // @param username é correspondente ao valor do usuário que tenta logar.
	 // @param password é corresponde a senha que foi inserida para o login.
	 // @return {@code true} se a autenticação for aceita, {@code false} caso seja recusada.
	 
	public boolean login(String username, String password) {
		
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if(storedPassword.equals(password)) {
				return true; // Autenticação sem falhas e com sucesso.
			}
		}
		return false; // Autenticação falha.
		/**
		 * Adiciona um novo usuário à base de dados de usuários. Por favor note que esse método não é
		 * recomendado para ser utilizado em ambiente de produção, uma vez que não dispõe de medidas
		 * de segurança adequadas.
		 * 
		 * @param newuser é correspondente a um novo valor de usuário.
		 * @param newpassword é corresponde a nova senha para login.
		 */
		public void addUser(String newuser, String newpassword) {
			userDatabase.put(newuser,newpassword);
		}
}
	