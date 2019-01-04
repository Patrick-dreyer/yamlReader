package yamlReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import net.sourceforge.yamlbeans.YamlException;
import net.sourceforge.yamlbeans.YamlReader;

public class ReadYaml {
	
	String path = "/home/patrick/eclipse-workspace/yamlReader/src/yamlReader/netpol-allow-http-proxy-ingress-and-egress.yml";
	Object yaml;
	Knot knot;
	
	public static void main(String args[]) {
		ReadYaml ry = new ReadYaml();
		ry.yaml = new Object();
		ry.yaml = ry.readYamlFile(ry.path);
		ry.knot = ry.convertYamlToKnot(ry.yaml);
	}
	
	private Knot convertYamlToKnot(Object yaml) {
		knot = new Knot();
		Map map = (Map)yaml;
		Map metadata = (Map)map.get("metadata");
		knot.setGroup(metadata.get("namespace").toString());
		knot.setName(metadata.get("name").toString());
		System.out.println(knot.toString());
		return null;
	}

	public Object readYamlFile(String path) {
		try {
			FileReader fr = new FileReader(path);
			YamlReader yamlReader = new YamlReader(fr);
			return yamlReader.read();
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			return null;
		}
		catch(YamlException ye) {
			ye.printStackTrace();
			return null;
		}
	}

}
