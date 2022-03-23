/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Electronica
 */
public abstract class room {
   private int room_num;
   private int day_of_reserv;
   private boolean isreserv;
    
    
    public room (){
    
    room_num=0;
  day_of_reserv =0;
     isreserv=false;
  
    }
    
  public room (int room_num,int day_of_reserv) {
  
  this.room_num=room_num;
  this.day_of_reserv=day_of_reserv;
     
  
  } 
    

    public void setRoom_num(int room_num) {
        this.room_num = room_num;
    }

public int getRoom_num() {

 return room_num;

}   
    
    

    public void setDay_of_reserv(int day_of_reserv) {
        this.day_of_reserv = day_of_reserv;
    }

    
public int getDay_of_reserv(){

return day_of_reserv;

}    
    
public void setIsreserv(boolean isreserv){

this.isreserv=isreserv;

}    

public boolean getIsreserv(){

return isreserv;
}



public void reserv(){
 
this.isreserv=true;

System.out.print("the room is reserved"); 
} 

public abstract double getTotalprice();

public void cheak (){

if (this.isreserv){

System.out.print("the room is reserved");}

else {System.out.print("the room is not reserved");}
}

   @Override
   public String toString()
{String s="room number: "+room_num+"\n"
        +"days of reservation: "+day_of_reserv+"\n";
return s;
}
    
}
