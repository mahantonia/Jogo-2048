import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Matriz extends JFrame{
	private JButton[][] botao = new JButton[4][4];
	JPanel painel;

	public Matriz(){
		criaTela();
    	confPanelTab();
	}

	public void criaTela() {
	    setTitle("2048");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    setResizable(false);
	    setSize(600,600); 
	    setVisible(true);
	}
	
	private void confPanelTab(){
    	painel = new JPanel(new GridLayout(4,4)); // crio o JPanel que servira de tabuleiro; 

    	criaBtosTab();

    	this.add(painel);
	}

	private void criaBtosTab(){
    	for(int i=0; i<botao.length; i++){
        	for(int j=0;j<botao[i].length; j++){ 
        		botao[i][j] = new JButton();
            	painel.add(botao[i][j]);
        	}
        
    	}
	}

}