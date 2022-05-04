package br.com.caelum.contas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;

public class RepositorioDeContas {

	public void salva(List<Conta> listaContas) {
		
		String path = "C:\\testzone\\contasSalvas.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(Conta conta : listaContas) {
				bw.write(conta.getTipo() + ","
						+ conta.getNumero() + ","
						+ conta.getAgencia() + ","
						+ conta.getTitular() + ","
						+ conta.getSaldo());
				
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro! -> " + e.getMessage());
		}
	}
}
