

public class UnorderedLinkedBasedPQueue2 implements PriorityQueue {
	private Node<Integer> head;
	private Node<Integer> last;
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head==null;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public void insert(int itm) {
		

	}

	
	@Override
	public int deleteMin() {
		
		
		return 0;
	}

	public static void main(String[] args) {
		PriorityQueue pq=new UnorderedLinkedBasedPQueue2();
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
