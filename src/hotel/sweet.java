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
public class sweet extends room{
    private  double sweetprice;
  
  public sweet(){
  
 super (); 
 
  sweetprice=0 ;
  
  }  
  public sweet (int x, int y,double z){
  super(x,y);
  
  sweetprice=z;
  
  }  
    
    public void  setsweetprice( double sp){
    
   sweetprice=sp; 
    
  }
     
    public double getsweetprice(){
    
    return sweetprice;
   
    }
    
    @Override
    public double getTotalprice(){
    
    double p= sweetprice * super.getDay_of_reserv();
        return p;
    }
    
    
    @Override
    public  String toString(){
    
    String y= super.toString()+"\n"+"Sweet price:"+sweetprice+"\n";
    
    return y;
    }
    
    
    
    
    
}
