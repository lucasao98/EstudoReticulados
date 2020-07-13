package aa;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class TesteReticulado extends JFrame{
        int[] Valorx1 = {270,420,230,120,415};
        int[] Valory1 = {235,341,164,461,584};
        int x,y;
        JFrame frame2 = new JFrame();
        JButton exemplo1 = new JButton("Exemplo_1");
               
        public TesteReticulado(){
            setSize(600,600);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setLocationRelativeTo(null);
        }    
   @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(350,150,150,150); // Primeiro
        g.fillRect(5,20,200,200); //Primeiro
        g.fillPolygon(Valorx1,Valory1,5); //Segundo
        //==========ULTIMA LINHA============
       /*g.setColor(Color.black);
                
        g.fillOval(460,480,15,15);
        g.fillOval(430,480,15,15);
        g.fillOval(400,480,15,15);
        g.fillOval(370,480,15,15);
        g.fillOval(340,480,15,15);
        g.fillOval(310,480,15,15);
        g.fillOval(280,480,15,15);
        g.fillOval(250,480,15,15);
        g.fillOval(220,480,15,15);
        g.fillOval(190,480,15,15);
        g.fillOval(160,480,15,15);
        g.fillOval(130,480,15,15);
        g.drawLine(130,485,470,485);
        g.drawString("X",70,520);
        g.drawLine(70,520,520,520);
        g.drawLine(135,490,135,120);
        g.drawLine(80,80,80,520);
        g.drawString("Y",80,120);
        
        //===============PENULTIMA LINHA====================
        g.fillOval(460,440,15,15);
        g.fillOval(430,440,15,15);
        g.fillOval(400,440,15,15);
        g.fillOval(370,440,15,15);
        g.fillOval(340,440,15,15);
        g.fillOval(310,440,15,15);
        g.fillOval(280,440,15,15);
        g.fillOval(250,440,15,15);
        g.fillOval(220,440,15,15);
        g.fillOval(190,440,15,15);
        g.fillOval(160,440,15,15);
        g.fillOval(130,440,15,15);
        g.drawLine(130,445,470,445);
        g.drawLine(168,490,168,120);
        
        g.fillOval(460,400,15,15);
        g.fillOval(430,400,15,15);
        g.fillOval(400,400,15,15);
        g.fillOval(370,400,15,15);
        g.fillOval(340,400,15,15);
        g.fillOval(310,400,15,15);
        g.fillOval(280,400,15,15);
        g.fillOval(250,400,15,15);
        g.fillOval(220,400,15,15);
        g.fillOval(190,400,15,15);
        g.fillOval(160,400,15,15);
        g.fillOval(130,400,15,15);
        g.drawLine(130,405,470,405);
        g.drawLine(198,490,198,120);
       
        g.fillOval(460,360,15,15);
        g.fillOval(430,360,15,15);
        g.fillOval(400,360,15,15);
        g.fillOval(370,360,15,15);
        g.fillOval(340,360,15,15);
        g.fillOval(310,360,15,15);
        g.fillOval(280,360,15,15);
        g.fillOval(250,360,15,15);
        g.fillOval(220,360,15,15);
        g.fillOval(190,360,15,15);
        g.fillOval(160,360,15,15);
        g.fillOval(130,360,15,15);
        g.drawLine(130,365,470,365);
        g.drawLine(228,490,228,120);
        
        g.fillOval(460,320,15,15);
        g.fillOval(430,320,15,15);
        g.fillOval(400,320,15,15);
        g.fillOval(370,320,15,15);
        g.fillOval(340,320,15,15);
        g.fillOval(310,320,15,15);
        g.fillOval(280,320,15,15);
        g.fillOval(250,320,15,15);
        g.fillOval(220,320,15,15);
        g.fillOval(190,320,15,15);
        g.fillOval(160,320,15,15);
        g.fillOval(130,320,15,15);
        g.drawLine(130,325,470,325);
        g.drawLine(258,490,258,120);
       
        g.fillOval(460,280,15,15);
        g.fillOval(430,280,15,15);
        g.fillOval(400,280,15,15);
        g.fillOval(370,280,15,15);
        g.fillOval(340,280,15,15);
        g.fillOval(310,280,15,15);
        g.fillOval(280,280,15,15);
        g.fillOval(250,280,15,15);
        g.fillOval(220,280,15,15);
        g.fillOval(190,280,15,15);
        g.fillOval(160,280,15,15);
        g.fillOval(130,280,15,15);
        g.drawLine(130,285,470,285);
        g.drawLine(288,490,288,120);
       
        g.fillOval(460,240,15,15);
        g.fillOval(430,240,15,15);
        g.fillOval(400,240,15,15);
        g.fillOval(370,240,15,15);
        g.fillOval(340,240,15,15);
        g.fillOval(310,240,15,15);
        g.fillOval(280,240,15,15);
        g.fillOval(250,240,15,15);
        g.fillOval(220,240,15,15);
        g.fillOval(190,240,15,15);
        g.fillOval(160,240,15,15);
        g.fillOval(130,240,15,15);
        g.drawLine(130,245,470,245);
        g.drawLine(318,490,318,120);
  
        g.fillOval(460,200,15,15);
        g.fillOval(430,200,15,15);
        g.fillOval(400,200,15,15);
        g.fillOval(370,200,15,15);
        g.fillOval(340,200,15,15);
        g.fillOval(310,200,15,15);
        g.fillOval(280,200,15,15);
        g.fillOval(250,200,15,15);
        g.fillOval(220,200,15,15);
        g.fillOval(190,200,15,15);
        g.fillOval(160,200,15,15);
        g.fillOval(130,200,15,15);
        g.drawLine(130,205,470,205);
        g.drawLine(348,490,348,120);
        
        g.fillOval(460,160,15,15);
        g.fillOval(430,160,15,15);
        g.fillOval(400,160,15,15);
        g.fillOval(370,160,15,15);
        g.fillOval(340,160,15,15);
        g.fillOval(310,160,15,15);
        g.fillOval(280,160,15,15);
        g.fillOval(250,160,15,15);
        g.fillOval(220,160,15,15);
        g.fillOval(190,160,15,15);
        g.fillOval(160,160,15,15);
        g.fillOval(130,160,15,15);
        g.drawLine(130,165,470,165);
        g.drawLine(378,490,378,120);
       
        g.fillOval(460,120,15,15);
        g.fillOval(430,120,15,15);
        g.fillOval(400,120,15,15);
        g.fillOval(370,120,15,15);
        g.fillOval(340,120,15,15);
        g.fillOval(310,120,15,15);
        g.fillOval(280,120,15,15);
        g.fillOval(250,120,15,15);
        g.fillOval(220,120,15,15);
        g.fillOval(190,120,15,15);
        g.fillOval(160,120,15,15);
        g.fillOval(130,120,15,15);
        g.drawLine(130,125,470,125);
        g.drawLine(408,490,408,120);
        
        g.drawLine(438,490,438,120);
        g.drawLine(468,490,468,120);
        //Esboço da Imagem
        g.setColor(Color.blue);
        g.drawLine(285,488,220,445);
        g.drawLine(220,445,190,400);
        g.drawLine(190,400,165,370);
        g.drawLine(165,370,130,320);
        g.drawLine(130,320,168,280);
        g.drawLine(168,280,195,250);
        g.drawLine(195,250,235,198);
        g.drawLine(235,198,280,130);
        g.drawLine(280,130,415,300);
        g.drawLine(415,300,290,190);
        g.drawLine(290,190,285,488);*/
      
        
       
    }
    
    public static void main(String[] args) {
        TesteReticulado janela = new TesteReticulado();
    }

}
