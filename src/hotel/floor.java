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
public class floor {
    private int floornum;
    private int num_of_rooms;
    room []r=new room[num_of_rooms];

    public int getFloornum() {
        return floornum;
    }

    public void setFloornum(int floornum) {
        this.floornum = floornum;
    }

    public int getNum_of_rooms() {
        return num_of_rooms;
    }

    public void setNum_of_rooms(int num_of_rooms) {
        this.num_of_rooms = num_of_rooms;
    }
    public void avilableroom()
    {   for (room r1 : r) {
            if (r1 instanceof standard) {
                standard st = (standard) r1;
                if( st.getIsreserv()==false)
                {st.toString();}
            } else if (r1 instanceof sweet) {
                sweet sw = (sweet) r1;
                if( sw.getIsreserv()==false)
                {sw.toString();}
            } else {
                confrence conf = (confrence) r1;
                if( conf.getIsreserv()==false)
                {conf.toString();}
            }
        }
    
    }
    public double calc_profit()
    {double fp=0;
        for (room r1 : r) {
            if (r1 instanceof standard) {
                standard st = (standard) r1;
                if( st.getIsreserv()==true)
                {fp=fp+st.getTotalprice();}
            } else if (r1 instanceof sweet) {
                sweet sw = (sweet) r1;
                if( sw.getIsreserv()==true)
                {fp=fp+sw.getTotalprice();}
            } else {
                confrence con = (confrence) r1;
                if( con.getIsreserv()==true)
                {fp=fp+con.getTotalprice();}
            }
        }
    return fp;
    }
    
    
}
