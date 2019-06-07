/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaInterno;

import java.util.concurrent.Delayed;

/**
 *
 * @author StevenMena
 */
public class Botella  {
    private int id;
    private boolean limpiado;
    private int llenado;
    private boolean tapado;
    private boolean stiker;
    private int min;
    private int seg;

    /**
     * @return the limpiado
     */
    public boolean isLimpiado() {
        return limpiado;
    }

    /**
     * @param limpiado the limpiado to set
     */
    public void setLimpiado(boolean limpiado) {
        this.limpiado = limpiado;
    }

    /**
     * @return the llenado
     */
    public int getLlenado() {
        return llenado;
    }

    /**
     * @param llenado the llenado to set
     */
    public void setLlenado(int llenado) {
        if(llenado==330)
        this.llenado = llenado;
    }

    /**
     * @return the tapado
     */
    public boolean isTapado() {
        return tapado;
    }

    /**
     * @param tapado the tapado to set
     */
    public void setTapado(boolean tapado) {
        this.tapado = tapado;
    }

    /**
     * @return the stiker
     */
    public boolean isStiker() {
        return stiker;
    }

    /**
     * @param stiker the stiker to set
     */
    public void setStiker(boolean stiker) {
        this.stiker = stiker;
    }
    
        public String toString(){
    
        return String.format("ID: %d, Limpiada: %s", id, limpiado);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the seg
     */
    public int getSeg() {
        return seg;
    }

    /**
     * @param seg the seg to set
     */
    public void setSeg(int seg) {
        this.seg = seg;
    }
}
