
//package byt.st;
import javax.swing.*;    
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;

class RB1 extends JFrame implements ActionListener{
  
JRadioButton rb1,rb2,rb3,rb4;    
JButton b1;
JLabel l1;
String s[]=new String[100];
RB1(){
  try{  func();}
  catch(Exception e){}
l1=new JLabel(" :Flight Name:           :Duration:       :Cost:");  
l1.setBounds(100,20,2000,40);
rb1=new JRadioButton(s[0]);    
rb1.setBounds(100,50,1000,30);      
rb2=new JRadioButton(s[1]);    
rb2.setBounds(100,70,1000,30); 
rb3=new JRadioButton(s[2]);    
rb3.setBounds(100,90,1000,30); 
rb4=new JRadioButton(s[3]);    
rb4.setBounds(100,110,1000,30); 
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);bg.add(rb3);bg.add(rb4);
b1=new JButton("BOOK");    
b1.setBounds(100,150,80,30);    
b1.addActionListener(this);    
add(rb1);add(rb2);add(rb3);add(rb4);add(b1);
add(l1);

setSize(1000,500);    
setLayout(null);    
setVisible(true);    
}
void func() throws Exception {     
    
    int i=0;
    FileReader fr=new FileReader("D:\\flight.txt");
    BufferedReader br=new BufferedReader(fr);
    while((br.read())!=-1)
    {
        
        s[i]=br.readLine();
        i++;
    }   
    for( i=0;i<4;i++)
    {
        System.out.println(s[i]);
    }
}

public void actionPerformed(ActionEvent f){   
    if(rb1.isSelected()||rb2.isSelected()||rb3.isSelected()||rb4.isSelected() ){
JOptionPane.showMessageDialog(this,"TICKET BOOKED ");    
}
    else{
JOptionPane.showMessageDialog(this,"NO FLIGHT SELECTED"); 
}
}
}
class RB2 extends JFrame implements ActionListener{
  
JRadioButton rb1,rb2,rb3,rb4;    
JButton b1;
JLabel l1;
String s1[]=new String[100];
RB2(){
  try{  func2();}
  catch(Exception e){}
l1=new JLabel("     Flight Name:            Duration:                 Cost:  ");  
l1.setBounds(110,20,2000,40);
rb1=new JRadioButton(s1[0]);    
rb1.setBounds(100,50,1000,30);      
rb2=new JRadioButton(s1[1]);    
rb2.setBounds(100,70,1000,30); 
rb3=new JRadioButton(s1[2]);    
rb3.setBounds(100,90,1000,30); 
rb4=new JRadioButton(s1[3]);    
rb4.setBounds(100,110,1000,30); 
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);bg.add(rb3);bg.add(rb4);
b1=new JButton("BOOK");    
b1.setBounds(100,150,80,30);    
b1.addActionListener(this);    
add(rb1);add(rb2);add(rb3);add(rb4);add(b1);
add(l1);

setSize(1000,500);    
setLayout(null);    
setVisible(true);    
}
void func2() throws Exception {     
    
    int i=0;
    FileReader fr=new FileReader("D:\\flight2.txt");
    BufferedReader br=new BufferedReader(fr);
    while((br.read())!=-1)
    {
        
        s1[i]=br.readLine();
        i++;
    }   
    for( i=0;i<4;i++)
    {
        System.out.println(s1[i]);
    }
}

public void actionPerformed(ActionEvent f){   
    if(rb1.isSelected()||rb2.isSelected()||rb3.isSelected()||rb4.isSelected() ){
JOptionPane.showMessageDialog(this,"TICKET BOOKED ");    
}
    else{
JOptionPane.showMessageDialog(this,"NO FLIGHT SELECTED"); 
}
}
}
public class RadioButtonExample extends JFrame implements ActionListener{    

JRadioButton rb1,rb2,rb3,rb4;    
JButton b;
JLabel l;
String s[]=new String[100];
RadioButtonExample(){      
l= new JLabel("Flights Available For :");
l.setBounds(100,10,200,40);
rb1=new JRadioButton("PUNE TO DELHI");    
rb1.setBounds(100,50,1000,30);      
rb2=new JRadioButton("DELHI TO CHANDIGARH");    
rb2.setBounds(100,100,1000,30);    
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);    
b=new JButton("click");    
b.setBounds(100,150,80,30);    
b.addActionListener(this);    
add(rb1);add(rb2);add(b);add(l);    
setSize(500,500);    
setLayout(null);    
setVisible(true);    
}


public void actionPerformed(ActionEvent e){    
if(rb1.isSelected()){  
    RB1 ob=new RB1();
   
 
}    
if(rb2.isSelected()){   
    RB2 ob2=new RB2();
   
}    
}    
public static void main(String args[]){    
new RadioButtonExample();    
}}   

