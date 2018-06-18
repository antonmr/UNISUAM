package server;

import java.rmi.Naming;
import shared.GameManager;

public class Server {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("\nUse:\t java Server objname\n");
			System.err.println("Use o comando javac Server objname");
			System.err.println("Pois o objeto está passado por parâmetro para inicializar o servidor.");
			System.exit(1);
		}
		
		try {
			GameManager manager = new GameManager();
			String objname = "//localhost/" + args[0];
			
			System.out.println("Registering: " + objname + "...");
			Naming.rebind(objname, manager);
			System.out.println("Servidor no ar!");
		} catch(Exception e) {
			System.err.println("Houve alguma problema!" + e);
			e.printStackTrace();
			System.exit(2);
		}
		
		System.out.println("Aguardando inicialização do objeto...");
	}
}
