#include <stdio.h>

#define SIZE 3

void printBoard(char board[SIZE][SIZE]) {
    printf("\n");
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            printf(" %c ", board[i][j]);
            if (j < SIZE - 1) printf("|");
        }
        printf("\n");
        if (i < SIZE - 1) printf("---|---|---\n");
    }
    printf("\n");
}

int checkWin(char board[SIZE][SIZE]) {
    // Check rows and columns
    for (int i = 0; i < SIZE; i++) {
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) return board[i][0];
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) return board[0][i];
    }
    // Check diagonals
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) return board[0][0];
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) return board[0][2];
    
    // Check for draw
    int draw = 1;
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            if (board[i][j] != 'X' && board[i][j] != 'O') {
                draw = 0;
            }
        }
    }
    if (draw) return 'D';

    return 0; // No winner yet
}

void makeMove(char board[SIZE][SIZE], int player) {
    int row, col;
    char mark = (player == 1) ? 'X' : 'O';
    while (1) {
        printf("Player %d, enter your move (row and column): ", player);
        scanf("%d %d", &row, &col);
        if (row >= 1 && row <= SIZE && col >= 1 && col <= SIZE && board[row-1][col-1] == ' ') {
            board[row-1][col-1] = mark;
            break;
        } else {
            printf("Invalid move, try again.\n");
        }
    }
}

int main() {
    char board[SIZE][SIZE] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    int player = 1;
    int winner = 0;
    
    printf("Welcome to Tic-Tac-Toe!\n");
    printBoard(board);
    
    while (!winner) {
        makeMove(board, player);
        printBoard(board);
        winner = checkWin(board);
        if (winner) break;
        player = (player % 2) + 1;
    }
    
    if (winner == 'D') {
        printf("It's a draw!\n");
    } else {
        printf("Player %d wins!\n", (winner == 'X') ? 1 : 2);
    }
    
    return 0;
}
