# Alex_Steganography
A program written in Java to stimluate a way to embed information behind photots, called Steganography

How It Works
1. Embedding:
     The binary representation of each character in the message is sequentially embedded into the LSBs of the pixel values in the linked list.
     A delimiter (00000000) is added to indicate the end of the message.
2. Extracting:
     The LSBs of the pixel values are traversed and collected to reconstruct the binary message.
     The binary data is then converted back into characters until the delimiter is encountered.

Class Description😗
The main class Linklisted defines a linked list called LinkedListImage, where each node contains a PixelNode representing a pixel in an image. Each PixelNode holds a value (likely representing the color or intensity of a pixel) and a reference to the next node.

The addPixel method adds a new pixel to the list. If the list is empty (head == null), it creates a new node and assigns it to head. If the list is not empty, it traverses the list until it finds the last node (current.next == null), and appends a new PixelNode there.

The getHead method simply returns the head of the linked list, allowing external access to the first node in the list
