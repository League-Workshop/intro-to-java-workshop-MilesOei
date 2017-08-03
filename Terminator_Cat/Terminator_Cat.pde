

PImage catPic;

int x = 278;
int y = 314;

int acceleration = 5;

void setup() {
  size(800,600); 
  
  catPic = loadImage("Cat.jpg");
  catPic.resize(800,600);
  background(catPic);

}

void draw() {
if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
      }
  noStroke();
  ellipse(x,y,50,50);
  ellipse(x+160, y-80, 50, 50);
  fill(random(256),17,17);
  
  if (y>600) {
     background(catPic);
     x=278;
     y=314;
     acceleration=5;
  }
}

void keyPressed() {
  x+=2*acceleration;
  y+=2*acceleration;
}