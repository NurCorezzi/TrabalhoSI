package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;

import Persistencia.DatabaseActionListener;
import Persistencia.DatabaseResponse;
import Persistencia.QueryBuilder0;
import Persistencia.QueryBuilder2;

public class Form0 extends Form{
	
	private JButton okButton;
	private JTextField nameField;
	private JComboBox sexComboBox;
	private JComboBox auditorComboBox;
	private JComboBox pressaoComboBox;
	private RangeSlider pesoSlider;
	private RangeSlider alturaSlider;
	
	private DatabaseActionListener dbListener;
	private TableActionListener tableListener;
	private ReorderTableListener reorderListener;
	
	public Form0() {
		setPreferredSize(new Dimension(350, getSize().height));
		
		okButton = new JButton("Ok");
		nameField = new JTextField(10);
		sexComboBox = new JComboBox();
		auditorComboBox = new JComboBox();
		pressaoComboBox = new JComboBox();
		
		pesoSlider = new RangeSlider(0, 100);
		pesoSlider.setPaintTrack(true); 
		//pesoSlider.setPaintTicks(true); 
		pesoSlider.setPaintLabels(true); 
		pesoSlider.setMajorTickSpacing(20); 
		pesoSlider.setMinorTickSpacing(5); 
		pesoSlider.setValue(0);
		pesoSlider.setUpperValue(100);
		
		alturaSlider = new RangeSlider(100, 200);
		alturaSlider.setPaintTrack(true); 
		//pesoSlider.setPaintTicks(true); 
		alturaSlider.setPaintLabels(true); 
		alturaSlider.setMajorTickSpacing(20); 
		alturaSlider.setMinorTickSpacing(5); 
		alturaSlider.setValue(100);
		alturaSlider.setUpperValue(200);
		
		
		reorderListener = new ReorderTableListener() {
			@Override
			public void onActionPerformed(String reorderBy) {
				
				performQuery(reorderBy);
			}
		};
		
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				performQuery("");
			}
		});
		
		Border outter = BorderFactory.createTitledBorder("Consulta"); 
		Border inner = BorderFactory.createLineBorder(Color.BLACK); 
//		setBorder(BorderFactory.createCompoundBorder(outter, inner));
		
		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.fill = GridBagConstraints.NONE;
		
		/**************FIRST ROW******************/
		constraints.gridy = 0;
		
		constraints.gridx = 1;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.LINE_START;
		
		JTextPane titleText = new JTextPane();
		titleText.setPreferredSize(new Dimension(250,80));
		titleText.setText("Filtros para pacientes do SUS");
		titleText.setEditable(false);
		titleText.setBorder(BorderFactory.createCompoundBorder(inner, outter));
		add( titleText, constraints);
		
		/**************NEXT ROW******************/
		constraints.gridy++;
		
		constraints.gridx = 0;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_END;
		add(new JLabel("Auditor: "), constraints);
		
		constraints.gridx = 1;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_START;
		add(auditorComboBox, constraints);
		
		/**************NEXT ROW******************/
		constraints.gridy++;
		
		constraints.gridx = 0;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_END;
		add(new JLabel("Sexo: "), constraints);
		
		constraints.gridx = 1;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_START;
		add(sexComboBox, constraints);
		
		/**************NEXT ROW******************/
		constraints.gridy++;
		
		constraints.gridx = 0;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_END;
		add(new JLabel("Pressao: "), constraints);
		
		constraints.gridx = 1;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_START;
		add(pressaoComboBox, constraints);
		
		/**************NEXT ROW******************/
		constraints.gridy++;
		
		constraints.gridx = 0;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_END;
		add(new JLabel("Peso: "), constraints);
		
		constraints.gridx = 1;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_START;
		add(pesoSlider, constraints);
		
		/**************NEXT ROW******************/
		constraints.gridy++;
		
		constraints.gridx = 0;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_END;
		add(new JLabel("Altura: "), constraints);
		
		constraints.gridx = 1;
		constraints.weighty = 0.1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_START;
		add(alturaSlider, constraints);
		
		/**************NEXT ROW******************/
		constraints.gridy++;
		
		constraints.gridx = 1;
		constraints.weighty = 1;
		constraints.weightx = 1;
		constraints.anchor  = GridBagConstraints.FIRST_LINE_START;
		add(okButton, constraints);
		
	}
	
	public void performQuery(String orderBy) {
		if(dbListener != null) {
			
			QueryBuilder0 queryBuilder = new QueryBuilder0(dbListener);
			String cat = sexComboBox.getSelectedItem().toString();
			String auditor = auditorComboBox.getSelectedItem().toString();
			String pressao = pressaoComboBox.getSelectedItem().toString();
			double lowerPeso = pesoSlider.getValue();
			double upperPeso = pesoSlider.getUpperValue();
			int lowerAltura = alturaSlider.getValue();
			int upperAltura = alturaSlider.getUpperValue();
			
			
			DatabaseResponse dataResp = queryBuilder.buildQuery( cat , auditor, lowerPeso, upperPeso, pressao, lowerAltura, upperAltura,  orderBy);
			
			if(dataResp == null)
				JOptionPane.showMessageDialog(Form0.this.getParent(), "Query not valid", "Error", JOptionPane.ERROR_MESSAGE);
			else
				tableListener.updateTable(dataResp);
		}
		else
			System.out.println("null listener");
	}
	
	private void setCatComboBox() {
		if(dbListener != null) {
			
			DatabaseResponse dataResp = dbListener.queryRequested("select distinct SEXO from DADOSSIG");
			
			if(dataResp != null)
			{
				DefaultComboBoxModel uniModel = new DefaultComboBoxModel();
				for(int i = 1; i < dataResp.getData().size(); i++)
					uniModel.addElement(dataResp.getData().get(i).get(0));
				
				Dimension size = new Dimension(250, sexComboBox.getPreferredSize().height);
				sexComboBox.setSize(size);
				sexComboBox.setPreferredSize(size);
				sexComboBox.setModel(uniModel);	
				sexComboBox.setSelectedItem(sexComboBox.getItemAt(0));
			}
		}
	}
	
	
	private void setPressaoComboBox() {
		DefaultComboBoxModel uniModel = new DefaultComboBoxModel();
		uniModel.addElement("Normal");
		uniModel.addElement("Hipertensão");
		
		Dimension size = new Dimension(250, pressaoComboBox.getPreferredSize().height);
		pressaoComboBox.setSize(size);
		pressaoComboBox.setPreferredSize(size);
		pressaoComboBox.setModel(uniModel);	
		pressaoComboBox.setSelectedItem(sexComboBox.getItemAt(0));
	}
	
	private void setAuditorComboBox() {
		if(dbListener != null) {
			
			DatabaseResponse dataResp = dbListener.queryRequested("select distinct AUDITOR from DADOSSIG");
			
			if(dataResp != null)
			{
				DefaultComboBoxModel uniModel = new DefaultComboBoxModel();
				for(int i = 1; i < dataResp.getData().size(); i++)
					uniModel.addElement(dataResp.getData().get(i).get(0));
				
				Dimension size = new Dimension(250, auditorComboBox.getPreferredSize().height);
				auditorComboBox.setSize(size);
				auditorComboBox.setPreferredSize(size);
				auditorComboBox.setModel(uniModel);	
				auditorComboBox.setSelectedItem(auditorComboBox.getItemAt(0));
			}
		}
	}
	
	public ReorderTableListener getReorderTableListener() {
		return new ReorderTableListener() {
			@Override
			public void onActionPerformed(String reorderBy) {
				return;
			}
		};
	}
	
	public void setTableActionListener(TableActionListener tableListener) {
		this.tableListener = tableListener;
	}
	
	public void setDatabaseActionListener(DatabaseActionListener dbListener) {
		this.dbListener = dbListener;
		setCatComboBox();
		setAuditorComboBox();
		setPressaoComboBox();
	}
	
}
