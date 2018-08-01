float birdY = 250;
int birdX = 200;
int speed =1;
float velocity = -1.5;
int topPipeHeight = 100;
int bottomPipeHeight = 400;
int pipeX = 500;
void setup() {

  size(500, 500);
}
void draw() {
  background(40, 10, 200); 
  fill(255, 200, 40);
  stroke(0, 0, 0);
  ellipse(birdX, birdY, 60, 60);
  birdY-=velocity; 
  fill(0, 160, 0);
  rect( pipeX, 400, 50, 400);
  
rect(pipeX, 0, 50, 100);
  pipeX-=speed;
  teleportPipes();
}
void mousePressed() {
  birdY-= 70;
}
void teleportPipes() {
  if (pipeX <0) {
  
    pipeX= 500;
    velocity+=.25;
    speed+=.5;
    topPipeHeight = (int) random(100, 400);
  }
}
