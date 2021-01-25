#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.view;

import ${package}.service.GithubService;
import ${package}.ui.CustomButton;
import ${package}.ui.MotionPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author lgdamy on 22/01/2021
 */
public class MainWindow extends JFrame {
    private JPanel basePanel;
    private CustomButton closeButton;
    private CustomButton logoButton;
    private JPanel headerPanel;
    private JPanel footerPanel;
    private JPanel contentPanel;

    private ImageIcon logo;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public MainWindow() {
        this.buildImages();
        this.buildFrame();
    }

    private void buildFrame() {
        this.setIconImage(logo.getImage());
        this.add(basePanel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((dim.width - WIDTH) / 2, (dim.height - HEIGHT) / 2, WIDTH, HEIGHT);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setResizable(false);
    }

    private void buildImages() {
        this.logo = new ImageIcon(MainWindow.class.getClassLoader().getResource("images/logo.png"));
    }

    private void createUIComponents() {
        basePanel = new MotionPanel(this);
        closeButton = new CustomButton("images/close.png") {
            @Override
            public void actionPerformed() {
                System.exit(0);
            }
        };
        logoButton = new CustomButton("images/logomini.png") {
            @Override
            public void actionPerformed() {
                GithubService.getInstance().openGithub();
            }
        };
    }
}
