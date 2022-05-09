package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] tablo = new char[9];
        int x = 0;
        int y = 0;
        int drawx = 0;
        int drawo = 0;
        boolean winX = false;
        boolean winO = false;
        boolean draw = false;
        boolean con = true;
        int position = 0;
        int t = -1;
        for (int s = 0; s < 9; s++) {
            tablo[s] = ' ';
        }


        System.out.println("---------");
        System.out.println("|       |");
        System.out.println("| " + " " + " " + " " + " " + " " + " |");
        System.out.println("| " + " " + " " + " " + " " + " " + " |");
        System.out.println("---------");

        while (!winX && !winO && !draw) {
            t++;
            x = 0;
            y = 0;
            position = 0;
            if (t % 2 ==0) {
                // dla X
                while (con) {
                    System.out.println("Enter the coordinates:");
                    String row = scanner.next();
                    String column = scanner.next();

                    if (row.charAt(0) == '1') {
                        x = 0;
                    } else if (row.charAt(0) == '2') {
                        x = 3;
                    } else if (row.charAt(0) == '3') {
                        x = 6;
                    }

                    if (column.charAt(0) == '1') {
                        y = 0;
                    } else if (column.charAt(0) == '2') {
                        y = 1;
                    } else if (column.charAt(0) == '3') {
                        y = 2;
                    }

                    position = x + y;

                    if (!(row.matches("\\d") && (column.matches("\\d")))){
                        System.out.println("You should enter numbers!");
                    } else if (row.charAt(0) != '1' && row.charAt(0) != '2' && row.charAt(0) != '3' ||
                            column.charAt(0) != '1' && column.charAt(0) != '2' && column.charAt(0) != '3' ) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else if (tablo[position]== 'X' || tablo[position]== 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    }else {
                        tablo[position]= 'X';
                        con = false;
                    }


                }

                drawx++;

                if (tablo[0] == 'X' && tablo[1]== 'X' && tablo[2] == 'X') {
                    winX = true;
                } else if (tablo[3] == 'X' && tablo[4]== 'X' && tablo[5] == 'X') {
                    winX = true;
                } else if (tablo[6] == 'X' && tablo[7]== 'X' && tablo[8] == 'X') {
                    winX = true;
                } else if (tablo[0] == 'X' && tablo[3]== 'X' && tablo[6] == 'X') {
                    winX = true;
                } else if (tablo[1] == 'X' && tablo[4]== 'X' && tablo[7] == 'X') {
                    winX = true;
                } else if (tablo[2] == 'X' && tablo[5]== 'X' && tablo[8] == 'X') {
                    winX = true;
                } else if (tablo[0] == 'X' && tablo[4]== 'X' && tablo[8] == 'X') {
                    winX = true;
                } else if (tablo[2] == 'X' && tablo[4]== 'X' && tablo[6] == 'X') {
                    winX = true;
                }

                if (drawx + drawo == 9) {
                    draw = true;
                }


                if (winX && winO) {
                    draw = true;

                }

                if (winO) {
                    System.out.println("---------");
                    System.out.println("| " + tablo[0] + " " + tablo[1] + " " + tablo[2] + " |");
                    System.out.println("| " + tablo[3] + " " + tablo[4] + " " + tablo[5] + " |");
                    System.out.println("| " + tablo[6] + " " + tablo[7] + " " + tablo[8] + " |");
                    System.out.println("---------");
                    System.out.println("O wins");
                    break;
                } else if (winX) {
                    System.out.println("---------");
                    System.out.println("| " + tablo[0] + " " + tablo[1] + " " + tablo[2] + " |");
                    System.out.println("| " + tablo[3] + " " + tablo[4] + " " + tablo[5] + " |");
                    System.out.println("| " + tablo[6] + " " + tablo[7] + " " + tablo[8] + " |");
                    System.out.println("---------");
                    System.out.println("X wins");
                    break;
                } else if (draw) {
                    System.out.println("---------");
                    System.out.println("| " + tablo[0] + " " + tablo[1] + " " + tablo[2] + " |");
                    System.out.println("| " + tablo[3] + " " + tablo[4] + " " + tablo[5] + " |");
                    System.out.println("| " + tablo[6] + " " + tablo[7] + " " + tablo[8] + " |");
                    System.out.println("---------");
                    System.out.println("Draw");
                    break;
                } else {
                    System.out.println("---------");
                    System.out.println("| " + tablo[0] + " " + tablo[1] + " " + tablo[2] + " |");
                    System.out.println("| " + tablo[3] + " " + tablo[4] + " " + tablo[5] + " |");
                    System.out.println("| " + tablo[6] + " " + tablo[7] + " " + tablo[8] + " |");
                    System.out.println("---------");
                }


            } else if (t % 2 == 1) {
                // dla O
                while (!con) {
                    System.out.println("Enter the coordinates:");
                    String row = scanner.next();
                    String column = scanner.next();

                    if (row.charAt(0) == '1') {
                        x = 0;
                    } else if (row.charAt(0) == '2') {
                        x = 3;
                    } else if (row.charAt(0) == '3') {
                        x = 6;
                    }

                    if (column.charAt(0) == '1') {
                        y = 0;
                    } else if (column.charAt(0) == '2') {
                        y = 1;
                    } else if (column.charAt(0) == '3') {
                        y = 2;
                    }

                    position = x + y;

                    if (!(row.matches("\\d") && (column.matches("\\d")))){
                        System.out.println("You should enter numbers!");
                    } else if (row.charAt(0) != '1' && row.charAt(0) != '2' && row.charAt(0) != '3' ||
                            column.charAt(0) != '1' && column.charAt(0) != '2' && column.charAt(0) != '3' ) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else if (tablo[position]== 'X' || tablo[position]== 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    }else {
                        tablo[position]= 'O';
                        con = true;
                    }


                }


                drawo++;

                if (tablo[0] == 'O' && tablo[1]== 'O' && tablo[2] == 'O') {
                    winO = true;
                } else if (tablo[3] == 'O' && tablo[4]== 'O' && tablo[5] == 'O') {
                    winO = true;
                } else if (tablo[6] == 'O' && tablo[7]== 'O' && tablo[8] == 'O') {
                    winO = true;
                } else if (tablo[0] == 'O' && tablo[3]== 'O' && tablo[6] == 'O') {
                    winO = true;
                } else if (tablo[1] == 'O' && tablo[4]== 'O' && tablo[7]== 'O') {
                    winO = true;
                } else if (tablo[2] == 'O' && tablo[5]== 'O' && tablo[8] == 'O') {
                    winO = true;
                } else if (tablo[0] == 'O' && tablo[4]== 'O' && tablo[8] == 'O') {
                    winO = true;
                } else if (tablo[2] == 'O' && tablo[4]== 'O' && tablo[6] == 'O') {
                    winO = true;
                }

                if (drawx + drawo == 9) {
                    draw = true;
                }


                if (winX && winO) {
                    draw = true;
                }

                if (winO) {
                    System.out.println("---------");
                    System.out.println("| " + tablo[0] + " " + tablo[1] + " " + tablo[2] + " |");
                    System.out.println("| " + tablo[3] + " " + tablo[4] + " " + tablo[5] + " |");
                    System.out.println("| " + tablo[6] + " " + tablo[7] + " " + tablo[8] + " |");
                    System.out.println("---------");
                    System.out.println("O wins");
                    break;
                } else if (winX) {
                    System.out.println("---------");
                    System.out.println("| " + tablo[0] + " " + tablo[1] + " " + tablo[2] + " |");
                    System.out.println("| " + tablo[3] + " " + tablo[4] + " " + tablo[5] + " |");
                    System.out.println("| " + tablo[6] + " " + tablo[7] + " " + tablo[8] + " |");
                    System.out.println("---------");
                    System.out.println("X wins");
                    break;
                }  else if (draw) {
                    System.out.println("---------");
                    System.out.println("| " + tablo[0] + " " + tablo[1] + " " + tablo[2] + " |");
                    System.out.println("| " + tablo[3] + " " + tablo[4] + " " + tablo[5] + " |");
                    System.out.println("| " + tablo[6] + " " + tablo[7] + " " + tablo[8] + " |");
                    System.out.println("---------");
                    System.out.println("Draw");
                    break;
                } else {
                    System.out.println("---------");
                    System.out.println("| " + tablo[0] + " " + tablo[1] + " " + tablo[2] + " |");
                    System.out.println("| " + tablo[3] + " " + tablo[4] + " " + tablo[5] + " |");
                    System.out.println("| " + tablo[6] + " " + tablo[7] + " " + tablo[8] + " |");
                    System.out.println("---------");
                }

            }



        }
    }
}