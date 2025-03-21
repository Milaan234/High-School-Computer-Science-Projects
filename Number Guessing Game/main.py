"""
Number Guessing Game (Pro computer version)
Created by Milaan Shah
"""

import random

number = random.randint(1, 99)
guess = 0
player_guesses = 0

computer_guesses = 0
computer_guess_list = []

print("Welcome to Number Guessing Game! You will be playing against the computer. Whoever takes fewer guesses to find the secret number wins! Let's get started! It's your turn first!")
print("")

def player_turn():
  global number, player_guesses, guess
  while guess != number:
    guess = int(input("Enter a number between 1 and 100: "))
    player_guesses += 1
    if guess > number:
      print("Guess lower")
    elif guess < number: 
      print("Guess higher")
    else:
      print("You are correct!")
      print("You guessed in " + str(player_guesses) + " tries!")

def computer_turn():
  global number, computer_guesses, guess, computer_guess_list
  min = 0
  max = 100
  while guess != number:
    guess = int((max + min)//2)
    computer_guesses += 1
    computer_guess_list.append(guess)
    if guess > number:
      max = guess
    elif guess < number:
      min = guess
    print(guess)
  print("The guessing list: " + str(computer_guess_list))
  print("The computer guessed in " + str(len(computer_guess_list)) + " tries!")
  
player_turn()
guess = 0
computer_turn()
