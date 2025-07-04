// Number Guessing Game (Pro Computer Version)
// Created by Milaan Shah

#include <iostream>
#include <ctime>

int main() {
    
    // get random secret num
    srand(time(0));
    int secretNum = rand() % 100 + 1;
    
    int userGuess;
    int count = 0;
    
    std::cout << "Try to guess a num between 1-100 in as few tries as possible!\n";
    
    // do-while loop that asks user for guess until they are correct
    do {
        std::cout << "Guess num: ";
        std::cin >> userGuess;
        if(userGuess > secretNum) {
            std::cout << "Guess too high!\n";
        } else if (userGuess < secretNum) {
            std::cout << "Guess too low!\n";
        }
        count++;
    } while (userGuess != secretNum);
    
    std::cout << "Correct!\n";
    std::cout << "Tries: " << count << '\n';
    
    std::cout << "\nComputer's turn!\n";
    
    
    int compGuess;
    int max = 100;
    int min = 0;
    int compCount = 0;
    
    // do-while loop that shows computer guessing the secret num using binary search
    do {
        compGuess = (max - min + 1) / 2 + min;
        compCount++;
        std::cout << "Guess: " << compGuess << '\n';
        if(compGuess > secretNum) {
            max = compGuess;
        } else if (compGuess < secretNum) {
            min = compGuess;
        }
        
        // prevents an infinite loop
        if (compCount >= 20) {
            break;
        }
    } while (compGuess != secretNum);
    
    std::cout << "Correct! Computer guessed in " << compCount << " tries!\n";
    
    return 0;
}
