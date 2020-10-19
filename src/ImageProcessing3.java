import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing3 extends GraphicsProgram{

public static int width; 
public static int height;
public static int[][] imageArray;
public static int[][] newArray;


			
GImage milkMai = new GImage("Vermeer_Milkmaid.jpg");

public void run() {
add(flipHorizontal(milkMai));
}
private GImage flipHorizontal(GImage image) {

imageArray = image.getPixelArray();
newArray = image.getPixelArray();

width = imageArray[0].length;
height = imageArray.length;

for (int yAxis = 0; yAxis < height; yAxis++) {
	for (int horizontalStart = 0; horizontalStart < width; horizontalStart++) {
		int horizontalEnd = width - horizontalStart - 1;
	newArray[yAxis][horizontalStart] = imageArray[yAxis][horizontalEnd];
	
	}
	}
return new GImage(newArray);
}}

