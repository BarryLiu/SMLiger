package jing.test;

public class Test1 {
	public static void main(String[] args) {
		String data = "{Rows:[{\"CustomerID\":\"ALFKI\",\"CompanyName\":\"Alfreds Futterkiste\",\"ContactName\":\"Maria Anders\",\"ContactTitle\":\"Sales Representative\",\"Address\":\"Obere Str. 57\",\"City\":\"Berlin\",\"Region\":null,\"PostalCode\":\"12209\",\"Country\":\"Germany\",\"Phone\":\"030-0074321\",\"Fax\":\"030-0076545\"},{\"CustomerID\":\"BERGS\",\"CompanyName\":\"Berglunds snabbköp\",\"ContactName\":\"Christina Berglund\",\"ContactTitle\":\"Order Administrator\",\"Address\":\"Berguvsvägen  8\",\"City\":\"Luleå\",\"Region\":null,\"PostalCode\":\"S-958 22\",\"Country\":\"Sweden\",\"Phone\":\"0921-12 34 65\",\"Fax\":\"0921-12 34 67\"},{\"CustomerID\":\"GODOS\",\"CompanyName\":\"Godos Cocina Típica\",\"ContactName\":\"José Pedro Freyre\",\"ContactTitle\":\"Sales Manager\",\"Address\":\"C/ Romero, 33\",\"City\":\"Sevilla\",\"Region\":null,\"PostalCode\":\"41101\",\"Country\":\"Spain\",\"Phone\":\"(95) 555 82 82\",\"Fax\":null}],Total:91}";
		data = data.replace("\"", "'");
		System.out.println(data);
	}
}
