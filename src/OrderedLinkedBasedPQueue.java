
public class OrderedLinkedBasedPQueue implements PriorityQueue {
	private Node<Integer> head;
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

	//maintain linked list in sorted fasion: first node has the highest priority 
	@Override
	public void insert(int itm) {
		// TODO Auto-generated method stub
		if(head==null) {
			head=new Node<Integer>(itm);
		}
		else {
			Node<Integer> newNode=new Node<Integer>(itm);
			Node<Integer> walk=head;
			Node<Integer> prev=null;
			while(walk!=null) {
				if(itm<walk.getData())
					break;
				prev=walk;
				walk=walk.getNext();
			}//end while
			if(prev==null) {
				newNode.setNext(head);
				head=newNode;
			}else {
				prev.setNext(newNode);
				newNode.setNext(walk);
			}
		}

	}

	//since linked list is sorted in ascending order: min is at the first node
	@Override
	public int deleteMin() {
		
		if(isEmpty())
			System.exit(0);
		int itm=head.getData();
		//remove first node
		head=head.getNext();
		return itm;
	}

	

}
