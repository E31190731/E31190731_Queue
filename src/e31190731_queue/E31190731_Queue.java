/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190731_queue;
import java.util.*;

/**
 *
 * @author ridho
 */
public class E31190731_Queue {
    static int nim;
    static String nama;
    E31190731_Queue next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
    public void input(){
        System.out.print("Masukan NIM : ");
        nim = in.nextInt();        
        System.out.print("Masukan Nama : ");
        nama = str.nextLine();
        next = null;
    }
    public void read(){
        System.out.println("|| "+nim+"\t|| "+nama+"\t||");
    }
    public static void main(String[] args) {
        int menu = 0;
        linked que = new linked();
        while (menu!=4){
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n masukan angka : ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    que.enque();
                    break;
                case 2:
                    que.deque();
                    break;
                case 3:
                    que.view();
                    break;
                case 4:
                    System.out.println("- keluar -");
                    break;
                default:
                    System.out.println("- salah -");
                    break;
            }
            System.out.println("");
        }
    }
}
    class linked{
    E31190731_Queue head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        E31190731_Queue Queue = new E31190731_Queue();
        Queue.input();
        if (head==null)
            head = Queue;
        else 
            tail.next = Queue;
        tail = Queue;
    }
    public void deque(){
        if (head==null)
            System.out.println("- kosong -");
        else {
            System.out.println("Keluar Data Dengan NIM : "+head.nim);
            head = head.next;
        }
    }
    public void view(){
        if(head==null)
            System.out.println("- kosong -");
        else {
            System.out.println("|| NIM \t\t|| Nama \t||");
            for(E31190731_Queue a=head; a!=null; a=a.next) a.read();
        }
    }
}