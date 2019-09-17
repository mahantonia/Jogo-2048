import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Jogo{
	private int[][] tabuleiro = new int[4][4];
	
	public Jogo() {
		criaTabuleiro();			
	}
	
	public void criaTabuleiro() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				tabuleiro[i][j] = 0;
			}
		}
	}
	
	
	public void movePecaCima() {
		tabuleiro[3][0] = 2;
		tabuleiro[3][1] = 2;
		tabuleiro[3][2] = 2;
		tabuleiro[3][3] = 3;
		tabuleiro[1][3] = 2;
		printaTabuleiro();
		System.out.println("\n");
		
		for(int i = 3; i > 0; i--) {
			for(int j = 0; j < 4; j++) {
				if(tabuleiro[i][j] != 0){
					if(tabuleiro[i-1][j] != 0) {
						if(tabuleiro[i][j] == tabuleiro[i-1][j]) {
							tabuleiro[i-1][j] = tabuleiro[i-1][j] + tabuleiro[i][j];
							tabuleiro[i][j] = 0;
						}
					}else {
						tabuleiro[i-1][j] = tabuleiro[i][j];
						tabuleiro[i][j] = 0;
					}
				}
			}					
		}
		
		for(int j = 0; j < 4; j++) {
			if(tabuleiro[1][j] == 0) {
				tabuleiro[1][j] = tabuleiro[2][j];
				tabuleiro[2][j] = 0;
			}
		}
		printaTabuleiro();
	}
	
	
	public void printaTabuleiro() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(tabuleiro[i][j]);
			}
			System.out.println("\n");
		}
	}
	public void movePecaBaixo() {
		
	}
	
	public void movePecaDireita() {
		
	}
	
	public void movePecaEsquerda() {
		
	}
	
	public void geraValor() {
		
	}
	
	public void geraPosicao() {
		
	}
	
	public int aleatorio() {
		int numero = 0;
		
		return numero;
	}
	
}
