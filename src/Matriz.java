import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

}
	
