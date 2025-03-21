"""
Binary Converter
Created by Milaan Shah
"""

# fully functional binary converter; can handle any num of bytes; can convert all chars

ascii_characters = [" ", "!", '"', "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ":", ";", "<", "=", ">", "?", "@", "A", "B", "C", "D", "E", "F", "G", "H", "I",  "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "[", "\\", "]", "^", "_", "`", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "{", "|", "}", "~"]
ascii_decimal_translation = [32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126]

decimal_message = ""
binary_message = []

# dec to bin for 1 char
def encode_char(decimal_char):
  binary_char = ""
  
  bit_value = 128
  # ascii num
  index = ord(decimal_char)
  for i in range(8):
    if index >= bit_value:
      binary_char += "1"
      index -= bit_value
    else:
      binary_char += "0"
    bit_value = bit_value / 2
  
  return binary_char

# bin to dec for 1 char
def decode_char(binary_char):
  decimal_char = ""
  index = 0

  bit_value = 128
  for i in range(8):
    if binary_char[0] == "1":
      index += bit_value
    binary_char = binary_char[1:]
    bit_value = bit_value / 2
    
  decimal_char = chr(int(index))
  
  return str(decimal_char)

def encode_str(decimal_str):
  #decimal_str is user input
  global binary_message #final list
  for i in range(len(decimal_str)):
    binary_char = encode_char(decimal_str[i])
    binary_message.append(binary_char)
    
  display_binary_message = ""
  for i in range(len(binary_message)):
    display_binary_message += binary_message[i]
  print(display_binary_message)
    

def decode_str(binary_str):
  global decimal_message
  n = int(len(binary_str) / 8)
  for i in range(n):
    temp_str = ""
    for j in range(8):
      temp_str += binary_str[0]
      binary_str = binary_str[1:]
    #return char dec letter; input binary string
    decimal_char = decode_char(temp_str)
    decimal_message += decimal_char
  print(decimal_message)


while True:
  decimal_message = ""
  binary_message = []
  print("1: Decimal to Binary")
  print("2: Binary to Decimal")
  choose = input()

  if choose == "1":
    decimal_message = input("Enter decimal value: ")
    encode_str(decimal_message)
  elif choose == "2":
    binary_message = input("Enter binary value: ")
    decode_str(binary_message)
  else:
    break
  print("")
