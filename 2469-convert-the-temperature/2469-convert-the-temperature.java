class Solution {
    public double[] convertTemperature(double c) {

       double a[]=new double[2];
       a[0]=c+273.15;
       a[1]=c*1.80+32.00;
       return a;
    }
}