package com.bloc.threads;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageGetter implements Runnable {

	/*
	 * ImageGetter
	 *
	 * Initialize the ImageGetter class.
	 *
	 * @param url The URL of the image this ImageGetter should
	 *		  download (String)
	 * @param openWhenCompleted if `true`, the image will be opened
	 *		  as soon it is downloaded, `false` otherwise
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Implement this constructor for ImageGetter.
 	 *	The variables passed into it must impact the `run()` method's
 	 *	behavior as described above.
	/************************************************/

	private String url;
	
	public ImageGetter(String url, boolean openWhenCompleted) {

		this.url = url;
		
		File testFile = new File(url);
		
		if(testFile.exists()) {
			testFile.delete(); //delete if there is an existing one
			openWhenCompleted = true;
		}
		else {
			System.out.println("File does not exist.");
			openWhenCompleted = false;
		}
		
	}
	
	@Override
	public void run() {
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Perform the work found in `Main.java` in this
 		 *	Thread instead.
		/************************************************/
		
		try {
			File existingImage = new File(url);
			if (existingImage.exists()) {
				existingImage.delete();
			}
			URL link = new URL("https://www.google.com/images/srpr/logo11w.png");
			BufferedImage bufferedImage = ImageIO.read(link);
			File outputfile = new File(url);
			ImageIO.write(bufferedImage, "png", outputfile);
			
			if ("/".equals(System.getProperties().getProperty("file.separator"))) {
				Runtime.getRuntime().exec("open " + url);
			} 
			else {
				Runtime.getRuntime().exec(url);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		
	}
}