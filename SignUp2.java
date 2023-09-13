
package bank.management.system;
import javax .swing.*;
import java .awt.*;
import java.awt.event.*;

public class SignUp2 extends JFrame implements ActionListener {
//   JLabel formno,  personalDetails;

    JTextField   panTextField,aadharTextField;
           JRadioButton eyes,eno, syes, sno; 
           JButton next;
   JComboBox religion,category,occupation,education,income;
        String formno;
        long random;
    
    SignUp2(String formno){
        this.formno=formno;
         setTitle("NEW APPLICATION FORM -PAGE 2");
        setLayout(null);  
  
          JLabel  additionalDetails=new JLabel("Page 2:  Additional Details");
          additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(  additionalDetails);
        
        JLabel sreligion=new JLabel("Religion:");
      sreligion .setFont(new Font("Raleway",Font.BOLD,20));
      sreligion.setBounds(100, 140, 100, 30);
        add(  sreligion);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","others"};
        religion=new JComboBox (valReligion);
       religion .setBounds(300,140,400,30);
       religion.setBackground(Color.WHITE);
       add(religion);
        
           JLabel category1=new JLabel("Category:");
        category1.setFont(new Font("Raleway",Font.BOLD,20));
   category1.setBounds(100, 190, 200, 30);
        add( category1);
        
           String valcategory[]={"General","OBC","SC","ST","Others"};
       category=new JComboBox (valcategory);
          category.setBounds(300,190,400,30);
           category.setBackground(Color.WHITE);
                add(    category);
        
           JLabel sincome=new JLabel("Income :");
        sincome.setFont(new Font("Raleway",Font.BOLD,20));
        sincome.setBounds(100, 240, 200, 30);
        add( sincome);
        
          String incomecategory[]={"Null"," 1,50000","2,25000","3,00000","Upto 60000"};
         income=new JComboBox (incomecategory);
          income.setBounds(300,240,400,30);
            income.setBackground(Color.WHITE);
                add(    income);
                
           JLabel educational=new JLabel("Educational");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100, 290, 400, 30);
        add(educational);

           JLabel qualification =new JLabel("Qualification :");
      qualification .setFont(new Font("Raleway",Font.BOLD,20));
      qualification .setBounds(100, 315, 200, 30);
        add(qualification );
        
         String educationcategory[]={"Non-Gradutaion","Graduate","Post-Graduation","Doctrate","Others"};
       education=new JComboBox (educationcategory);
          education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
                add(    education);
       
        
           JLabel marital=new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100, 390, 200, 30);
        add(marital);
       
        
         String occupationcategory[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
       occupation=new JComboBox (occupationcategory);
         occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
                add(    occupation);
       
        
        
        JLabel pannumber=new JLabel("Pan Number :");
        pannumber.setFont(new Font("Raleway",Font.BOLD,20));
       pannumber.setBounds(100, 440, 200, 30);
        add(  pannumber);
     
        panTextField=new JTextField();
       panTextField.setBounds(300,440,400,30);
        panTextField.setFont(new Font("Arial",Font.BOLD ,14 ));
        add( panTextField); 
        
           JLabel  aadhar=new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
    aadhar.setBounds(100, 490, 200, 30);
        add( aadhar);
        
      aadharTextField=new JTextField();
     aadharTextField.setBounds(300,490,400,30);
         aadharTextField.setFont(new Font("Arial",Font.BOLD ,14 ));
        add(   aadharTextField); 
        
           JLabel senior=new JLabel("Senior Citizen:");
  senior .setFont(new Font("Raleway",Font.BOLD,20));
  senior.setBounds(100, 540, 200, 30);
        add(senior);
        
         
      syes=new JRadioButton("YES");
           syes.setBounds(300, 540, 100, 30);
          syes.setBackground(Color.WHITE);
               syes.setForeground(Color.BLACK);
        add(  syes);

       sno=new JRadioButton("NO");
            sno.setBounds(450, 540, 100, 30);
            sno.setBackground(Color.WHITE);
          sno.setForeground(Color.BLACK);
        add(sno);
       
          ButtonGroup  seniorgroup=new ButtonGroup();
           seniorgroup.add(syes);
      seniorgroup.add(sno);
     
        
           JLabel state=new JLabel("Existing Account:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 590, 200, 30);
        add(state);
    
            
      eyes=new JRadioButton("YES");
           eyes.setBounds(300, 590, 100, 30);
          eyes.setBackground(Color.WHITE);
               eyes.setForeground(Color.BLACK);
        add(  eyes);

       eno=new JRadioButton("NO");
            eno.setBounds(450, 590, 100, 30);
            eno.setBackground(Color.WHITE);
          eno.setForeground(Color.BLACK);
        add(eno);
       
          ButtonGroup   existingaccountgroup=new ButtonGroup();
           existingaccountgroup.add(eyes);
        existingaccountgroup.add(eno);
     
        
        
        
     JButton next=new JButton("Next"); 
       next.setForeground(Color.WHITE);
       next.setBackground(Color.BLACK);
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       add(next);
       
        getContentPane().setBackground(Color.cyan);
    
    setSize(800,800);    
    setVisible(true);
    setLocation(350,10);
    
    }
   public void actionPerformed(ActionEvent ae){
         String formno=""+random;
String sreligion= (String) religion.getSelectedItem();
   String scategory=(String) category.getSelectedItem();
   String sincome=(String) income.getSelectedItem();
  String seducation= (String) education.getSelectedItem();
  String soccuptaion= (String) occupation.getSelectedItem();
  String seniorcitizen =null;
  if(syes.isSelected()){
      seniorcitizen="YES";
  }else if(sno.isSelected()){
 seniorcitizen ="NO";
  }
String existingaccount =null;
  if(eyes.isSelected()){
    existingaccount="YES";
  }else if(eno.isSelected()){
existingaccount ="NO";
  }
String span=  panTextField.getText();
String saadhar =aadharTextField.getText();
  
    
    try{
        if(sreligion.equals("")){
        JOptionPane.showMessageDialog(null, "Religion is Required");
        }else{
         Conn c=new Conn();    
     String query ="insert into signup2 values('"+formno+"' ,'"+sreligion+"'  ,'"+scategory+"','"+sincome+"','"+seducation+"' ,'"+soccuptaion+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                                               
           c.s.executeUpdate(query);
          setVisible (false);
          new SignUp3(formno).setVisible(true);
        }
    }catch(Exception e){
        System.out.println(e);
    }
   }
         
   public static void main(String[] args) {
      new SignUp2("");      
    }

}
    

