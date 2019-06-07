/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloColas;

import javax.swing.JOptionPane;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 *
 * @author RiveraFranco
 */
public final class Simulacion {
    private double lambda;
    private double mu;
    
    private double rho, L, Lq, W, Wq, eficiencia;
    
    private int[] range = new int[2];
    private double[] lambdaPoints;
    private double[] muPoints;
    
    public Simulacion(double lambda, double mu, boolean simular)
    {
        this.lambda = lambda;
        this.mu = mu;
        
        
        if(simular)
            simulate();
        else
            calculateValues();
    }
    
    public void simulate()
    {
        calculatePointsLambda(0,500);
        calculatePointsMu(0,500);
        calculateNewValues();
    }
    
    public void setRange(int min, int max)
    {
        range[0] = min;
        range[1] = max;
    }
    
    public double getYLambda(int x)
    {
        return lambdaPoints[x];
    }
    
    public double[] getPointsLambda()
    {
        return lambdaPoints;
    }
    
    public double getP(int x)
    {
        Expression e = new ExpressionBuilder("(1-(x/y))*((x/y)^z)")
                .variables("x", "y", "z")
                .build()
                .setVariable("x", lambda)
                .setVariable("y", mu)
                .setVariable("z", x);
            
            double p = (e.evaluate());
            p = Math.round(p * Math.pow(10, 3)) / Math.pow(10, 3);
            
            return p;
    }
    
    
    private void calculatePointsLambda()
    {
        Expression form = new ExpressionBuilder("log(x/l)^(-1/l)")
                .variables("x","l")
                .build()
                .setVariable("l", lambda);
        
        for(int i=0; i<range[1]; i++)
        {
            form.setVariable("x", i);
            lambdaPoints[i] = form.evaluate();
        }
    }
    
    /**
     * @param lim_inferior
     * @param lim_superior 
     */
    private void calculatePointsLambda(int lim_inferior, int lim_superior)
    {
        lambdaPoints = new double[lim_superior];
        
        for(int i=lim_inferior; i<lim_superior-1; i++)
        {
            double val =  0;
            
            try {
                val = Math.log(Math.random()) * (-1 / lambda);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            lambdaPoints[i] = val;
        }
    }
    
    private void calculatePointsMu()
    {
        Expression form = new ExpressionBuilder("log(x/m)^(-1/m)")
                .variables("x","m")
                .build()
                .setVariable("m", mu);
        
        for(int i=range[0]; i<range[1]; i++)
        {
            form.setVariable("x", i);
            muPoints[i] = form.evaluate();
        }
    }
    
    private void calculatePointsMu(int lim_inferior, int lim_superior)
    {
        muPoints = new double[lim_superior];
        
        for(int i=lim_inferior; i<lim_superior-1; i++)
        {
            double val =  0;
            
            try {
                val = Math.log(Math.random()) * (-1 / mu);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            muPoints[i] = val;
        }
    }
    
    public double[] getPointsMu()
    {
        return muPoints;
    }
    
    public double getYMu(int x)
    {
        return muPoints[x];
    }
    
    private void calculateValues()
    {
        rho = lambda / mu;

        L = rho / (1.0 - rho);
        Lq = rho * rho / (1 - rho);

        W = 1.0 / (mu - lambda);
        Wq = rho / (mu - lambda);
        
        eficiencia = mu/(mu-lambda);
    }
    
    private void calculateNewValues()
    {
        calculateLambda();
        calculateMu();
        calculateValues();
    }
    
    private void calculateLambda()
    {
        double sum = 0;
        int i = 0;
        
        for(i=0; i<lambdaPoints.length; i++)
        {
            sum += lambdaPoints[i];
        }
        
        double prom = sum / (i-1);
        
        lambda = 1 / prom;
    }
    
    private void calculateMu()
    {
        double sum = 0;
        int i = 0;
        
        for(i=0; i<muPoints.length; i++)
        {
            sum += muPoints[i];
        }
        
        double prom = sum / i;
        
        mu = 1 / prom;
    }
    
    public double Pn(double rho, int n) {
        if (n == 0)
        {
            return 1.0 - rho;
        } else if (n == 1) {
            return rho * (1.0 - rho);
        } else {
            return Math.pow(rho, n) * (1.0 - rho);
        }
    }
    
    public void setLambda(double lambda)
    {
        this.lambda = lambda;
    }
    
    public double getLambda()
    {
        return this.lambda;
    }

    public double getMu() {
        return mu;
    }

    public void setMu(double mu) {
        this.mu = mu;
    }
    
    public double getRho()
    {
        return rho;
    }

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }

    public double getLq() {
        return Lq;
    }

    public void setLq(double Lq) {
        this.Lq = Lq;
    }

    public double getW() {
        return W;
    }

    public void setW(double W) {
        this.W = W;
    }

    public double getWq() {
        return Wq;
    }

    public void setWq(double Wq) {
        this.Wq = Wq;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double ef) {
        this.eficiencia = ef;
    }
    
    public double wt(double tiempo){
        
        return 1-Math.pow(Math.E,(-(mu-lambda))*tiempo);
        
    }
    
    public double wqdet(double tiempo){
        
        return 1-(lambda/mu)*Math.pow(Math.E,(-(mu-lambda))*tiempo);
        
    }
}