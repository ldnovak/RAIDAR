import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import edu.mit.cxsci.raidar.util.Utilities;

public class TestClass {

	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		 * String str = "100,MainEntryPersonalName,\"\",\"\",[\n" +
		 * "    {\"$a\":\"Personalname\"},\n" + "    {\"$b\":\"Numeration\"},\n" +
		 * "    {\"$c\":\"Titles,etc.associatedwithname\"},\n" +
		 * "    {\"$d\":\"Datesassociatedwithname\"},\n" +
		 * "    {\"$e\":\"Relatorterm\"},\n" +
		 * "    {\"$0\":\"Authorityrecordcontrolnumber\"},\n" +
		 * "    {\"$4\":\"Relatorcode\"}\n" + "]"; String[] arrOfStr = str.split(",",
		 * 5);
		 * 
		 * for (String a : arrOfStr) System.out.println(a);
		 */

		ArrayList<Hashtable> ht = Utilities.getInstance().FindMarcInfo("data/marc_raidar.csv");
		Hashtable htMarc = ht.get(2);
		Set<String> keys = htMarc.keySet();
		String cvsSplitBy = ",";
		String cvsSplitBySpace = "\\s+";
		
		//Hashtable<String,String> htMarc2 = new Hashtable<String,String>();
		Map<String, String> htMarc2 = new HashMap<String, String>();

		for (String key : keys) {
			String value = (String) htMarc.get(key);
			// System.out.println("Value of " + key + " is: " + value);
			
			String[] data = value.split(cvsSplitBy, 4);
			// System.out.println("---- " + data[0]);
			//System.out.println("key " + key +" " +data[3] +" "+ (data[3].equals("C")));

			if (!data[3].equals("C")) {
				//System.out.println("key " + key);
				//System.out.println("key " + key +" " +data[3] +" "+ (data[3].equals("C")));
				String[] codes = data[3].split(cvsSplitBy);
				//System.out.println("--code.length-- " + data[3].length() + "data[3]==="+data[3]);

				for (String code : codes) {
					//System.out.println("--code-- " + code);
					String[] code_des = code.split(cvsSplitBySpace);
					//System.out.println("key " + key+"--code-- " + code_des[0] + "--description-- " + code_des[1]);
					String k=key+"_"+data[1]+data[2]+code_des[0];
					String v=data[0]+":"+code_des[1];
					htMarc2.put(k, v);
				}
			}else {
				//System.out.println("key " + key +" " +data[3] +" "+ (data[3].equals("C")));
				String k=key+"_"+data[1]+data[2]+data[3];
				String v=data[0]+":"+"NONE";
				htMarc2.put(k, v);
			}

		}
		
		Map<String, String> sortedMap = new TreeMap<String, String>(htMarc2);

		Set<String> keys2 = sortedMap.keySet();
		for (String key : keys2) {
			System.out.println(key +"  "+ htMarc2.get(key));
		}
		
		// System.out.println("Value of " + ht);

		// String value="PublisherorDistributorNumber";
		// String key=Utilities.getInstance().FindMarcKey(value);
		// System.out.println("Value of key==" + key);
		// System.out.println("===================================");
		// System.out.println("Value of " + ht.get(1).get("630"));

		// for(Map.Entry entry: ht.get(0).entrySet()){
		// if(value.equals(entry.getValue())){
		// key = entry.getKey();
		// break; //breaking because its one to one map
		// }
		// }

	}

}
