int y = 0;
int randomNumber = (int) random(600);
int score = 0;
int x = 0;


void setup() {
  size(600,700);
  
  
  
}

void draw() {
  background(150);
  
  noStroke();
  ellipse(randomNumber,y,20,20);
  fill(0,183,232);
  
  y+= 10;
  if (y >= 700) {
  y = 0;
  randomNumber = (int) random(600);
  }
  
  rect(mouseX - 50,600,100,100);
  
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}

void checkCatch(int x){
if (x > mouseX && x < mouseX+100){
      score++;
}
   else if (score > 0){
     score--;
   }
println("Your score is now: " + score);
}