package bank.management.system;
import javax .swing.*;
import java .awt.*;
import java .awt.event.*;
import java.sql.*;
import java .util.Date;
public class FastCash extends JFrame implements ActionListener {
    
  JButton hundered,withdrawl,fastcash, pinchange,   ministatement, balanceenquiry,  back ;
    String pinnumber;
    
 FastCash(String pinnumber){
     this.pinnumber=pinnumber;
     setLayout(null);
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image  =new JLabel(i3);
        image.setBounds(0, 0, 900,900 );
        add (image);
        
        
        JLabel text=new JLabel ("SELECT WITHDRAWL AMOUNT");
        text.setBounds(200 ,300, 700, 35);
        text.setFont(new Font ("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
       image. add(text);
        
     hundered=new JButton("100");
        hundered.setBounds(170,415,150,30);
           hundered.addActionListener(this);
        image.add(hundered);
        
      withdrawl=new JButton("500");
       withdrawl.setBounds(355,415,150,30);
          withdrawl.addActionListener(this);
       image.add(withdrawl);
        
         fastcash=new JButton("1000");
        fastcash.setBounds(170,450,150,30);
         fastcash.addActionListener(this);
        image.add(fastcash);
        
          ministatement=new JButton("2000");
          ministatement.setBounds(355,450,150,30);
           ministatement.addActionListener(this);
          image.add(    ministatement);
        
      pinchange=new JButton("5000");
      pinchange.setBounds(170,485,150,30);
      pinchange.addActionListener(this);
      image.add(pinchange);
        
     balanceenquiry=new JButton("10000");
  balanceenquiry.setBounds(355,485,150,30);
   balanceenquiry.addActionListener(this);      
  image.add( balanceenquiry);
        
         back=new JButton("BACK");
            back.setBounds(355,520,150,30);
             back.addActionListener(this);
          image.add(back);
        
          
        
        
setSize (900,900);
setLocation(300,0);
setUndecorated(true);
 setVisible (true);
 }
 public void  actionPerformed(ActionEvent ae){
   if(ae.getSource()== back ){
     setVisible(false);
     new Transactions(pinnumber).setVisible(true);
   }else {
       String amount =((JButton)ae.getSource()).getText().substring(3);
       Conn c=new Conn();
      try{
          ResultSet rs =c.s.executeQuery("select* from bank where pinnumber = '"+pinnumber+"' ");
          System.out.println("Bal : " + rs.getString("amount"));
       int balance = 0;
       while (rs.next()){ 
           if (rs.getString("type").equals("Deposit")){
               
  balance += Integer.parseInt(rs.getString("amount"));
                }else {
balance -=  Integer.parseInt(rs.getString("amount"));
       }
       }
       if (ae.getSource ()!= back&& balance < Integer.parseInt(amount)){
         JOptionPane.showMessageDialog(null,"Insufficient Balance");
         return;
        }
       Date date=new Date();
       String query="insert into bank values('"+pinnumber+"', '"+date+"' ,'Withdrawl','"+ amount+"')";
       c.s.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Rs "+amount + " Debited Successfully");
  setVisible(false);
  new Transactions(pinnumber).setVisible(true);
      
    }catch (Exception e){
           System.out.println(e);
       }
    }
 }
   public static void main(String[] args) {
new FastCash("");       
    }
}


 