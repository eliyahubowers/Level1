int x = 180;
int y = 380;

void setup(){
  size(400,400);
}

void draw(){
  background(200,200,100);
  fill(0);
  ellipse(x,y,40,40);
}

 void car() 
  {
    fill(0,255,0);
    rect(carX , carY,  Size of your Car, 50);
  }

void keyPressed(){
  if(key == CODED){
      if(keyCode == UP)
      {
      y-=40;
      }
      else if(keyCode == DOWN)
      {
      y+=40;
      }
      else if(keyCode == RIGHT)
      {
      x+=40;
      }
      else if(keyCode == LEFT)
      {
      x-=40;
      }
   }
   if(x>400){
     x-=40;
   }else if(x<0){
     x+=40;
   }else if(y<0){
     y+=40;
   }else if(y>400){
     y-=40;
   }
}

class car{
  int carX;
  int carY; 
  int carSize;
  int carSpeed;
  
  car(int carX , int carY , int carSize , int carSpeed){
    this.carX = carX;
    this.carY = carY;
    this.carSize = carSize;
    this.carSpeed = carSpeed;
    
  }
}