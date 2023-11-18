package TelaLoginScreen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LoginJUnit{
    
     public static void main(String[] args) {
     }

          @Test
            public void testLoginSucesso() {

                LoginScreen loginScreen = new LoginScreen();

                boolean resultado = loginScreen.fazerLogin("Rodrigo", "CR7better");

                assertTrue(resultado);
            }

            @Test
            public void testLoginFalha() {

                LoginScreen loginScreen = new LoginScreen();

                boolean resultado = loginScreen.fazerLogin("Atacante", "Messibetter");

                assertFalse(resultado);
            }
            @Test
        	public void testAddUser() {
        		LoginScreen loginScreen = new LoginScreen();
        		loginScreen.addUser("ozil", "camisa10");
        		assertTrue(loginScreen.login("ozil", "camisa10"));
        	}
        }
}