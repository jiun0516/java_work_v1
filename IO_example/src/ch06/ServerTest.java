package ch06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	ServerSocket serverSocket;
	Socket socket;
	BufferedReader reader;
	BufferedWriter bufferedWriter;
	BufferedReader keyboardReader;

	public ServerTest() {
		initData();
	}

	private void initData() {
		try {
			serverSocket = new ServerSocket(10000);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			keyboardReader = new BufferedReader(new InputStreamReader(System.in));

			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			WriterThread writerThread = new WriterThread();
			
			Thread thread = new Thread(writerThread);
			thread.start();
			
			while (true) {
				String msg = "클라이언트 >>> " + reader.readLine() + "\n";
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of initData

	// 내부 클래스 생성
	class WriterThread implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					String serverMsg = "서버 : " + keyboardReader.readLine();
					System.out.println("서버가 작성한 문구 확인 : " + serverMsg);

					bufferedWriter.write(serverMsg + "\n");
					bufferedWriter.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		new ServerTest();
	}
}
