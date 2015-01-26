class node<T> {
	public int value; 
	private node<T> rightChild=null;
	private node<T> leftChild=null; 
	public node<T> getRChild() {
		return rightChild;
	}
	public node(int value) {
		this.value = value; 

	}
	public node<T> getLChild() {
		return leftChild; 
	}
	public void setRChild(node<T> rightChild) {
		this.rightChild = rightChild; 
	}
	public void setLChild(node<T> leftChild) {
		this.leftChild = leftChild; 
	}
}


public class problem18 {

	public static void main(String[] args) {
	}
}