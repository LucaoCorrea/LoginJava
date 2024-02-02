import javax.crypto.CipherInputStream;
import javax.swing.*;
import java.awt.*;
import java.net.URL;


public class LoginGui extends JFrame {
    public LoginGui(){
        super("Pit Ind. Login");
        setSize(CommonConstants.FRAME_SIZE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        addGuiComponent();

        //Image Icon Window
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage("src/resources/iconWin.jpg");
        this.setIconImage(iconeTitulo);

    }

    private void addGuiComponent(){
        JLabel loginImage = CustomTools.loadImage(CommonConstants.LOGIN_IMAGE_PATH);
        loginImage.setBounds(
                (CommonConstants.FRAME_SIZE.width - loginImage.getPreferredSize().width)/2,
                25,
                CommonConstants.LOGIN_IMAGE_SIZE.width, CommonConstants.LOGIN_IMAGE_SIZE.height
        );
    }
}
