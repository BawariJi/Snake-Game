import javax.swing.JFrame;

public class frameclass extends JFrame {
    
        
    
    frameclass(){
       
       this.add(new GamePanel());
       this.setTitle("Snake game");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.pack();
       this.setVisible(true);
       this.setLocationRelativeTo(null);

    }
    
}
