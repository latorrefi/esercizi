package esercizi.junior.javadeveloper.esercizi.response;

import java.util.List;

import esercizi.junior.javadeveloper.esercizi.entity.Alumni;

public class GetAlumniForName {

	private int totalCount;
	private List<Alumni> data;
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<Alumni> getData() {
		return data;
	}
	public void setData(List<Alumni> data) {
		this.data = data;
	}
	
	
}
