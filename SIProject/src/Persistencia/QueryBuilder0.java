package Persistencia;

import java.util.ArrayList;
import java.util.List;

public class QueryBuilder0 {

	DatabaseActionListener dbListener;
	
	//Passar informacoes por meio de argumentos no construtor
	public QueryBuilder0(DatabaseActionListener dbListener) {
		this.dbListener = dbListener;
	}
	
	public DatabaseResponse buildQuery(String sex, String auditor, double lowerPeso, double upperPeso, String pressao, int lowerAltura, int upperAltura, String orderBy) {
		String query =  "SELECT NOME,SOBRENOME,RG,NASCIMENTO,PESO,ALTURA,TAS,TAD,HEMODIALISES,DOSEDIALISIS,HEMOGLOBINA,ALBUMINA,FOSFORO  "
				+ "FROM DADOSSIG "
				+ "WHERE SEXO = '" + sex +"' and "
				+ "AUDITOR = '" + auditor + "' and "
				+ "PESO >= " + lowerPeso + " and PESO <= " +upperPeso + " and "
				+ "ALTURA >= " + lowerAltura + " and ALTURA <= " +upperAltura + " and ";
		
		if(pressao.equals("Hipertensão")) {
			query += "TAS > 130 and TAD > 80 ";
		}else {
			query += "TAS <= 130 and TAD <= 80 ";
		}
		
		if(!orderBy.isEmpty())
			query += "order by " + orderBy;
	
		return dbListener.queryRequested(query);
	}
}
