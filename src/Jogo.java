import java.sql.Time;
import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Jogo{
	private int[][] tabuleiro = new int[4][4];
	public int[][] getTabuleiro() {
		return tabuleiro;
	}

	/* Metodos de get e set de tabuleiro */
	public void setTabuleiro(int[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	private boolean[][] modifica = new boolean[4][4];
	
	/* Construtor da classe */
	public Jogo() {
		criaTabuleiro();			
	}
	
	/* Zera todas as posicoes do tabuleiro */
	public void criaTabuleiro() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				tabuleiro[i][j] = 0;
			}
		}
		
		geraBotaoAleatorio();
		geraBotaoAleatorio();
	}
	
	/* Gera posicoes i e j aleatorias */
	public void geraBotaoAleatorio() {
		
		int posicaoI = geraPosicao();
		int posicaoJ = geraPosicao();
		
		if(tabuleiro[posicaoI][posicaoJ] == 0) {
			tabuleiro[posicaoI][posicaoJ] = geraValor();
		}else {
			geraBotaoAleatorio();
		}
		
	}
	
	/* Transforma todas as posicoes do boolean em falsa */
	public void zeraModifica() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				modifica[i][j] = false;
			}
		}
	}
	
	public void printaTabuleiro() {
		 for(int i = 0; i < 4; i++) {
	 			for(int j = 0; j < 4; j++) {
	 				System.out.print("    "+tabuleiro[i][j]);
	 			}
	 			System.out.println("\n");
	 		}
	}
	
	/* Move peca para cima */
	public void movePecaCima() {
		boolean movimenta = false;
		printaTabuleiro();
		System.out.println("\n");
	
		for(int k = 3; k > 0; k--) {
			for(int i = 0; i < k; i++) {
				for(int j = 0; j < 4; j++) {
					if(tabuleiro[i+1][j] != 0) {
						if(tabuleiro[i][j] != 0) {
							if((tabuleiro[i][j] == tabuleiro[i+1][j]) && (modifica[i][j] != true) && (modifica[i+1][j] != true)) {
								tabuleiro[i][j] = tabuleiro[i][j] + tabuleiro[i+1][j];
								tabuleiro[i+1][j] = 0;
								modifica[i][j] = true;
								movimenta = true;
								
							}
						}else {
							tabuleiro[i][j] = tabuleiro[i+1][j];
							tabuleiro[i+1][j] = 0;
							movimenta = true;
						}
					}
				}
			}
		}
		
		if(movimenta == true) {
			geraBotaoAleatorio();
			movimenta = false;
		}
		
		printaTabuleiro();
		zeraModifica();
	}
	
	/* Move peca para baixo */
	public void movePecaBaixo() {
		boolean movimenta = false;
		printaTabuleiro();
		System.out.println("\n");
		
		for(int k = 0; k < 3; k++) {
			for(int i = 3; i > k; i--) {
				for(int j = 0; j < 4; j++) {
					if(tabuleiro[i-1][j] != 0) {
						if(tabuleiro[i][j] != 0) {
							if((tabuleiro[i][j] == tabuleiro[i-1][j]) && (modifica[i][j] != true) && (modifica[i-1][j] != true)) {
								tabuleiro[i][j] = tabuleiro[i][j] + tabuleiro[i-1][j];
								tabuleiro[i-1][j] = 0;
								modifica[i][j] = true;
								movimenta = true;
								
							}
						}else {
							tabuleiro[i][j] = tabuleiro[i-1][j];
							tabuleiro[i-1][j] = 0;
							movimenta = true;
						}
					}
				}
			}
		}
		
		if(movimenta == true) {
			geraBotaoAleatorio();
			movimenta = false;
		}
		
		printaTabuleiro();
		zeraModifica();

		
	}
	

	/* Move peca para a direita */
	public void movePecaDireita() {
		boolean movimenta = false;
		printaTabuleiro();
		System.out.println("\n");
		
		for(int k = 0; k < 3; k++) {
			for(int i = 0; i < 4; i++) {
				for(int j = 3; j > k; j--) {
					if(tabuleiro[i][j-1] != 0) {
						if(tabuleiro[i][j] != 0) {
							if((tabuleiro[i][j] == tabuleiro[i][j-1]) && (modifica[i][j] != true) && (modifica[i][j-1] != true)) {
								tabuleiro[i][j] = tabuleiro[i][j] + tabuleiro[i][j-1];
								tabuleiro[i][j-1] = 0;
								modifica[i][j] = true;
								movimenta = true;
								
							}
						}else {
							tabuleiro[i][j] = tabuleiro[i][j-1];
							tabuleiro[i][j-1] = 0;
							movimenta = true;
						}
					}
				}
			}
		}
		
		if(movimenta == true) {
			geraBotaoAleatorio();
			movimenta = false;
		}
		
		printaTabuleiro();
		zeraModifica();

	}
	/* Move peca para a esquerda */
	public void movePecaEsquerda() {
		boolean movimenta = false;
		printaTabuleiro();
		System.out.println("\n");
		
		for(int k = 3; k > 0; k--) {
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < k; j++) {
					if(tabuleiro[i][j+1] != 0) {
						if(tabuleiro[i][j] != 0) {
							if((tabuleiro[i][j] == tabuleiro[i][j+1]) && (modifica[i][j] != true) && (modifica[i][j+1] != true)) {
								tabuleiro[i][j] = tabuleiro[i][j] + tabuleiro[i][j+1];
								tabuleiro[i][j+1] = 0;
								modifica[i][j] = true;
								movimenta = true;
								
							}
						}else {
							tabuleiro[i][j] = tabuleiro[i][j+1];
							tabuleiro[i][j+1] = 0;
							movimenta = true;
						}
					}
				}
			}
		}
		
		if(movimenta == true) {
			geraBotaoAleatorio();
			movimenta = false;
		}
		
		printaTabuleiro();
		zeraModifica();

	}
	
	
	/*Define quais numeros vai comecar (2 ou 4) */
	public int geraValor() {
		int numero;
		Date hora = new Date();
		
		if(hora.getTime() % 2 == 0) {
			numero = 2;
		}else {
			numero = 4;
		}
		
		return numero;
	}
	
	/* Gera numero aleatorio para alocar as pecas */
	public int geraPosicao() {
		Random random = new Random();

        int posicao = random.nextInt(4);
		
		return posicao;
	}
	
	
	
	public boolean verificaPerdeu() {		

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(tabuleiro[i][j] == 0) {
					return false;
				}else {
					if(tabuleiro[i][j] == tabuleiro[i][j+1]) {
						return false;
					}
					if(tabuleiro[i][j] == tabuleiro[i+1][j]) {
						return false;
					}
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(tabuleiro[i][3] == 0) {
				return false;
			}else {
				if(tabuleiro[i][3] == tabuleiro[i+1][3]) {
					return false;
				}
			}
		}
		
		for(int j = 0 ; j < 3; j++) {
			if(tabuleiro[3][j] == 0) {
				return false;
			}else {
				if(tabuleiro[3][j] == tabuleiro[3][j+1]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	public boolean verificaGanhou() {
		
		for(int i = 0; i < 4; i++ ) {
			for(int j = 0; j < 4; j++) {
				if(tabuleiro[i][j] == 2048) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	/* So porque o Xastre mandou, deveria jogar ate o final !!!!*/
	public void trapaca() {
		tabuleiro[0][0] = 1024;
		tabuleiro[0][1] = 1024;
	}

	

	
}
