import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tela extends JFrame{

	public Tela() {
		
		montaTabela();
		
		
	}
	
	public void comeca() {
		setTitle("2048");
		setSize(600,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void montaTabela() {
		String[] colunas = {"1","2","3","4"};

		
		DefaultTableModel botao = new DefaultTableModel(colunas, 4);
		JTable tabela = new JTable(botao);
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 4; j++) {
				tabela.getColumn("1").setCellRenderer(new ButtonRenderer());		
//			}
//		}
		
		
		add(tabela);
		
		
	}
	
	
	public JButton criaBotao() {
		JButton botao = new JButton();
		return botao;
	}
	
}
