"""
Tic-Tac-Toe
Created by Milaan Shah
"""

A1 = " "
A2 = " "
A3 = " "
B1 = " "
B2 = " "
B3 = " "
C1 = " "
C2 = " "
C3 = " "
game_win = False

print("Player 1 is X")
print("Player 2 is O")
print("")


def my_board():
    print(A1, "|", A2, "|", A3)
    print("--+---+--")
    print(B1, "|", B2, "|", B3)
    print("--+---+--")
    print(C1, "|", C2, "|", C3)


print("Here are the board and square numbers:")
print("A1", "|", "A2", "|", "A3")
print("---+----+---")
print("B1", "|", "B2", "|", "B3")
print("---+----+---")
print("C1", "|", "C2", "|", "C3")
print("")

print("Let's start the game!")
my_board()

while game_win == False:
    while 2 > 1:
        player1_answer = input(
            "Player 1, where do you want to mark your spot? ")
        if player1_answer == "A1":
            A1 = "X"
            break
        elif player1_answer == "A2":
            A2 = "X"
            break
        elif player1_answer == "A3":
            A3 = "X"
            break
        elif player1_answer == "B1":
            B1 = "X"
            break
        elif player1_answer == "B2":
            B2 = "X"
            break
        elif player1_answer == "B3":
            B3 = "X"
            break
        elif player1_answer == "C1":
            C1 = "X"
            break
        elif player1_answer == "C2":
            C2 = "X"
            break
        elif player1_answer == "C3":
            C3 = "X"
            break
        else:
            print("Please enter a valid square")
    my_board()
    if A1 == A2 == A3 == "X":
        game_win = True
        print("Player 1 wins!")
        break
    elif B1 == B2 == B3 == "X":
        game_win = True
        print("Player 1 wins!")
        break
    elif C1 == C2 == C3 == "X":
        game_win = True
        print("Player 1 wins!")
        break
    elif A1 == B1 == C1 == "X":
        game_win = True
        print("Player 1 wins!")
        break
    elif A2 == B2 == C2 == "X":
        game_win = True
        print("Player 1 wins!")
        break
    elif A3 == B3 == C3 == "X":
        game_win = True
        print("Player 1 wins!")
        break
    elif A1 == B2 == C3 == "X":
        game_win = True
        print("Player 1 wins!")
        break
    elif A3 == B2 == C1 == "X":
        game_win = True
        print("Player 1 wins!")
        break
    if A1 == A2 == A3 == B1 == B2 == B3 == C1 == C2 == C3 != " ":
        print("Tie game!")
        game_win = True
        break
    while 2 > 1:
        player2_answer = input(
            "Player 2, where do you want to mark your spot? ")
        if player2_answer == "A1":
            A1 = "O"
            break
        elif player2_answer == "A2":
            A2 = "O"
            break
        elif player2_answer == "A3":
            A3 = "O"
            break
        elif player2_answer == "B1":
            B1 = "O"
            break
        elif player2_answer == "B2":
            B2 = "O"
            break
        elif player2_answer == "B3":
            B3 = "O"
            break
        elif player2_answer == "C1":
            C1 = "O"
            break
        elif player2_answer == "C2":
            C2 = "O"
            break
        elif player2_answer == "C3":
            C3 = "O"
            break
        else:
            print("Please enter a valid square")
    my_board()
    if A1 == A2 == A3 == "O":
        game_win = True
        print("Player 2 wins!")
        break
    elif B1 == B2 == B3 == "O":
        game_win = True
        print("Player 2 wins!")
        break
    elif C1 == C2 == C3 == "O":
        game_win = True
        print("Player 2 wins!")
        break
    elif A1 == B1 == C1 == "O":
        game_win = True
        print("Player 2 wins!")
        break
    elif A2 == B2 == C2 == "O":
        game_win = True
        print("Player 2 wins!")
        break
    elif A3 == B3 == C3 == "O":
        game_win = True
        print("Player 2 wins!")
        break
    elif A1 == B2 == C3 == "O":
        game_win = True
        print("Player 2 wins!")
        break
    elif A3 == B2 == C1 == "O":
        game_win = True
        print("Player 2 wins!")
        break
    if A1 == A2 == A3 == B1 == B2 == B3 == C1 == C2 == C3 != " ":
        print("Tie game!")
        game_win = True
        break
