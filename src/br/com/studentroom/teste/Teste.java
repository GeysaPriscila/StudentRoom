package br.com.studentroom.teste;
import java.sql.SQLException;

import br.com.studentroom.DAO.ClienteDAO;
import br.com.studentroom.domain.Cliente;
import br.com.studentroom.factory.CriaTabelaBD;
public class Teste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CriaTabelaBD tabelaCliente = new CriaTabelaBD();
		tabelaCliente.criaTabela("cliente");
		Cliente c1 = new Cliente("Marta","Xavier","09469844416","8224814","rua 115","mxm@gmail.com","998468679","Olá empresa!");
		ClienteDAO enfiaNoBD = new ClienteDAO();
		enfiaNoBD.salvarCliente(c1);
		ClienteDAO.buscarCodigocliente("09469844416");
		c1.setNomeCliente("Martaaa");
		enfiaNoBD.editarCliente(c1);
		
	}

}
