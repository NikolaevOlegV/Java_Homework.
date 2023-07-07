// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, 
// метод toString возвращающий строку с элементами множества
//  и метод позволяющий читать элементы по индексу.

package Homework_6;


import java.util.HashMap;
import java.util.Iterator;

public class Program {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        addToHMap(0);
        addToHMap(7);
        addToHMap(43);
        addToHMap(13); 
        addToHMap(44);
        addToHMap(1);
        addToHMap(9);
        addToHMap(38);
        addToHMap(10);
        addToHMap(50);
        System.out.println(isEmpty());

        printConsole();
        System.out.println();
        try {
            System.out.println(printOneEl(20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addToHMap(Integer number){
        hMap.put(number, OBJ);   
    } 


    private static boolean isEmpty(){
        return hMap.isEmpty();
    }


    private static void printConsole(){
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }


    private static int printOneEl(int index){
        return (Integer)hMap.keySet().toArray()[index];
    }      
}