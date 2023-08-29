/*
Uma empresa pode ter mais de um fornecedor 
Caso a empresa seja do Paraná, não permitir cadastrar um fornecedor pessoa física 
menor de idade 
*/
package listaDeFornecedores;

public class Empresa {

public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int cEP) {
		CEP = cEP;
	}
public int CNPJ;
public String nomeFantasia;
public int CEP;
}
