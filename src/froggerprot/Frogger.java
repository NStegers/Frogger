package froggerprot;

import javax.swing.JFrame;

public class Frogger extends JFrame
{
    public static void main(String[] args)
    {        
        Frogger f = new Frogger();
        f.setVisible(true);
    }
    
    public Frogger()
    {
        SplashScreen ss = new SplashScreen();
        add(ss);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}