package functions;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;
public class Calculator {
    Double answer;
    private double tmp;
    public Calculator(){
        answer = 0.0;
    }
    public void plus (Double x){
        if (x==null|answer==null) return;//ignore
        this.answer+=x;
    }
    public void minus( Double x){
        if (x==null|answer==null) return;//ignore
        this.answer-=x;
    }
    public void times ( Double x){
        if (x==null|answer==null) return;//ignore
        this.answer*=x;
    }
    public void divided(Double x  ){
        if (x==null|answer==null) return;//ignore
        if (abs(x)<=0.0){
            System.err.println("the number was divided by 0");
            answer = null;
            return;
        }
        this.answer/=x;
    }


    public Double getAnswer()
    {
        int tmp=0;
        this.tmp = (double)tmp;
        return answer;
    }
}
