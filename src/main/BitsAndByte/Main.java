package BitsAndByte;
public class Main {

    public static void main(String[] arges) {

        String message = "Hej";

        byte[] byteArray = converStringToByteArray(message);

        String bitString = convertByteArrayToBitString(byteArray);

        //conmvert from bitString back to byteAraay
        byte[] newByteAraay = convertBitStringToByteArray(bitString);

        String deSerializedString = convertByteArrayToString(newByteAraay);

        System.out.println(deSerializedString);

    }

    private static String convertByteArrayToString(byte[] newByteAraay) {

        return new String(newByteAraay); // String constructo ???
    }

    private static byte[] convertBitStringToByteArray(String bitString) {

        int numberOfBytes = bitString.length() / 8;

        byte[] byteArray = new byte[numberOfBytes];

        for (int i = 0; i < numberOfBytes; i++) {

            int index = i * 8;
            String byteBits = bitString.substring(index, index + 8);

            byteArray[i] = (byte) Integer.parseInt(byteBits, 2);
        }
        return byteArray;
    }

    private static byte[] converStringToByteArray(String message) {

        if (message != null) {

            return message.getBytes();

        }
        return new byte[0];
    }

    private static String convertByteArrayToBitString(byte[] byteArray) {

        StringBuilder binaryString = new StringBuilder();

        for (byte b : byteArray) {
            String binaryRepresentation = "";

            int value = b;

            //Convert byte to String
            for (int i = 0; i < 8; i++) {

                binaryRepresentation = (b % 2) + binaryRepresentation;
                value = value / 2;

            }
            binaryString.append(binaryRepresentation);
        }

        return binaryString.toString();
    }


}



