/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author bhony
 */
public class Exam_2 {

    private class Node {
       String data;
       Node next;
    }
   private Node head;
   private Node tail;
   int size;
   
    private Node Newnode (String index) throws Exception {
        
        Node node = new Node ();
        if (node == null) {
            throw new Exception("memory not allocated");
            
        } else {
            node.data = index;
            node.next = null;
          return node;          
        }
    }
    private void insertion (String index, int pos) throws Exception {
       if (pos < 0 || pos > size) {
            throw new Exception("Invalid index");
        }
        
        if(pos ==0){
            insertionatBeginning(index);
        
        } else{
            System.out.println();
        }
    }
        
    
    private void insertionatBeginning(String index) throws Exception{
        Node node = Newnode(index);
        if(size == 0){
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        
        tail.next = head;
        size++;
    }
    private void insertionatend (String index) throws Exception {
        Node node = new Node ();
        if (size > 0) {
            tail.next = node;
            tail = node;
        }
        if(size == 0){
            head = tail = node;
        }
        tail.next = head;
        size++;
    }
    
    public void display ()throws Exception {
        if(size == 0){
            throw new Exception("List is Empty");
        }
        
        Node temp = head;
        
        while (temp != tail) {            
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        
        System.out.println(tail.data + "->");
        System.out.println("Null \n");
    }
     public boolean search(String target){
        Node current = head;
        
        while (current != null) {            
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      Exam_2 list = new Exam_2();
      Scanner scn = new Scanner(System.in);
      
      boolean start = true;
        while (start) {            
            System.out.println("1. for number 1");
            System.out.println("2. for number 2");
            
           
            
            int choice = scn.nextInt();
            String index; 
            int pos = 0;
            int number = 1;
            if (number == 1) {
                
            System.out.println("1. enter list of students");
            System.out.println("2. display list of students");
            System.out.println("3. for number 2");
            System.out.println("4. exit");
                switch (choice) {
                    
                case 1:
                    System.out.println("students name");
                    index = scn.nextLine();
                    
                    list.insertion(index, pos);
                    System.out.println(index + " inserted successfully at " + pos);
                    
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    start = false;
                    System.out.println("OFF......");
                    break;
           
                default:
                    System.out.println("Wrong Choice");
                     throw new AssertionError();
               
                   
            } 
            } else {
  
                System.out.println("for number 2 ");
                    System.out.println("=======products=======");
                    System.out.println("fita");
                    System.out.println("pride powder");
                    System.out.println("canola oil");
                    System.out.println("nescafe black coffe");
                    System.out.println("ariel powder");
                   System.out.println("rebisco");
                    System.out.println("steelwool");
                    System.out.println("head and shoulder");
                    System.out.println("nova");
                    System.out.println("tanduay");
                    System.out.println("bearbrand");
                    System.out.println("nature spring water 8oz");
                    System.out.println("coke 1ltr");
                    System.out.println("sprite kasalo");
                    System.out.println("rolyal 1tr");
                    System.out.println("sugar");
            switch (choice) {
                
                case 1:
                   
                    
                    
                    
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    start = false;
                    System.out.println("OFF......");
                    break;
                case 4 :
                    
                    
                    if (number == '1') {
                        list.display();
                    }
                   break; 
 
 
                default:
                    System.out.println("Wrong Choice");
                     throw new AssertionError();
               
            }      
            }
        }
      
    }
    
}
