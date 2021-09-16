package com.company;
import java.util.*;
public class Main {

    static boolean checkPrime(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count ++;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }

    static int getCounts(){
        Scanner Sc = new Scanner(System.in);
        Vector<Integer> primes = new Vector<>();
        int countRes = 0;
        System.out.println("Enter the Num:");
        int inputNumber = Sc.nextInt();
        for(int j = 1; j<=inputNumber; j++){
            if(checkPrime(j)){
                primes.add(j);
            }
        }
        for(int z = 0; z<primes.size(); z++){
            for(int u = 0; u<primes.size(); u++){
                String concatPrime = primes.get(z) +""+ primes.get(u);
                if(checkPrime(Integer.parseInt(concatPrime))){
                    countRes ++;
                }
            }
        }
        return  countRes;
    }

    public static void main (String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int TestCases = Sc.nextInt();

        for(int i = 0; i<TestCases; i++){
            System.out.println(getCounts());
        }
    }
}