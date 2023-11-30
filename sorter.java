/**
 * sorter
 */
public class sorter {

    public static final String[] NAMES = new String[] { "Jean", "Marie", "Anne", "Robert" };

    public static void main(String[] args) {
        String[] result = sort();

        System.out.println("Here's the sorted list:");
        for (String string : result) {
            System.out.print(string + ", ");
        }
        System.out.println("Thanks for using my code !");
    }

    public static String[] sort() {
        String[] sorted = new String[NAMES.length];
        int[] points = givePoints();

        for (int i = 0; i < NAMES.length; i++) {
            int ugh = points[0];
            int prout = 0;
            for (int j = 0; j < points.length; j++) {
                if (points[j] < ugh) {
                    ugh = points[j];
                    prout = j;
                }
            }
            sorted[i] = NAMES[prout];
        }

        return sorted;
    }

    public static int[] givePoints() {
        int[] points = new int[NAMES.length];
        
        // Attributes points to each names according of the place of the letters in the alphabet
        // Example: A = 1 / B = 2 / etc.
        for (int i = 0; i < NAMES.length; i++) {
            for (int j = 0; j < NAMES[i].length(); j++) {
                String letter = String.valueOf(NAMES[i].charAt(j));
                switch (letter.toUpperCase()) {
                    case "A":
                        points[i] += 1;
                        break;

                    case "B":
                        points[i] += 2;
                        break;

                    case "C":
                        points[i] += 3;
                        break;

                    case "D":
                        points[i] += 4;
                        break;

                    case "E":
                        points[i] += 5;
                        break;

                    case "F":
                        points[i] += 6;
                        break;

                    case "G":
                        points[i] += 7;
                        break;

                    case "H":
                        points[i] += 8;
                        break;

                    case "I":
                        points[i] += 9;
                        break;

                    case "J":
                        points[i] += 10;
                        break;

                    case "K":
                        points[i] += 11;
                        break;

                    case "L":
                        points[i] += 12;
                        break;

                    case "M":
                        points[i] += 13;
                        break;

                    case "N":
                        points[i] += 14;
                        break;

                    case "O":
                        points[i] += 15;
                        break;

                    case "P":
                        points[i] += 16;
                        break;

                    case "Q":
                        points[i] += 17;
                        break;

                    case "R":
                        points[i] += 18;
                        break;

                    case "S":
                        points[i] += 19;
                        break;

                    case "T":
                        points[i] += 20;
                        break;

                    case "U":
                        points[i] += 21;
                        break;

                    case "V":
                        points[i] += 22;
                        break;

                    case "W":
                        points[i] += 23;
                        break;

                    case "X":
                        points[i] += 24;
                        break;

                    case "Y":
                        points[i] += 25;
                        break;

                    case "Z":
                        points[i] += 26;
                        break;

                    default:
                        System.out.println("Illegal letter in name" + NAMES[i] + 
                        "\n Please, change any characters that are not in the english alphabet");
                        break;
                }
            }
        }
        return points;
    }
}