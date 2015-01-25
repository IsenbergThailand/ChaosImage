
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author HeavenNakarin
 */

public class GrayChaosImg {

    /**
     * @param args the command line arguments
     */
	
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
    File fFile = new File("D:\\TestDes\\TestImg.jpg");
    
    BufferedImage img = ImageIO.read(fFile);
    
    for (int x = 0; x < img.getWidth(); ++x)
    for (int y = 0; y < img.getHeight(); ++y)
    {
        int rgb = img.getRGB(x, y);
        int r = (rgb >> 16) & 0xFF;
        int g = (rgb >> 8) & 0xFF;
        int b = (rgb & 0xFF);

        int grayLevel = (r + g + b) / 3;
        int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel; 
        img.setRGB(x, y, gray);
    }
    // Right now img is GRAY IMG 
    
  //      File img2 = new File("D:\\TestDes\\GTestImg.jpg");
  //      ImageIO.write(img, "png", img2);
        
         
        
    }
    
}