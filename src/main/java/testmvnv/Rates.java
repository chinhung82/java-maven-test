package testmvnv;

import java.util.Map;
import java.util.Properties;

public class Rates {
	private Map<Object, Object> mapRates;
	
	public Map<Object, Object> getMaps() {
		return mapRates;
	}

	public void setMaps(Map<Object, Object> maps) {
		this.mapRates = maps;
	}
	
	@Override
	public String toString() {
		return "Rates [ maps=" + mapRates + "]";
	}
}
