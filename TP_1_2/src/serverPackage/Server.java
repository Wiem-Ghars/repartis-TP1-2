package serverPackage;

import java.io.IOException;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		try {
			//création de ServerSocket
			ServerSocket ss =new ServerSocket(123);
			System.out.println("je suis un serveur en attente de la connexion");
			//création de nouveau socket et accepter une connexion pour communiquer avec le client
			Socket s=ss.accept();
			System.out.println("un client est connecté");
			//création de InputStream pour lire les données depuis ss
			InputStream is=s.getInputStream();
			//création de OutputStream pour ecrire les données vers ss
			OutputStream os =s.getOutputStream();
			System.out.println("un client est connecte");
			System.out.println("j'attend un nombre");
			int nb=is.read();
			int res=nb*5;
			System.out.println("la reponse");
			os.write(res);
			//fermeture de ServerSocket			
			ss.close();
	}catch(IOException e)
		{e.printStackTrace();}
	}
}
