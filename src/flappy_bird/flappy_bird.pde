int birdX = 90;
int birdY = 150;

boolean jump = false;
float gravity = 3;
int jumptime = 0;

double birdYVelocity = 0;

int pipesX = 250;
int pipesY = 200;

boolean gameOver = false;

int score = 0;
void setup(){
  size(300,400);
}

void draw(){ 
  birdY+=gravity;
  birdY-=birdYVelocity;
  
  background(80,100,255);
  
  fill(250,100,50);
  ellipse(birdX,birdY,30,30);
  
  pipes();
  
  jump();
  
  birdY = constrain(birdY, 20 , 380);
  
  if(gameOver == true){
    fill(255);
    noStroke();
    rect(0,0,300,400);
    textSize(100);
    fill(0);
    textAlign(CENTER, CENTER);
    text("Game Over",0,0,300,400);
    text("Score:" + score,0,500,300,300);
    stroke(1);
birdX = 90;
birdY = 150;
jump = false;
gravity = 3;
jumptime = 0;
birdYVelocity = 0;
pipesX = 250;
pipesY = 300;
  }
}
                 

void mouseClicked(){
  jump = true;
  jumptime = 0;
  gameOver = false;
}

void pipes(){
  fill(100,200,100);
      rect(pipesX,0,30,pipesY);
      rect(pipesX,pipesY+100,30,300);
      pipesX--;
      if(pipesX <= 0){
        pipesX = 300;
        int random = (int) random(100, 300);
        pipesY = random;
        score++;
      }
      if(birdX+15 >= pipesX && birdX-15 <= pipesX+30){
        if(birdY-15 <= pipesY){
          gameOver = true;
        }if(birdY+15 >= pipesY+100){
          gameOver = true;
         }
       }
}

void jump(){
  if(jump == true){
    jumptime ++;
    birdYVelocity = 6;
    if(jumptime >= 14){
      jump = false;
      jumptime = 0;
      birdYVelocity = 0;
    }
  }
}