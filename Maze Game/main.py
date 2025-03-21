"""
Maze Game
Created by Milaan Shah
"""

import turtle as trtl
import random as rand

maze = trtl.Turtle()
runner = trtl.Turtle()
writer = trtl.Turtle()
wn = trtl.Screen()

walls = 33
width = 20

font_setup = ("Arial", 20, "normal")

wall_color = "green"
player_color = "red"

maze.color(wall_color)
maze.pendown()
maze.pensize(8)
maze.speed(0)

runner.color(player_color)
runner.pendown()
runner.hideturtle()

writer.penup()
writer.hideturtle()
writer.color("blue")
writer.setposition(-300, 310)


def build_maze():
  maze.clear()
  for i in range(walls):
    wall_length = (width * i) + width
    door_length = width * 2
    door_loc = rand.randint(0, wall_length)
    wall_loc = rand.randint(0, wall_length)
    if i < 7:
      maze.color("white")
    else:
      maze.color(wall_color)
    maze.left(90)
    maze.forward(width * 3)
    choose_door_or_wall = rand.randint(1, 2)
    if choose_door_or_wall == 1:
      maze.penup()
      maze.forward(door_length)
      maze.pendown()
      randomize = wall_length * 0.5
      x = rand.randint(10, int(randomize))
      maze.forward(x)
      maze.left(90)
      maze.forward(door_length)
      maze.backward(door_length)
      maze.right(90)
    else:
      maze.pendown()
      maze.left(90)
      maze.forward(door_length)
      maze.backward(door_length)
      maze.right(90)
      b = wall_length * 0.5
      x = rand.randint(10, int(b))
      maze.forward(x)
      maze.penup()
      maze.forward(door_length)
      maze.pendown()
    maze.forward(wall_length - (width * 3) - (2 * door_length) - x)


def right():
  runner.setheading(0)
  runner.forward(3)
  end_game()


def left():
  runner.setheading(180)
  runner.forward(3)
  end_game()


def up():
  runner.setheading(90)
  runner.forward(3)
  end_game()


def down():
  runner.setheading(270)
  runner.forward(3)
  end_game()


def restart():
  writer.clear()
  writer.write("Building a new maze!", font=font_setup)
  maze.setposition(0, 0)
  maze.clear()
  maze.setheading(0)
  build_maze()
  runner.setposition(0, 0)
  runner.clear()
  runner.setheading(0)
  writer.clear()


def write():
  writer.clear()
  writer.write("You have finished the game! Press r to restart",
               font=font_setup)


def end_game():
  xcor = runner.xcor()
  ycor = runner.ycor()
  if xcor <= -310:
    write()
  if xcor >= 335:
    write()
  if ycor <= -310:
    write()
  if ycor >= 310:
    write()


build_maze()
runner.showturtle()
runner.penup()

wn.listen()

wn.onkeypress(right, "Right")
wn.onkeypress(left, "Left")
wn.onkeypress(up, "Up")
wn.onkeypress(down, "Down")
wn.onkeypress(restart, "r")

wn.mainloop()
