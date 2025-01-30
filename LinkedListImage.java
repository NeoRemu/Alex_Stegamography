class LinkedListImage{
    PixelNode head;  

    
    public void addPixel(int value) {
        if (head == null) {
            head = new PixelNode(value);
        } else {
            PixelNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new PixelNode(value);
        }
    }

    
    public PixelNode getHead() {
        return head;
    }
}