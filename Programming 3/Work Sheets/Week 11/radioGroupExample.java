JRadioButton firstRadioButton=new JRadioButton("Female",true);  
 JRadioButton secondRadioButton=new JRadioButton("Male");  

 //Create a radio button group using ButtonGroup  
 ButtonGroup btngroup=new ButtonGroup();  

 btngroup.add(firstRadioButton);  
 btngroup.add(secondRadioButton);  

 //Create a button with text ( What i selected )  
 JButton button=new JButton("What I selected");  

 //Add action listener to created button  
 button.addActionListener(this);  

 //Get selected JRadioButton from ButtonGroup  
  public void actionPerformed(ActionEvent event)  
  {  
     if(event.getSource()==button)  
     {  
        Enumeration<AbstractButton> allRadioButton=btngroup.getElements();  
        while(allRadioButton.hasMoreElements())  
        {  
           JRadioButton temp=(JRadioButton)allRadioButton.nextElement();  
           if(temp.isSelected())  
           {  
            JOptionPane.showMessageDialog(null,"You select : "+temp.getText());  
           }  
        }            
     }
  }