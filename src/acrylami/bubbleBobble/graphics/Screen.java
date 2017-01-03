package acrylami.bubbleBobble.graphics;

public class Screen {
	
	private int width, height;
	public int[] pixels;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	public void render() {
		for (int y = 0; y < height; y++){
			for (int x = 0; x < width/2; x++) {
				//Selecting pixel from row and column
				pixels[x + y*width] = 0xff00ff;
			}
		}
	}
}
