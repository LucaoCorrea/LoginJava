import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class CustomTools {
    public static JLabel loadImage(String resources){
        BufferedImage image;
        try{
            InputStream inputStream = CustomTools.class.getResourceAsStream(resources);
            image = ImageIO.read(inputStream);
            return new JLabel(new ImageIcon(image));
        }catch (Exception e){
            System.out.println("Erro " + e);
        }
        return null;
    }
}
