import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Matriz extends JFrame implements KeyListener{
	private JButton[][] botao = new JButton[4][4];
	JPanel painel;
	
	Jogo jogo = new Jogo();
	
	public Matriz(){
		super("2048");
		
		addKeyListener(this);
	   	configuraTabuleiro();
		criaTela();
		atualizaJogo();
	}

	
	public void criaTela() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    setResizable(false);
	    setSize(600,600); 
	    setVisible(true);
	    setFocusable(true);
	}
	
	/* Criação do tabuleiro */
	private void configuraTabuleiro(){

		painel = new JPanel(new GridLayout(4,4));

    	criaBotoes();

    	this.add(painel);
	}

	/* Criação dos botoes */
	private void criaBotoes(){
    	for(int i=0; i<botao.length; i++){
        	for(int j=0;j<botao[i].length; j++){ 
        		botao[i][j] = new JButton();
            	painel.add(botao[i][j]);
        	}
        
    	}
	}
	
			/* Informa qual tecla foi pressionada */
			public void keyPressed(KeyEvent e){
		        if((e.getKeyCode() == KeyEvent.VK_W) || (e.getKeyCode() == KeyEvent.VK_UP)){ 
		        	System.out.println("Cima\n");
		        	jogo.movePecaCima();
		        	atualizaJogo();
		          } 
		        
		        if((e.getKeyCode() == KeyEvent.VK_S) || (e.getKeyCode() == KeyEvent.VK_DOWN)){ 
		          	//jogo.moveBaixoPeca();
		        }
		        if((e.getKeyCode() == KeyEvent.VK_A) || (e.getKeyCode() == KeyEvent.VK_LEFT)){ 
		          //	jogo.moveEsquerdaPeca();
		        }
		     
		        if((e.getKeyCode() == KeyEvent.VK_D) || (e.getKeyCode() == KeyEvent.VK_RIGHT)){ 
		        	//jogo.moveDireitoPeca();
		        }
		    }

		 
		    /* Só para o compilador nao reclamar e ficar feliz*/
			public void keyTyped(KeyEvent e) { }
		    public void keyReleased(KeyEvent e) { }

		    public void atualizaJogo() {
		    	 int[][] tabuleiro = new int[4][4];
		    	 tabuleiro = jogo.getTabuleiro();
		    	 
		    	 for(int i = 0; i < 4; i++) {
		 			for(int j = 0; j < 4; j++) {
		 				if(tabuleiro[i][j] == 0) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/0.jpg"));
		 				}
		 				if(tabuleiro[i][j] == 2) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/2.jpg"));
		 				}
		 				if(tabuleiro[i][j] == 4) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/4.jpg"));
		 				}
		 				if(tabuleiro[i][j] == 8) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/8.jpg"));
		 				}
		 				if(tabuleiro[i][j] == 16) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/16.jpg"));
		 				}
		 				if(tabuleiro[i][j] == 32) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/32.jpg"));
		 				}
		 				if(tabuleiro[i][j] == 64) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/64.jpg"));
		 				}
		 				if(tabuleiro[i][j] == 128) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/128.jpg"));
		 				}
		 				if(tabuleiro[i][j] == 256) {
		 					botao[i][j].setIcon(new ImageIcon("C:/Users/maanf/OneDrive/Área de Trabalho/faculdade/Projeto - eclipse/Testes/src/Imagens/256.jpg"));
		 				}
		 			}
		 		}
		    }
}
	
