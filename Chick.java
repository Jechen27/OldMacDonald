class Chick implements Animal 
{     
  private String myType;     
  private String mySound; 
  private String mySound2;
  public Chick(String type, String sound)     
  {         
    myType = type;         
    mySound = sound;      
  }     
  public Chick(String type, String sound, String sound2)
  {
    myType = type;
    mySound = sound;
    mySound2 = sound2;
  }
  public Chick()  
  {         
    myType = "unknown";          
    mySound = "unknown";   
    mySound2 = "unknown";
  }   
  public String getSound()
  {
    if (mySound2 == null)
      return mySound;
    else
      if (Math.random()<0.5)
        return mySound2;
      else
        return mySound;
  }    
    
  public String getType(){return myType;} 
}