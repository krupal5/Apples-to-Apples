package com.ka.aafgame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PlayerClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the Game");
			int portNumber = Integer.parseInt(args[0]);
			try {
				ServerSocket serverSocket = new ServerSocket(portNumber);
				Socket clientSocket = serverSocket.accept();
			    PrintWriter out =
			        new PrintWriter(clientSocket.getOutputStream(), true);
			    BufferedReader in = new BufferedReader(
			        new InputStreamReader(clientSocket.getInputStream()));
			}catch{
				
			}
	}
	
}