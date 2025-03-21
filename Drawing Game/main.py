"""
Turtle drawing game
Created by Milaan Shah
"""

# imports turtle random module
import turtle as trtl
import random

# creates the drawer
drawer = trtl.Turtle()
wn = trtl.Screen()

# checks for keystrokes
wn.listen()

# colors list
colors = ["blue", "green", "yellow", "red", "black"]

# turtle movement functions
def move_left():
  drawer.setheading(180)
  drawer.forward(2)
def move_right():
  drawer.setheading(0)
  drawer.forward(2)
def move_up():
  drawer.setheading(90)
  drawer.forward(2)
def move_down():
  drawer.setheading(270)
  drawer.forward(2)

# turtle manual movement functions
def turn_left():
  drawer.left(1)
def turn_right():
  drawer.right(1)
def move_forward():
  drawer.forward(1)
def move_backward():
  drawer.backward(1)

# turtle pensize functions
def size_one():
  drawer.pensize(1)
def size_two():
  drawer.pensize(2)
def size_three():
  drawer.pensize(3)
def size_four():
  drawer.pensize(4)
def size_five():
  drawer.pensize(5)

# turtle shape functions
def square():
  for i in range(4):
    drawer.forward(20)
    drawer.left(90)
def triangle():
  for i in range(3):
    drawer.forward(20)
    drawer.left(120)
def circle():
  drawer.circle(10)

# turtle change color functions
def choose_yellow():
  drawer.color("yellow")
def choose_red():
  drawer.color("red")
def choose_blue():
  drawer.color("blue")
def choose_green():
  drawer.color("green")
def choose_black():
  drawer.color("black")

# turtle pendown and penup functions
def penup():
  drawer.penup()
def pendown():
  drawer.pendown()

# turtle random color function
def random_color():
  num = random.randint(0,3)
  color_chosen = colors[num]
  drawer.color(color_chosen)

# turtle clear screen function
def clear_bg():
  drawer.clear()

# checks for turtle movement keystroke
wn = trtl.onkey(move_left, "Left")
wn = trtl.onkey(move_right, "Right")
wn = trtl.onkey(move_up, "Up")
wn = trtl.onkey(move_down, "Down")

# checks for manual movement
wn = trtl.onkey(turn_left, "a")
wn = trtl.onkey(turn_right, "d")
wn = trtl.onkey(move_forward, "w")
wn = trtl.onkey(move_backward, "s")

# checks for in change turtle pensize
wn = trtl.onkey(size_one, 1)
wn = trtl.onkey(size_two, 2)
wn = trtl.onkey(size_three, 3)
wn = trtl.onkey(size_four, 4)
wn = trtl.onkey(size_five, 5)

# draws the shape
wn = trtl.onkey(square, "q")
wn = trtl.onkey(triangle, "t")
wn = trtl.onkey(circle, "i")

# checks for change in turtle color
wn = trtl.onkey(choose_yellow, "y")
wn = trtl.onkey(choose_red, "r")
wn = trtl.onkey(choose_blue, "b")
wn = trtl.onkey(choose_green, "g")
wn = trtl.onkey(choose_black, "l")

# assigns random color to turtle
wn = trtl.onkey(random_color, "q")

# checks for penup and pendown for turtle
wn = trtl.onkey(penup, "u")
wn = trtl.onkey(pendown, "o")

# checks for clear screen keystroke
wn = trtl.onkey(clear_bg, "c")
