/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author KAILASH
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;

    public ArrayList<Supplier> getPersons() {
        return supplierList;
    }
    
    public SupplierDirectory(){
        this.supplierList = new ArrayList<Supplier>();
    }
    
    public ArrayList<Supplier> getSupplierList(){
        return supplierList;
    }
    
    public Supplier addSupplier(){
        Supplier p = new Supplier();
        supplierList.add(p);
        return p;
    }
    
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }
    
    
    
    public Supplier searchSupplier(String keyWord) {
        for(Supplier s : supplierList) {
            if(keyWord.equals(s.getSupplyName())) {
                return s;
            }
        }
        return null;
    }
    
}
