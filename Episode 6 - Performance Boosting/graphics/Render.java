package me.lclc98.com.graphics;

import me.lclc98.com.Display;

public class Render {
	public final int width;
	public final int height;
	public final int[] pixels;

	public Render(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}

	public void draw(Render render, int xOffset, int yOffset) {
		for (int y = 0; y < render.height; y++) {
			int yPix = y + yOffset;
			if (yPix < 0 || yPix >= Display.HEIGHT) {
				continue;
			}
			for (int x = 0; x < render.width; x++) {
				int xPix = x + xOffset;
				if (xPix < 0 || yPix >= Display.WIDTH) {
					continue;
				}

				int alpha = render.pixels[x + y * render.width];
				if (alpha > 0)
					pixels[xPix + yPix * width] = render.pixels[x + y * render.width];
			}
		}
	}

}
