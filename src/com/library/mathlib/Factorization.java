package com.library.mathlib;

import com.library.io.Printer;

import java.util.ArrayList;
import java.util.Collections;

public class Factorization{
    public Long n;
    public Long limit;
    public ArrayList<Long> factors;
    public Factorization(Long n){
        this.n=n;
        this.factors=new ArrayList<Long>();
        this.limit=Math.round(Math.sqrt(n));
        this.process();
    }
    private void process(){
        for(long i=2;i<=limit;i++){
            if(n%i == 0){
                factors.add(i);
                Long div=n/i;
                if(div != i){
                    factors.add(div);
                }
            }
        }
        Collections.sort(factors);
    }
    public ArrayList<Long> getFactors(){
        return factors;
    }
    public long getNumberOfFactors(){
        return factors.size();
    }
    public void printFactors(){
        Printer.printlnList(factors);
    }
}
