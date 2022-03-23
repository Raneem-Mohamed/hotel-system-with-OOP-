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
public class confrence extends room {
      private double  seatprice;
    private int seatnum;
    public confrence (){
    
    super ();
    
    seatnum=0;
    seatprice=0.0;
   
    
    }
   
    public confrence (int x, int y,int s,double sp){
    
    
    super(x,y);
    
    seatprice=sp;
    seatnum=s;
  
    
    }
    
  public void  setseatprice(double sp ){
  
  seatprice=sp;
  }    
    
      @Override
    public double getTotalprice(){
    
    return seatprice* seatnum;
    }
    
      @Override
     public  String toString(){
    
    String z=super.toString()+"\n"+"number of seat: "+seatnum+"\n"+"seat price:"+seatprice+"\n" ;
    
    return z;
    }

    public double getSeatprice() {
        return seatprice;
    }

    public void setSeatprice(double seatprice) {
        this.seatprice = seatprice;
    }

    public int getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(int seatnum) {
        this.seatnum = seatnum;
    }
    
}
