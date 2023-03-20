import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

         public class DrawPainel extends JPanel
{
        Random gerador = new Random();
         // desenha um X a partir dos cantos do painel
         public void paintComponent(Graphics g) {
             // chama paintComponent para assegurar que o painel é exibido corretament
             int repit = gerador.nextInt(10);
             super.paintComponent(g);

             int width = getWidth(); // largura total ÿ
             int height = getHeight(); // altura totalÿ
             int  count =0;
             while (repit > count ){
             // desenha uma linha a partir do canto superior esquerdo até o inferior direito
             g.drawLine(gerador.nextInt(100), gerador.nextInt(100), width, height);

             // desenha uma linha a partir do canto inferior esquerdo até o superior direito
             g.drawLine(gerador.nextInt(100), height, width,gerador.nextInt(100));
             count++;
             }
         }

}