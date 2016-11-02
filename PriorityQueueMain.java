//Code by Samarth Dave
import java.util.Scanner;
public class PriorityQueueMain {
	static Scanner s;
	public static void main(String[] args) {
		System.out.println("Priority Queue by Samarth Dave\n");
		s = new Scanner(System.in);
		PQ<Integer> pq = new PQ<>();
		int sel = -1;
		do {
			System.out.print("1. Print\n2. Size\n3. Empty?\n4. Add\n5. Remove\n6. Clear\n0. Exit");
			sel = validInt("Enter selection: ");
			switch(sel) {
				case 1:
					out(pq.empty() ? "The data in the priority queue is: []." : "The data in the priority queue is: " + pq + ".");
					break;
				case 2:
					out("The size of the priority queue is " + pq.size() + ".");
					break;
				case 3:
					out(pq.empty() ? "The priority queue is empty." : "The priority queue is not empty.");
					break;
				case 4:
					int g = validInt("Enter the value you want to add: ");
					pq.add(g);
					out(g + " has been added to the priority queue.");
					break;
				case 5:
					if(pq.empty()) {
						out("The queue is empty. You cannot remove.");
						break;
					}
					out(pq.remove() + " has been removed.");
					break;
				case 6:
					if(pq.empty()) {
						out("The priority queue is empty. You cannot clear.");
					} else {
						pq.clear();
						out("The priority queue has been emptied.");
					}
					break;

			}
		} while(sel != 0);
		s.close();
		out("User exited.");
	}
	public static int validInt(String o) {
		int r = -1;
		System.out.print("\n"+o);
		while(!s.hasNextInt()) {
			System.out.print("Error, try again: ");
			s.next();
		}
		r = s.nextInt();
		s.nextLine();
		return r;
	}
	public static void out(String s) {
		System.out.println("\n" + s);
	}
}