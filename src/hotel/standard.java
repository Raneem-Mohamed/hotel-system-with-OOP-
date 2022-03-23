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
public class standard extends room {
    private int num_of_beds;
   private double bed_price;
    
    
 public standard (){
 
super (); 

 this.num_of_beds=0;
 
 this.bed_price=0.0;
 
 }   
    public standard (int x,int d, int n ,double bp){
 
super (x,d); 

 num_of_beds=n;
 
    bed_price=bp;
    }
      
    public void setnum_of_beds(int num_of_beds ){
    
    
    this.num_of_beds=num_of_beds;
   
    }
    
   public int getnum_of_beds(){
   return num_of_beds;
   } 
    
    
   
    
      
    public void setbedprice (double bedprice ){
    
    
    this.bed_price=bedprice;
   
    }
    
   public double getbedprice(){
   return bed_price;
   } 
    @Override
   public double getTotalprice()
   {double price;
   price=bed_price*super.getDay_of_reserv();
   return price;
   }
    @Override
   public String toString()
   {
       String x=super.toString()+"\n"
               +"number of beds:"+num_of_beds+"\n"+
               "bed price"+bed_price+"\n";
   return x;
  }

  
  
}
