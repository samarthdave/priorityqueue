//Code by Samarth Dave
import java.util.ArrayList;
public class PQ<E extends Comparable> {
	ArrayList<E> al;
	public PQ() {
		al = new ArrayList<>();
	}
	public boolean add(E o) {
		if(size() == 0)
			return al.add(o);
		al.add(o);
		int min;
		for(int i = 0; i < al.size(); i++) {
			min = i;
			for(int c = (i+1); c < al.size(); c++) {
				if(al.get(c).compareTo(al.get(min)) < 0)
					min = c;
			}
			E temp = al.get(min);
			al.set(min, al.get(i));
			al.set(i, temp);
		}
		return true;
	}
	public E remove() {
		return al.remove(0);
	}
	public int size() {
		return al.size();
	}
	public boolean empty() {
		return size()==0;
	}
	public void clear() {
		al.clear();
	}
	public String toString() {
		if(empty())
			return "[]";
		return al.toString();
	}
}