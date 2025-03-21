"""
4-function calculator with GUI
Created by Milaan Shah
"""

import tkinter as tk

output_text = ""
first_string = ""
second_string = ""
operator = ""

root = tk.Tk()
root.wm_geometry("1000x400")
root.wm_title("Calculator")

frame_output = tk.Frame(root, background="white")
frame_output.grid(row=0, columnspan=4, sticky="news")

frame_previous = tk.Frame(root)
frame_previous.grid(row=1, column=0, columnspan=3, sticky="news")

frame_clear = tk.Frame(root)
frame_clear.grid(row=1, column=4)

frame_seven = tk.Frame(root)
frame_seven.grid(row=2, column=0, sticky="news")

frame_eight = tk.Frame(root)
frame_eight.grid(row=2, column=1, sticky="news")

frame_nine = tk.Frame(root)
frame_nine.grid(row=2, column=2, sticky="news")

frame_div = tk.Frame(root)
frame_div.grid(row=2, column=3, sticky="news")

frame_four = tk.Frame(root)
frame_four.grid(row=3, column=0, sticky="news")

frame_five = tk.Frame(root)
frame_five.grid(row=3, column=1, sticky="news")

frame_six = tk.Frame(root)
frame_six.grid(row=3, column=2, sticky="news")

frame_mul = tk.Frame(root)
frame_mul.grid(row=3, column=3, sticky="news")

frame_one = tk.Frame(root)
frame_one.grid(row=4, column=0, sticky="news")

frame_two = tk.Frame(root)
frame_two.grid(row=4, column=1, sticky="news")

frame_three = tk.Frame(root)
frame_three.grid(row=4, column=2, sticky="news")

frame_sub = tk.Frame(root)
frame_sub.grid(row=4, column=3, sticky="news")

frame_zero = tk.Frame(root)
frame_zero.grid(row=5, column=0, sticky="news")

frame_dot = tk.Frame(root)
frame_dot.grid(row=5, column=1, sticky="news")

frame_equals = tk.Frame(root)
frame_equals.grid(row=5, column=2, sticky="news")

frame_add = tk.Frame(root)
frame_add.grid(row=5, column=3, sticky="news")
#--------------------------------------------------------

output = tk.Label(frame_output, bd=3, font="Courier 17", text="", background="white")
output.pack(pady=5)

prev = tk.Label(frame_previous, bd=3, font="Courier 10", text="")
prev.pack(pady=5)

# output.get()

def zero():
  global first_string
  if len(first_string) < 10:
    first_string += "0"
  output.config(text=first_string)

def one():
  global first_string
  if len(first_string) < 10:
    first_string += "1"
  output.config(text=first_string)

def two():
  global first_string
  if len(first_string) < 10:
    first_string += "2"
  output.config(text=first_string)

def three():
  global first_string
  if len(first_string) < 10:
    first_string += "3"
  output.config(text=first_string)

def four():
  global first_string
  if len(first_string) < 10:
    first_string += "4"
  output.config(text=first_string)

def five():
  global first_string
  if len(first_string) < 10:
    first_string += "5"
  output.config(text=first_string)

def six():
  global first_string
  if len(first_string) < 10:
    first_string += "6"
  output.config(text=first_string)

def seven():
  global first_string
  if len(first_string) < 10:
    first_string += "7"
  output.config(text=first_string)

def eight():
  global first_string
  if len(first_string) < 10:
    first_string += "8"
  output.config(text=first_string)

def nine():
  global first_string
  if len(first_string) < 10:
    first_string += "9"
  output.config(text=first_string)

def dot():
  global first_string
  if len(first_string) < 10:
    first_string += "."
  output.config(text=first_string)

def div():
  global output_text, first_string, second_string, operator
  operator = "/"
  if output_text != "":
    second_string = str(output.cget("text"))
  else:
    second_string = first_string
  prev.config(text= (second_string + " /"))
  output.config(text="")
  first_string = ""


def mul():
  global first_string, second_string, operator
  operator = "x"
  if output_text != "":
    second_string = str(output.cget("text"))
  else:
    second_string = first_string
  prev.config(text= (second_string + " x"))
  output.config(text="")
  first_string = ""

def sub():
  global first_string, second_string, operator
  operator = "-"
  if output_text != "":
    second_string = str(output.cget("text"))
  else:
    second_string = first_string
  prev.config(text= (second_string + " -"))
  output.config(text="")
  first_string = ""

def add():
  global first_string, second_string, operator
  operator = "+"
  if output_text != "":
    second_string = str(output.cget("text"))
  else:
    second_string = first_string
  prev.config(text= (second_string + " +"))
  output.config(text="")
  first_string = ""

def clear():
  global output_text, first_string, second_string, operator
  output_text = ""
  first_string = ""
  second_string = ""
  operator = ""
  prev.config(text="")
  output.config(text="")

def equals():
  global output_text, first_string, second_string, operator
  if operator == "+":
    output_text = float(first_string) + float(second_string)
  elif operator == "-":
    output_text = float(second_string) - float(first_string)
  elif operator == "x":
    output_text = float(first_string) * float(second_string)
  elif operator == "/":
    output_text = float(second_string) / float(first_string)
    
  output.config(text=output_text)
  prev.config(text= (second_string + " " + operator + " " + first_string + " ="))
  

btn_clear = tk.Button(frame_clear, text="C", font="Courier 15", command=clear)
btn_clear.pack()

btn_seven = tk.Button(frame_seven, text="7", font="Courier 15", command=seven)
btn_seven.pack()

btn_eight = tk.Button(frame_eight, text="8", font="Courier 15", command=eight)
btn_eight.pack()

btn_nine = tk.Button(frame_nine, text="9", font="Courier 15", command=nine)
btn_nine.pack()

btn_div = tk.Button(frame_div, text="/", font="Courier 15", command=div)
btn_div.pack()

btn_four = tk.Button(frame_four, text="4", font="Courier 15", command=four)
btn_four.pack()

btn_five = tk.Button(frame_five, text="5", font="Courier 15", command=five)
btn_five.pack()

btn_six = tk.Button(frame_six, text="6", font="Courier 15", command=six)
btn_six.pack()

btn_mul = tk.Button(frame_mul, text="x", font="Courier 15", command=mul)
btn_mul.pack()

btn_one = tk.Button(frame_one, text="1", font="Courier 15", command=one)
btn_one.pack()

btn_two = tk.Button(frame_two, text="2", font="Courier 15", command=two)
btn_two.pack()

btn_three = tk.Button(frame_three, text="3", font="Courier 15", command=three)
btn_three.pack()

btn_sub = tk.Button(frame_sub, text="-", font="Courier 15", command=sub)
btn_sub.pack()

btn_zero = tk.Button(frame_zero, text="0", font="Courier 15", command=zero)
btn_zero.pack()

btn_dot = tk.Button(frame_dot, text=".", font="Courier 15", command=dot)
btn_dot.pack()

btn_equals = tk.Button(frame_equals, text="=", font="Courier 15", command=equals) ################ command
btn_equals.pack()

btn_add = tk.Button(frame_add, text="+", font="Courier 15", command=add)
btn_add.pack()
