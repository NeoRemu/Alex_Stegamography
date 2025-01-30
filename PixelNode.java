class PixelNode {
    int pixelValue;  // Store the pixel value
    PixelNode next;  // Reference to the next pixel in the list

    PixelNode(int value) {
        this.pixelValue = value;
        this.next = null;
    }
}