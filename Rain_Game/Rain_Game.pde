int y = 0;
int randomNumber = random(300);

void setup() {
  size(300,600);
  
  
  
}

void draw() {
  background(150);
  
  noStroke();
  ellipse(randomNumber,y,10,10);
  fill(0,183,232);
  
  rect(mouseX,600,100,100);
}