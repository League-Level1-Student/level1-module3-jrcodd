float birdY = 250;
int birdX = 200;
int speed =1;
float velocity = -1.5;
int topPipeHeight = 100;
int bottomPipeHeight = 400;
int pipeX = 500;
int gap = 200;

void setup() {

  size(500, 500);
}
void draw() {
  background(40, 10, 200); 
  fill(255, 200, 40);
  stroke(0, 0, 0);
  ellipse(birdX, birdY, 30, 30);
  birdY-=velocity; 
  fill(0, 160, 0);
  //bottom pipe
  rect( pipeX, topPipeHeight + gap, 50, height- topPipeHeight -gap );
//top pipe
  rect(pipeX, 0, 50, topPipeHeight);
  pipeX-=speed;
  teleportPipes();
  if(intersectsPipes() == true){
  text("you loose", 250, 250);
  speed = 0;
  velocity = 0;
  }
  else if(birdY>500 || birdY<0){
    text("you loose", 250, 250);
  speed = 0;
  velocity = 0;
}}
void mousePressed() {
  birdY-= 70;
}
void teleportPipes() {
  if (pipeX <0) {

    pipeX= 500;
    velocity+=.25;
    speed+=.5;
    
     topPipeHeight = height- (int) random(100, 400);
  }
}
boolean intersectsPipes() { 
     if (birdY < topPipeHeight && birdX > pipeX && birdX < (pipeX+50)){
          return true; }
     else if (birdY> topPipeHeight + gap&& birdX > pipeX && birdX < (pipeX+50)) {
          return true; }
     else { return false; }
}