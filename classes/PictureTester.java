import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester {
  /**
   * Method to test zeroBlue
   */
  public static void testZeroBlue() {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testKeepOnlyBlue() {
    Picture beach = new Picture("beach.jpg");
    beach.keepOnlyBlue();
  }

  public static void testNegate() {
    Picture beach = new Picture("beach.jpg");
    beach.Negate();
  }

  public static void testGrayscale() {
    Picture beach = new Picture("beach.jpg");
    beach.Grayscale();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("water.jpg");
    water.FixUnderwater();
  }

  public static void testmirrorVerticalRightToLeft() {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorVerticalRightToLeft();
    redMotorcycle.explore();

  }

  public static void testMirrorVertical() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testmirrorHorizontal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }

  public static void testmirrorHorizontalBotToTop()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontalBotToTop();
    redMotorcycle.explore();
  }

  public static void testmirrorDiagonal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorDiagonal();
    redMotorcycle.explore();
  }


  /**
   * Method to test mirrorTemple
   */
  public static void testMirrorTemple() {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testWater() {
    Picture water = new Picture("redMotorcycle.jpg");
    water.explore();
    water.mirrorTemple();
    water.explore();
  }


  /**
   * Method to test the collage method
   */
  public static void testCollage() {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /**
   * Method to test edgeDetection
   */
  public static void testEdgeDetection() {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  /**
   * Main method for testing.  Every class can have a main
   * method in Java
   */
  public static void main(String[] args) {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorTemple();
    testWater();
    testmirrorVerticalRightToLeft();
    testmirrorHorizontal();
    testmirrorHorizontalBotToTop();
    testmirrorDiagonal();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);

  }
}
