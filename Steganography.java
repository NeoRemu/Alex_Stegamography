class Steganography {
    
    public static void embedMessage(LinkedListImage image, String message) {
        
        StringBuilder binaryMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            binaryMessage.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0')); // 8-bit binary
        }
        binaryMessage.append("00000000"); 

        PixelNode current = image.getHead();
        int index = 0;

        while (current != null && index < binaryMessage.length()) {
            int pixelValue = current.pixelValue;
            int bit = binaryMessage.charAt(index) - '0';

            
            pixelValue = (pixelValue & ~1) | bit;
            current.pixelValue = pixelValue;

            index++;
            current = current.next;
        }

        if (index < binaryMessage.length()) {
            throw new IllegalArgumentException("Image does not have enough pixels to embed the message.");
        }
    }
}