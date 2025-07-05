// Array Sorting Algorithms (Bubble Sort, Selection Sort, Insertion Sort)
// Created by Milaan Shah

#include <iostream>

void bubbleSort(int arr[]) {
    
    for(int i = 0; i < 6; i++) {
        
        for(int j = 0; j < 5; j++) {
            
            if (arr[j+1] < arr[j]) {
                std::swap(arr[j+1], arr[j]);
            }
            
        }
        
    }
    
}

void selectionSort(int arr[]) {
    
    for(int i = 0; i < 6; i++) {
        
        int minIndex = i;
        
        for(int j = i; j < 6; j++) {
            
            if(arr[j] < arr[minIndex]) {
                minIndex = j;
            }
            
        }
        
        if(arr[i] > arr[minIndex]) {
            std::swap(arr[i], arr[minIndex]);
        }
        
    }
    
}

void insertionSort(int arr[]) {
    
    for(int i = 1; i < 6; i++) {
        
        for(int j = i - 1; j >= 0; j--) {
            
            if(arr[j] > arr[j + 1]) {
                std::swap(arr[j], arr[j+1]);
            }
            
        }
        
    }
    
}

void printArr(int arr[]) {
    for(int i = 0; i < 6; i++) {
        std::cout << arr[i];
    }
    std::cout << '\n';
}

int main() {
    
    int arr1[] = {3, 6, 4, 2, 1, 8};
    bubbleSort(arr1);
    printArr(arr1);

    int arr2[] = {3, 6, 4, 2, 1, 8};
    selectionSort(arr2);
    printArr(arr2);

    int arr3[] = {3, 6, 4, 2, 1, 8};
    insertionSort(arr3);
    printArr(arr3);

    
    return 0;
}
