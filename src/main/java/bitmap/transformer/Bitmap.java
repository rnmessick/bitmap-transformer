package bitmap.transformer;

import javax.imageio.ImageIO;
import javax.xml.xpath.XPath;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Bitmap {
    //instance variable
    // input-file-path output-file-path transform-name
    private static BufferedImage image;
    private static int width;
    private static int height;

    public Bitmap(BufferedImage image) {
        this.image = image;
        width = image.getWidth();
        height = image.getHeight();
    }

    public void transformGreyScale()
    {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = image.getRGB(x, y);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                //calculate average
                int avg = (r + g + b) / 3;

                //replace RGB value with avg
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;
                image.setRGB(x, y, p);
            }
        }
    }
    public void transformPixelate(){
        int size = 5;
        for (int x = 0; x < width; x+=size) {
            for (int y = 0; y < height; y+=size) {

                int px = 0;

                for (int xi = 0; xi < size; xi++) {
                    for (int yi = 0; yi < size; yi++) {
                        px += image.getRGB(x, y);
                        px = px / 2;  //not a true average but it's close
                    }
                }

                for (int xi = 0; xi < size; xi++) {
                    for (int yi = 0; yi < size; yi++) {
                        image.setRGB(x+xi, y+yi, px);
                    }
                }
            }
        }

    }
    public void transformNegative(){
        //convert to negative
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int p = image.getRGB(x,y);
                int a = (p>>24)&0xff;
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xff;
                int b = p&0xff;
                //subtract RGB from 255
                r = 255 - r;
                g = 255 - g;
                b = 255 - b;
                //set new RGB value
                p = (a<<24) | (r<<16) | (g<<8) | b;
                image.setRGB(x, y, p);
            }
        }
    }
    public BufferedImage getImage(){
        return image;
    }


}
