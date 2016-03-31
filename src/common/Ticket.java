/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author Jennifer
 */
public class Ticket {
    private String gn;
    private static int tId;
    private int t; 

    public String getGn() {
        return gn;
       
    }

    public void setGn(String gn) {
        this.gn = gn;
    }

    public Ticket(String gn) {
        this.gn = gn;
         tId++; 
         t = tId; 
    }

    public static int gettId() {
        return tId;
    }

    public static void settId(int tId) {
        Ticket.tId = tId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.t;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if (this.t != other.t) {
            return false;
        }
        return true;
    }
    
}
