/**
 * 
 */
package com.java4u.inman.common.utility;

/**
 * @author Bharath
 *
 */
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 

public class ImageResize {
 
	private static final int IMG_WIDTH = 40;
	private static final int IMG_HEIGHT = 40;
 
	public static void main(String [] args){
 
	try{
 
		BufferedImage originalImage = ImageIO.read(new File("E:/MyWork/InMan/InMan/src/main/webapp/img/search-icon.png"));
		int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
 
		BufferedImage resizeImageJpg = resizeImage(originalImage, type);
		ImageIO.write(resizeImageJpg, "png", new File("E:/MyWork/InMan/InMan/src/main/webapp/img/search_icon_small.png")); 
 
		BufferedImage resizeImageHintPng = resizeImageWithHint(originalImage, type);
		ImageIO.write(resizeImageHintPng, "png", new File("E:/MyWork/InMan/InMan/src/main/webapp/img/search_icon_hint_small.png")); 
 
 
	}catch(IOException e){
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
 
    }
 
    private static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();
 
	return resizedImage;
    }
 
    private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){
 
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();	
	g.setComposite(AlphaComposite.Src);
 
	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	RenderingHints.VALUE_RENDER_QUALITY);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);
 
	return resizedImage;
    }	
}