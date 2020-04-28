package com.dominikawebsite.javaWwa6;

public class DeleteListaDwustronna {

    /*
+ Blogi:
- http://www.monkeyuser.com
- https://dzone.com
- https://www.javacodegeeks.com
- http://letstalkaboutjava.blogspot.com
- https://8thlight.com/blog/
- http://www.baeldung.com
- https://howtodoinjava.com
- http://javarevisited.blogspot.com
- https://www.javaworld.com
- http://www.mkyong.com
- https://www.javaworld.com
- http://blog.testdouble.com
- http://blog.cleancoder.com
- http://www.yegor256.com
- http://tddkatas.codeplex.com
- http://codingdojo.org/KataCatalogue/
- http://www.michael-whelan.net/code-katas-for-practicing-tdd/

    @Override
   public void delete(T key) {
       if (head == null) {
           throw new RuntimeException("Empty list!");
       }
       Node currentNode = head;
       Node previousNode = head;
       Node nextNode = head;
       while (!currentNode.data.equals(key)) {
           previousNode = currentNode;
           currentNode = currentNode.next;
           nextNode = currentNode.next;
       }
       //in case of removing head change it
       if (currentNode == head) {
           head = currentNode.next;
       }
       if (previousNode != null) {
           previousNode.next = currentNode.next;
       }
       if (nextNode != null) {
           nextNode.previous = currentNode.previous;
       }
       currentNode.next = null;
       currentNode.previous = null;
       currentNode = null;
   }
     */
}
