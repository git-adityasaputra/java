## CATATAN SOURCE CODE COLECTIONS AND LINKEDLIST

**Implementasi Collections Java**
```java
//Menggunakan HashMap
package com.enigmacamp.collections;
import java.util.*;

public class Application  {
    public static void main(String[] args) throws Throwable {

    
    Map<String,String> map1 = new HashMap<>();    
    map1.put("DAD","DAD");
    map1.put("adas","ada");
    map1.put("ada","asda");
    map1.put("asda","asda");
    map1.put("ASdas","ASdas");
    
    Map<String,String> map2 = new TreeMap<>(map1);
    Map<String,String> map3 = new LinkedHashMap<>(map1);
    
    
        System.out.println(map1);
        System.out.println(map1);
        System.out.println(map1);
    }
}
 ```


```java
//Menggunakan Has dan Set
package com.enigmacamp.collections;
import java.util.*;

public class Application  {
    public static boolean test(Integer e){
        return e % 2 != 0;
    }
    public static void main(String[] args) throws Throwable {
        
    List<Integer> anotherList = new ArrayList<>();
    anotherList.add(1);
    anotherList.add(2);
    anotherList.add(3);
   
    
    List<Integer> list = new ArrayList<>();    
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    
    Set<Integer> set1 = new HashSet<>(list);
    Set<Integer> set2 = new TreeSet<>(list);
    Set<Integer> set3 = new LinkedHashSet(list);
    
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
```

```java
//mengunakan for dan iterator
package com.enigmacamp.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Application  {
    public static boolean test(Integer e){
        return e % 2 != 0;
    }
    public static void main(String[] args) throws Throwable {
        
    List<Integer> anotherList = new ArrayList<>();
    anotherList.add(1);
    anotherList.add(2);
    anotherList.add(3);
   
    
    List<Integer> list = new ArrayList<>();    
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    
        for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
            Integer n = it.next();
            if (n % 2 == 0){
                it.remove();
            }
        }
        
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            if (n % 2 == 0){
                it.remove();
            }
        }
        System.out.println(list); 
    }
}
```

```java
//menggunakan lambda,consumer, dan predicate

package com.enigmacamp.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Application  {
    public static boolean test(Integer e){
        return e % 2 != 0;
    }
    public static void main(String[] args) throws Throwable {
        
    List<Integer> anotherList = new ArrayList<>();
    anotherList.add(1);
    anotherList.add(2);
    anotherList.add(3);
   
    
    List<Integer> list = new ArrayList<>();    
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    
    Predicate<Integer> predicate = new Predicate<Integer>(){
        @Override
        public boolean test (Integer e){
            return e % 2 != 0;
        }
    };
        Consumer<Integer> consumer = new Consumer<Integer>(){
            @Override
            public void accept(Integer e){
                System.out.println("This is " + e);
            }
        };
        
    list.stream()
            .filter(e -> e % 2 == 1)
            .forEach(e -> System.out.println("This is " + e));
    // Lambda anonymus metod   
        System.out.println(list);    
    }
}
```

**Linked List**

```java
package id.code.exercisesharian.Testing;

public class App{
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
 
        list.add(1);list.add(3);list.add(4);list.add(3);
        
 
        
        System.out.println(list);
        
        System.out.println(list.get(0));
        
        list.remove(0);

//        list.edit(1, 4);
//        System.out.println(list.count());
    }
}
```



```java
package id.code.exercisesharian.Testing;

public class LinkedList<T> {

    private Node<T> head;

    private static class Node<T> {

        T data;
        Node next;
        Node (T data){
            this.data = data;
        }
        
        Node <T> get(int depth){
            if (depth == 0) {
                return this;
            } else if (next != null){
                return next.get(depth - 1);
            } else {
                return null;
            }
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
        
        @Override
        public String toString(){
            //return data + (next != null ? ", " +next : "");
            if(next != null){
                return data + ", " + next;
            } else{
                return data.toString();
            }
        }

    }

    public void add(T data) {
        Node node = new Node(data, null);
        if (head != null) {

            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;

        } else {
            head = node;
        }
    }

    public int count() {
        int count = 0;
        Node n = head;
        while (n != null) {
            count++;
            n = n.next;
        }
        return count;
    }

    public void edit(int index, T data) {
        if (head != null){
            Node<T> n = head.get(index);
            n.data = data;
        }
        throw new IndexOutOfBoundsException(index);
    }

    public void insert(int index, T data) {
      if (head != null){
          Node<T> node = new Node(data);
          if (index > 0) {
              Node <T> prev = head.get(index - 1);
              Node <T> next = prev.next;
              prev.next = node;
          } else {
              Node <T> next = head;
              head = node;
          }
      }

    }

    public T remove(int index) {
        if(head != null){
            Node <T> node;
            if (index != 0) {
                Node <T> prev = head.get(index - 1);
                node = prev.next;
                prev.next = node.next;
            } else {
                node = head;
                head = node.next;
            }
            return node.data;
        } else {
            throw new IndexOutOfBoundsException(index);
        }        
    }

    public T get(int index) {
        if (head != null ){
            int count =1;
            Node <T> n =head;
            while(n != null){
                n =n.next;
            }
        } else {
            return null;
        }
        return null;
    }
    
//    public T getFirst(){
//        return head != null ? head.first().data : null);
//    }
//    
//    public T getLast(){
//        return head != null ? head.last().data : null);
//    }
    
    @Override
    public String toString(){
        return "[" + (head != null ? head.toString(): "") + "]";
    } 

}
```