
import java.util.ArrayList;

public class Quanlyvemaybay {
	private ArrayList<Vemaybay> list;
	public Quanlyvemaybay() {
		list= new ArrayList<Vemaybay>();
	}
	public boolean themSach(Vemaybay s1) {
		if(list.contains(s1))
			return false;
		list.add(s1);
		return true;
	}
	public boolean xoaSach(int maVe) {
		Vemaybay s1= new Vemaybay(maVe);
		if(list.contains(s1)) {
			list.remove(s1);
			return true;
		}
		return false;
	}
	public Vemaybay timkiem(int maVe) {
		Vemaybay nv =new Vemaybay (maVe);
		if(list.contains(nv)) {
			return list.get(list.indexOf(nv));
		}
		return null;
	}
	public ArrayList<Vemaybay> getList(){
		return list;
	}
}
