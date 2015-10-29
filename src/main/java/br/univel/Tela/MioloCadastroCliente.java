package br.univel.Tela;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class MioloCadastroCliente extends JPanel {

	protected JTextField txtid;
	protected JTextField txtnome;
	protected JTextField txtendereco;
	protected JTextField txttelefone;
	protected JTextField txtcidade;
	protected JLabel lblUf;
	protected JComboBox combouf;

	/**
	 * Create the panel.
	 */
	public MioloCadastroCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);

		txtid = new JTextField();
		GridBagConstraints gbc_txtid = new GridBagConstraints();
		gbc_txtid.insets = new Insets(0, 0, 5, 0);
		gbc_txtid.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtid.gridx = 1;
		gbc_txtid.gridy = 0;
		add(txtid, gbc_txtid);
		txtid.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);

		txtnome = new JTextField();
		GridBagConstraints gbc_txtnome = new GridBagConstraints();
		gbc_txtnome.insets = new Insets(0, 0, 5, 0);
		gbc_txtnome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtnome.gridx = 1;
		gbc_txtnome.gridy = 1;
		add(txtnome, gbc_txtnome);
		txtnome.setColumns(10);

		JLabel lblEndereco = new JLabel("Endereco");
		GridBagConstraints gbc_lblEndereco = new GridBagConstraints();
		gbc_lblEndereco.anchor = GridBagConstraints.WEST;
		gbc_lblEndereco.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereco.gridx = 0;
		gbc_lblEndereco.gridy = 2;
		add(lblEndereco, gbc_lblEndereco);

		txtendereco = new JTextField();
		GridBagConstraints gbc_txtendereco = new GridBagConstraints();
		gbc_txtendereco.insets = new Insets(0, 0, 5, 0);
		gbc_txtendereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtendereco.gridx = 1;
		gbc_txtendereco.gridy = 2;
		add(txtendereco, gbc_txtendereco);
		txtendereco.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.WEST;
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 3;
		add(lblTelefone, gbc_lblTelefone);

		txttelefone = new JTextField();
		GridBagConstraints gbc_txttelefone = new GridBagConstraints();
		gbc_txttelefone.insets = new Insets(0, 0, 5, 0);
		gbc_txttelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txttelefone.gridx = 1;
		gbc_txttelefone.gridy = 3;
		add(txttelefone, gbc_txttelefone);
		txttelefone.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade");
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.anchor = GridBagConstraints.WEST;
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 4;
		add(lblCidade, gbc_lblCidade);

		txtcidade = new JTextField();
		GridBagConstraints gbc_txtcidade = new GridBagConstraints();
		gbc_txtcidade.insets = new Insets(0, 0, 5, 0);
		gbc_txtcidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtcidade.gridx = 1;
		gbc_txtcidade.gridy = 4;
		add(txtcidade, gbc_txtcidade);
		txtcidade.setColumns(10);

		lblUf = new JLabel("UF");
		GridBagConstraints gbc_lblUf = new GridBagConstraints();
		gbc_lblUf.anchor = GridBagConstraints.EAST;
		gbc_lblUf.insets = new Insets(0, 0, 0, 5);
		gbc_lblUf.gridx = 0;
		gbc_lblUf.gridy = 5;
		add(lblUf, gbc_lblUf);

		combouf = new JComboBox();
		GridBagConstraints gbc_combouf = new GridBagConstraints();
		gbc_combouf.fill = GridBagConstraints.HORIZONTAL;
		gbc_combouf.gridx = 1;
		gbc_combouf.gridy = 5;
		add(combouf, gbc_combouf);

	}

}
