var id = null;
var leftScore = 0;
var rightScore = 0;
var change = 2;
function myMove() {
  var elem = document.getElementById("ball");
  var leftPad = document.getElementById("leftPaddle");
  var rightPad = document.getElementById("rightPaddle");
  var xpos = 475;
  var ypos = 375;
  var xchange = 2; 
  var ychange = 2;

  // used to reset
  clearInterval(id);
  
  id = setInterval(frame, 10);
  
  function frame() {
    if (ypos <= 0) {
      ychange = change;
    }
    else if (ypos >= 750) {
      ychange = -change;
    }
    
    if (xpos <= 0) {
      changeRight();
      xpos = 375;
      ypos = 475;
      change = 2;
      if (xchange < 0) {
        xchange = -change;
      }
      else {
        xchange = change;
      }
      var temp = Math.floor(Math.random() * 2);
      if (temp == 1) {
        ychange = -change;
      }
      else {
        ychange = change;
      }
    }
    else if (xpos >= 950) {
      changeLeft();      
      xpos = 375;
      ypos = 475;
      change = 2;
      if (xchange < 0) {
        xchange = -change;
      }
      else {
        xchange = change;
      }
      var temp = Math.floor(Math.random() * 2);
      if (temp == 1) {
        ychange = -change;
      }
      else {
        ychange = change;
      }
    }

    else if ( (xpos <= 13) && ( Math.abs(ypos - leftPad.offsetTop) <= 0 || Math.abs(leftPad.offsetTop - ypos) <= 50) ) {
      if (document.getElementById("hardCheckbox").checked == true) {
        change += 0.4;
      }
      else if (document.getElementById("mediumCheckbox").checked == true) {
        change += 0.2;
      }
      xchange = change;
      if (ychange < 0) {
        ychange = -change;
      }
      else {
        ychange = change;
      }
    }
    else if ( (xpos >= 937) && ( Math.abs(ypos - rightPad.offsetTop) <= 0 || Math.abs(rightPad.offsetTop - ypos) <= 50) ) {
      if (document.getElementById("hardCheckbox").checked == true) {
        change += 0.4;
      }
      else if (document.getElementById("mediumCheckbox").checked == true) {
        change += 0.2;
      }
      xchange = -change;
      if (ychange < 0) {
        ychange = -change;
      }
      else {
        ychange = change;
      }
    }

    
    ypos += ychange;
    xpos += xchange;
    elem.style.top = ypos + 'px'; 
    elem.style.left = xpos + 'px'; 
    
  }
  

}

document.addEventListener('keydown', (event) => {
  var name = event.key;
  
  if (name == "w") {
    leftUp();
  };
  if (name == "s") {
    leftDown();
  };
  if (name == "ArrowUp") {
    rightUp();
  };
  if (name == "ArrowDown") {
    rightDown();
  };
}
, false);

/*
function leftDown() {
  var elem = document.getElementById("leftPaddle");
  var ypos = elem.offsetTop;
  if (ypos < 720) {
    ypos += 10;
    elem.style.top = ypos + 'px';
  }

}
*/

function leftDown() {
  var elem = document.getElementById("leftPaddle");
  var ypos = elem.offsetTop;
  var ball = document.getElementById("ball");
  var xpos = ball.offsetLeft;
  if (document.getElementById("hardCheckbox").checked == true) {
    if (xpos < 475) {
      if (ypos < 720) {
        ypos += 10;
        elem.style.top = ypos + 'px';
      }
    }
  }
  else {
    if (ypos < 720) {
      ypos += 10;
      elem.style.top = ypos + 'px';
    }
  }
}

function leftUp() {
  var elem = document.getElementById("leftPaddle");
  var ypos = elem.offsetTop;
  var ball = document.getElementById("ball");
  var xpos = ball.offsetLeft;
  if (document.getElementById("hardCheckbox").checked == true) {
    if (xpos < 475) {
      if (ypos > 0) {
        ypos -= 10;
        elem.style.top = ypos + 'px';
      }
    }
  }
  else {
    if (ypos > 0) {
      ypos -= 10;
      elem.style.top = ypos + 'px';
    }
  }
}

function rightDown() {
  var elem = document.getElementById("rightPaddle");
  var ypos = elem.offsetTop;
  var ball = document.getElementById("ball");
  var xpos = ball.offsetLeft;
  if (document.getElementById("hardCheckbox").checked == true) {
    if (xpos > 475) {
      if (ypos < 720) {
        ypos += 10;
        elem.style.top = ypos + 'px';
      }
    }
  }
  else {
    if (ypos < 720) {
      ypos += 10;
      elem.style.top = ypos + 'px';
    }
  }
}

function rightUp() {
  var elem = document.getElementById("rightPaddle");
  var ypos = elem.offsetTop;
  var ball = document.getElementById("ball");
  var xpos = ball.offsetLeft;
  if (document.getElementById("hardCheckbox").checked == true) {
    if (xpos > 475) {
      if (ypos > 0) {
        ypos -= 10;
        elem.style.top = ypos + 'px';
      }
    }
  }
  else {
    if (ypos > 0) {
      ypos -= 10;
      elem.style.top = ypos + 'px';
    }
  }
}


function changeScore() {
  leftScore++;
  document.getElementById("scoreLeft").innerHTML = "Blue: " + leftScore;
  rightScore++;
  document.getElementById("scoreRight").innerHTML = "Pink: " + rightScore;
}

function changeLeft() {
  leftScore++;
  document.getElementById("scoreLeft").innerHTML = "Blue: " + leftScore;
}
function changeRight() {
  rightScore++;
  document.getElementById("scoreRight").innerHTML = "Pink: " + rightScore;
}
