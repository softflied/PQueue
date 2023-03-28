
public class MinHeap {
	private static final int MAX_SIZE=10;
	private int []items=new int[MAX_SIZE];
	private int size=0;
	
	
	private static int Parent(int n) {
		
		return (n-1)/2;
	}
	private static int 	LeftChild(int n) {
		return 2*n+1;
	}
	private static int 	RightChild(int n) {
		return 2*n+2;
	}
		
	private void heapUp(int loc) {
		while(loc>0) {
			if(items[loc]<items[Parent(loc)]) {
				//swap(items[loc],items[Parent(loc)])
				int t=items[loc];
				items[loc]=items[Parent(loc)];
				items[Parent(loc)]=t;
				//update loc
				loc=Parent(loc);
			}
			else 
				break;
		}
	}
	public void insert(int itm) {
		if(!isFull()) {
			//copy itm to next free slot
			items[size]=itm;
			heapUp(size);
			size++;
		}
	}
	public void heapDown(int loc) {

		while (true)
		{
			int left =items[LeftChild(loc)];
			int right =items[RightChild(loc)];
			int root = items[loc];

			if(RightChild(loc)<=size) // sağ ve sol çocuk varsa
			{
				if(root>left || root>right) // kökteki item sağ ve soldan büyükse
				{
					if(left<right)  // soldaki daha küçükse o yoldan git
					{
						int temp = items[loc];
						items[loc] = items[LeftChild(loc)];
						items[LeftChild(loc)] = temp;
						loc = LeftChild(loc);
					}
					else // sağdaki daha küçükse o yoldan git
					{
						int temp = items[loc];
						items[loc] = items[RightChild(loc)];
						items[RightChild(loc)] = temp;
						loc = RightChild(loc);
					}
				}
				else
					break;
			}
			else if(LeftChild(loc)<=size && RightChild(loc)>size) // sadece sol çocuk varsa
			{
				if(root>left) // kökteki item sağ ve soldan büyükse
				{
						int temp = items[loc];
					items[loc] = items[LeftChild(loc)];
					items[LeftChild(loc)] = temp;
						loc = LeftChild(loc);

				}
				else
					break;
			}

			else if(LeftChild(loc)>size) // ne sağ ne de sol çocuk varsa
			{
				break;
			}
		}


	}
	public int deleteMin() {
		int minItem=0;
		if(!isEmpty()) {
			minItem=items[0];
			items[0]=items[size-1];//Exchange root with rightmost leaf
			size--;
			heapDown(0);
		}
		return minItem;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size>=MAX_SIZE;
	}
	
	public String toString() {

		String str ="[";
		for(int i =0;i<size;i++)
		{
			str = str + items[i]+ ",";
		}
		str = str +"]";
		return str;
	}

	public static void main(String []s) {
		MinHeap mh=new MinHeap();
		mh.insert(4);
		mh.insert(5);
		mh.insert(7);
		mh.insert(6);
		mh.insert(11);
		mh.insert(13);
		mh.insert(8);
		System.out.println(mh);
		mh.deleteMin();
		System.out.println();
		System.out.println(mh);

		
	}
}
