//Write a Java program to calculate parity bits (H1, H2, H3, ...) for a given binary
//message using the Hamming algorithm.
//Requirements:
//The program should support both ODD and EVEN parity schemes.
//You must use nested loops to calculate each parity bit.
//You must use methods to structure your code (for example, a calculateParity() method).
//The program should correctly calculate all required parity bits (H1, H2, H3, ...) based on
//the length of the message.

public class hammingbits {
  //  public class HammingGroupSkip {
        public static void main(String[] args) {
            int[] msg = {1,0,1,1,0,1,0}; // your data bits
            int nParity = 3; // number of parity bits (H1, H2, H3)

            for (int n = 0; n < nParity; n++) {
                int s = 0;
                int blockStart = (int)Math.pow(2, n) - 1; // zero-based index
                int blockSize = (int)Math.pow(2, n);

                for (int i = blockStart; i < msg.length; i += blockSize * 2) {
                    for (int k = 0; k < blockSize; k++) {
                        if ((i+k) < msg.length)
                            s += msg[i+k];
                    }
                }

                int parity = s % 2;
                System.out.println("Hamming bit H" + (n+1) + " = " + parity + " (sum = " + s + ")");
            }
        }
    }
