package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0))+word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0)+"."+lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double input = (vatRate/100)* originalPrice + originalPrice;
        BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP); 
        return bd.doubleValue();

    }

    public String reverse(String sentence) { 
        if (sentence.isEmpty()){
            return sentence;
        }
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }

    public int countLinuxUsers(List<User> users) {
        int count=0;        
        for(User u:users){
            if(u.getType().contains("Linux")){
                count++;
            }
        }
        return count;
    }
}
