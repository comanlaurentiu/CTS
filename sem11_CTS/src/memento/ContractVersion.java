package memento;

public class ContractVersion {	//Memento
	
	private String contractClause; //always changing

	public ContractVersion(String contractClause) {
		super();
		this.contractClause = contractClause;
	}

	public ContractVersion() {
		super();
	}

	public String getContractClause() {
		return contractClause;
	}

	public void setContractClause(String contractClause) {
		this.contractClause = contractClause;
	}
	
	

}
