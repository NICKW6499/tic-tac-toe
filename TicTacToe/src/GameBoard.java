public class GameBoard {
    String[] gameBoard = new String[9];
    boolean status = false;


    public GameBoard() {
        for (int i = 0; i < gameBoard.length; i++) {

            gameBoard[i] = "" + i;
        }
    }

    public void printGameBoard(String[] gameBoard) {
        System.out.println("|---|---|---|");
        System.out.println("| " + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8] + " |");
        System.out.println("|---|---|---|");
    }

    //Check for X win
    public Boolean checkWinX(String[] board) {
        //row 1 X win
        if (gameBoard[0].equals("X")) {
            if (gameBoard[1].equals("X")) {
                if (gameBoard[2].equals("X")) {
                    status = true;
                    return status;
                }
            }
        }
        //row 2 X win
        else if (gameBoard[3].equals("X")) {
            if (gameBoard[4].equals("X")) {
                if (gameBoard[5].equals("X")) {
                    status = true;
                    return status;
                }
            }
        }
        //row 3 X win
        else if (gameBoard[6].equals("X")) {
            if (gameBoard[7].equals("X")) {
                if (gameBoard[8].equals("X")) {
                    status = true;
                    return status;
                }
            }
            //Column 1 win
        } else if (gameBoard[0].equals("X")) {
            if (gameBoard[3].equals("X")) {
                if (gameBoard[6].equals("X")) {
                    status = true;
                    return status;
                }
            }
            //Column 2 win
        } else if (gameBoard[1].equals("X")) {
            if (gameBoard[4].equals("X")) {
                if (gameBoard[7].equals("X")) {
                    status = true;
                    return status;
                }
            }
            //Column 3 win
        } else if (gameBoard[2].equals("X")) {
            if (gameBoard[5].equals("X")) {
                if (gameBoard[8].equals("X")) {
                    status = true;
                    return status;
                }
            }
            //Right Diagonal Win
        } else if (gameBoard[0].equals("X")) {
            if (gameBoard[4].equals("X")) {
                if (gameBoard[8].equals("X")) {
                    status = true;
                    return status;
                }
            }
            //left diagonal win
        } else if (gameBoard[2].equals("X")) {
            if (gameBoard[4].equals("X")) {
                if (gameBoard[6].equals("X")) {
                    status = true;
                    return status;
                }
            }
        }
        return status;
    }

    //Check for Y win Rows
    public boolean checkWinY(String[] board) {
        boolean status = false;
        //row 1 Y win
        if (gameBoard[0].equals("Y")) {
            if (gameBoard[1].equals("Y")) {
                if (gameBoard[2].equals("Y")) {
                    status = true;
                    return status;
                }
            }
        }
        //row 2 Y win
        else if (gameBoard[3].equals("Y")) {
            if (gameBoard[4].equals("Y")) {
                if (gameBoard[5].equals("Y")) {
                    status = true;
                    return status;
                }
            }
        }
        //row 3 Y win
        else if (gameBoard[6].equals("Y")) {
            if (gameBoard[7].equals("Y")) {
                if (gameBoard[8].equals("Y")) {
                    status = true;
                    return status;
                }
            }

            //Right Diagonal Win
        } else if (gameBoard[0].equals("Y")) {
            if (gameBoard[4].equals("Y")) {
                if (gameBoard[8].equals("Y")) {
                    status = true;
                    return status;
                }
            }
            //left diagonal win
        } else if (gameBoard[2].equals("Y")) {
            if (gameBoard[4].equals("Y")) {
                if (gameBoard[6].equals("Y")) {
                    status = true;
                    return status;
                }
            }
        }

        return status;
    }

}
