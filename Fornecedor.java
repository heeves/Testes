package listaDeFornecedores;

public class Fornecedor {
	
	public int CNPJ;
    public int CPF;
    public String Nome; 
    public String eMAIL;
    public int CEP;
    
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String geteMAIL() {
		return eMAIL;
	}
	public void seteMAIL(String eMAIL) {
		this.eMAIL = eMAIL;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int cEP) {
		CEP = cEP;
	}
    
    /*Um fornecedor pode trabalhar para mais de uma empresa 
    d. O CNPJ e CPF deve ser um valor único 
    e. Caso o fornecedor seja pessoa física, também é necessário cadastrar o RG e a data 
    de nascimento.
    g. A listagem de fornecedores deverá conter filtros por Nome e CPF/CNPJ 
    h. Validar CEP na API http://cep.la/api, a validação também deve ser feita no Frontend 
    i*/
}
