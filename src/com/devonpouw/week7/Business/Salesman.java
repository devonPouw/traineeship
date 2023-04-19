package com.devonpouw.week7.Business;

public class Salesman extends Employee {
   private int commission;
   public Salesman(String name, String address, String phoneNumber, float experienceInYears, int commission){
      super(name, address, phoneNumber, experienceInYears);
      this.commission = commission;
   }

   public int getCommission() {
      return commission;
   }

   public void setCommission(int commission) {
      this.commission = commission;
   }
}
