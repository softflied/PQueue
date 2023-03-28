
public class PQApplication {
	
	public static void main(String[] args) {
		PriorityQueue pq=new OrderedLinkedBasedPQueue();
		
		pq.insert(13);
		pq.insert(4);
		pq.insert(22);
		pq.insert(18);
		pq.insert(11);
		pq.insert(19);
		pq.insert(5);
		pq.insert(4);
		System.out.println(pq.deleteMin());
		while(!pq.isEmpty())
			System.out.println(pq.deleteMin());
		

	}

}
