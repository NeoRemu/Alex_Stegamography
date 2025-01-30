# Alex_Stegamography
A program written in Java to stimluate a way to embed information behind photots, called Steganography

How It Works
1. Embedding:
     The binary representation of each character in the message is sequentially embedded into the LSBs of the pixel values in the linked list.
     A delimiter (00000000) is added to indicate the end of the message.
2. Extracting:
     The LSBs of the pixel values are traversed and collected to reconstruct the binary message.
     The binary data is then converted back into characters until the delimiter is encountered.
