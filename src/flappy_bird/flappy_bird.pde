int birdX = 90;
int birdY = 150;

float gravity = 2;

double birdYVelocity = 0;

int[] pipes = {250,400};

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
}
                 
void mouseReleased(){
  birdYVelocity = 0;
}

void mousePressed(){
   birdYVelocity = 4;
}

void pipes(){
  fill(100,200,100);
  for(int i = 0; i<=1; i++){
    if(i == 0){
      rect(pipes[i],0,20,230);
    }else if(i == 1){
      rect(pipes[i],400,20,-230);
    }
      pipes[i]--;
      if(pipes[i] <= 0){
        pipes[i] = 300;
      }
  }
}



void mouseClicked(){ // println(mouseX , mouseY);
}