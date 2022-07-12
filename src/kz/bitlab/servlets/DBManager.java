package kz.bitlab.servlets;

import java.util.ArrayList;

public class DBManager {
  private static ArrayList<Employee> staff = new ArrayList<>();
  static {
      staff.add(new Employee("Azamat","Bagdat","IT",500000));
      staff.add(new Employee("Askar","Tursynali","HR",800000));
      staff.add(new Employee("Anel","Aleksandrovna","Design",400000));
      staff.add(new Employee("Aruzhan","Musagalieva","Sub",300000));
      staff.add(new Employee("Kaisar","Baisat","Manager",800000));
  }
  public static ArrayList<Employee> getStaff(){
      return staff;
  }
}
