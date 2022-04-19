import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	//images
  PImage imgMap;
  PImage imgJones;
  PImage imgRocket;

  float fltMapX = 0;
  float fltMapY = 0;

  float fltJonesX = 0;
  float fltJonesY = 350;

  float fltRocketX = 0;
  float fltRocketY = 150;

  float fltJonesSpeed = 4;

  float fltRocketSpeed = 10;
  float fltRocketWaveX;

  
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);

    imgMap = loadImage("fortnite.jpg");
    imgJones = loadImage("raptor.png");
    imgRocket = loadImage("grenade.png");

    imgJones.resize(imgJones.width / 4, imgJones.height / 4);
    imgRocket.resize(imgRocket.width / 7, imgRocket.height / 7);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {


    image(imgMap, fltMapX, fltMapY );
    image(imgJones, fltJonesX, fltJonesY);
    image(imgRocket, fltRocketX, fltRocketY);

    fltJonesX += fltJonesSpeed;

    if (fltJonesX < 0 || fltJonesX > width - 50) {
    fltJonesSpeed *= -1; 
      }

    fltRocketX += fltRocketSpeed;
    if (fltRocketX < 0 || fltRocketX > width - 60) {
    fltRocketSpeed *= -1;
    }

    fltRocketY = ((float) 0.008 * ((float) Math.pow(fltRocketX - width / (float) 2, (float) 2))) + (float) 10;
    fltRocketWaveX = width - (float) fltRocketX;

	
  }
  
  // define other methods down here.
}