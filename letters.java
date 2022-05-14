import java.util.Scanner;

public class projectL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = 5;
        System.out.println("Hello, welcome to Işık NameIt program.");
        System.out.println("-----------------------------");
        System.out.println("The following options are available for you: ");
        System.out.println("1) Display a name (with capital letters)");
        System.out.println("2) Change the size");
        System.out.println("3) Exit program");
        System.out.println("Choose an option");
        System.out.println("-----------------------------");
        int options = input.nextInt();
        System.out.println("-----------------------------");

        while (options != 3) {
            if (options == 1 || options == 2) {
                switch (options) {
                    case 2:
                        System.out.println("enter new size");
                        size = input.nextInt();
                        System.out.println("Choose new option");
                        options = input.nextInt();
                        break;
                    case 1:
                        System.out.println("What is your name??");
                        String name = input.next();
                        for (int left = 0; name.length() > left; left++) {
                            char letter = name.charAt(left);

                            switch (letter) {
                                case 'A':
                                    for (int i = 1; i <= size; i++) {
                                        for (int j = 1; j <= size; j++) {
                                            if (i == 1 || j == 1 || j == size) {
                                                System.out.print("*");
                                            } else if (i == size / 2 + 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'B':
                                    for (int i = 1; i <= size; i++) {
                                        for (int j = 1; j <= size; j++) {
                                            if (i == 1 || i == size || j == 1 || j == size) {
                                                System.out.print("*");
                                            } else if (i == size / 2 + 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'C':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (j == 0 || i == 0 || i == size - 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'D':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (j == 0 || (j == i + 2 && i <= size / 2) || (j == size - i + 1 && i >= size / 2)) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'E':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (i == 0 || i == size - 1 || i == (size - 1) / 2 || j == 0) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'F':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (i == 0 || i == (size - 1) / 2 || j == 0) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'G':
                                    for (int i = 1; i <= size; i++) {
                                        for (int j = 1; j <= size; j++) {
                                            if (i == 1 || i == size || (i == size / 2 + 1 && j > size / 2 + 1) || j == 1) {
                                                System.out.print("* ");
                                            } else if (i > size / 2 + 1 && j == size) {
                                                System.out.print("*");
                                            } else
                                                System.out.print("  ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'H':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (j == 0 || j == size - 1 || i == (size - 1) / 2) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'I':
                                    for (int i = 1; i <= size; i++) {
                                        for (int j = 1; j <= size; j++) {
                                            if (i == 1 || (i == size)) {
                                                System.out.print("*");
                                            } else if (j == size / 2 + 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'J':
                                    for (int i = 1; i <= size; i++) {
                                        for (int j = 1; j <= size; j++) {
                                            if (i == 1 || (i == size && j < size / 2 + 1)) {
                                                System.out.print("*");
                                            } else if (j == size / 2 + 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'K':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size / 2 + 1; j++) {
                                            if (j == 0 || size / 2 - j == i || size / 2 + j == i) {
                                                System.out.print(" *");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'L':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (j == 0 || i == size - 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'M':
                                    for (int i = 1; i < size; i++) {
                                        for (int j = 1; j < size; j++) {
                                            if ((i == j || i + j == size) && i < size / 2 + 1 || j == 1 || j == size - 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'N':
                                    for (int i = 0; i <= size - 1; i++) {
                                        for (int j = 0; j <= size - 1; j++) {
                                            if (j == 0 || j == size - 1 || j == i) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'O':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (i == 0 && (j == 0 || j == size - 1) || i == size - 1 && (j == 0 || j == size - 1)) {
                                                System.out.print(" ");
                                            } else if (i == 0 || j == 0 || j == size - 1 || i == size - 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'P':
                                    for (int i = 1; i <= size; i++) {
                                        for (int j = 1; j <= size; j++) {
                                            if (i == 1 || i == size / 2 + 1 || j == 1 || (j == size && i < size / 2 + 1)) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'R':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (j == 0 || i == 0 && j <= (size - 1) / 2 || j == (size - 1) / 2 && i <= (size - 1) / 2 || i == (size - 1) / 2 && j <= (size - 1) / 2) {
                                                System.out.print("*");
                                            } else if (i - j == (size - 1) / 2) {
                                                System.out.print("*");
                                            } else if (i == j) {
                                                System.out.print(" ");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'S':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (i == 0 || i == (size - 1) / 2 || i == size - 1 || j == 0 && i < (size - 1) / 2 || j == size - 1 && i > (size - 1) / 2) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'T':
                                    for (int i = 1; i <= size; i++) {
                                        for (int j = 1; j <= size; j++) {
                                            if (i == 1 || j == (size / 2) + 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'U':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (j == 0 || i == size - 1 || j == size - 1) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'V':
                                    for (int i = 0; i < size / 2; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (i == j && j < (size - 2) / 2 || i + j == size - 2 && j > (size - 2) / 2) {
                                                System.out.print("*");
                                            } else if (i == size - 1 && j == (size - 1) / 2) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'Y':
                                    for (int i = 1; i < size; i++) {
                                        for (int j = 1; j < size; j++) {
                                            if (j == size || i <= size / 2 && (j == i || j == size - i) || (j == size / 2 && i > size / 2)) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'Z':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (i == 0 || i == size - 1 || j == size - 1 - i) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'W':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (j == 0 || j == size-1 || (i == j || i+j==size-1) && i > (size-1)/2) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;

                                case 'X':
                                    for (int i = 0; i < size; i++) {
                                        for (int j = 0; j < size; j++) {
                                            if (j == i || j == size - 1 - i) {
                                                System.out.print("*");
                                            } else
                                                System.out.print(" ");
                                        }
                                        System.out.println();
                                    }
                                    break;
                            }
                        }

                        System.out.println("choose a new option");
                        options = input.nextInt();
                }
            }
        }
    }
}
