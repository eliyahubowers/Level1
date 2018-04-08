int x = 180;
int y = 380;
Car c = new Car(300,0,80,4);
Car a = new Car(300,40,100,3);
Car r = new Car(300,80,160,1);
Car cc = new Car(300,120,140,2);
Car aa = new Car(300,160,100,3);
Car rr = new Car(300,200,120,2);
Car ccc = new Car(300,240,120,3);
Car aaa = new Car(300,280,160,1);
Car rrr = new Car(300,320,40,6);

boolean returnts;
void setup(){
  size(400,400);
}

void draw(){
  background(200,200,100);
  fill(0);
  ellipse(x,y,40,40);
    c.display();
  c.moveleft();
   returnts = c.intersects(c);
  
     if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
    a.display();
  a.moveright();
    returnts = a.intersects(a);
  
     if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
    r.display();
  r.moveleft();
    returnts = r.intersects(r);
  
     if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
    cc.display();
  cc.moveleft();
    returnts = cc.intersects(cc);
  
     if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
    aa.display();
  aa.moveleft();
    returnts = aa.intersects(aa);
  
     if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
    rr.display();
  rr.moveright();
    returnts = rr.intersects(rr);
  
     if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
    ccc.display();
  ccc.moveright();
    returnts = ccc.intersects(ccc);
    
       if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
    aaa.display();
  aaa.moveleft();
    returnts = aaa.intersects(aaa);
  
     if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
    rrr.display();
  rrr.moveleft();
    returnts = rrr.intersects(rrr);
  
   if(returnts == true){            x = 180;       y = 380;        returnts = false;   }
  
  if(y<0){
     textSize(100);
     background(255);
     fill(0);
     text("You Win",10,10,400,400);     
   }
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
     textSize(2);
     text("You Win",0,20,400,400);
     println("hi");    
   }else if(y>400){
     y-=40;
   }
}

class Car{
  int carX;
  int carY;
  int carSize;
  int carSpeed;
  Car(int carX , int carY , int carSize , int carSpeed){
    this.carX = carX;
    this.carY = carY;
    this.carSize = carSize;
    this.carSpeed = carSpeed;

  }
   void display(){
      fill(0,255,0);
    rect(carX , carY,  carSize, 40);
   }
   
   void moveleft(){
     carX-=(carSpeed);
     if(carX<0){
       carX = 400;
     }
   }
     
   
   void moveright(){
     carX+=(carSpeed);
     if(carX+carSize>400){
       carX=(0-carSize);
     }
   }
   
   public int getX(){
     return this.carX;
   }
   
   public int getY(){
     return this.carY;
   }
   
   public int getSize(){
     return this.carSize;
   }
   
 boolean intersects(Car car) {
if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
          return true;
    else 
        return false;
 }
  
}