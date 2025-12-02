package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.containers.Circle;
import ge.tbc.testautomation.containers.Rectangle2;
import ge.tbc.testautomation.containers.ReverseRectangleComparator;

import java.util.*;

public class ContainersAndComparing {
    public static void main (String [] args){
        ArrayList<String> phonenumber= new ArrayList<>();
        phonenumber.add("555-542-231");
        phonenumber.add("555-887-987");
        phonenumber.add("555-887-987");
        phonenumber.add("555-189-6667");

        Iterator<String> iterator = phonenumber.iterator();

   while(iterator.hasNext()) {
       String num = iterator.next();
       System.out.println(num);
   }
       HashMap<String, String> hashMap = new HashMap<>();
       hashMap.put("თამარი", "555-542-231");
       hashMap.put("საბა", "555-887-987");
       hashMap.put("ანა", "555-887-987");
       hashMap.put("ბარბარე", "555-189-6667");

       for (String number : hashMap.keySet()) {
           if (hashMap.get(number).contains("8")) {
               System.out.println(number);
           }
       }

       TreeSet<Circle> circleSet = new TreeSet<>();
       circleSet.add(new Circle(3));
       circleSet.add(new Circle(5));
       circleSet.add(new Circle(3));
       circleSet.add(new Circle(7));
       circleSet.add(new Circle(2));
       circleSet.add(new Circle(7));
       circleSet.add(new Circle(1));
       circleSet.add(new Circle(4));
       circleSet.add(new Circle(6));
       circleSet.add(new Circle(5));

       System.out.println("TreeSet of Circles:");
       for (Circle c : circleSet){
           System.out.println(c);
       }

        HashSet <Circle> circleHashSet = new HashSet<>();
        circleHashSet.add(new Circle(3));
        circleHashSet.add(new Circle(5));
        circleHashSet.add(new Circle(3));
        circleHashSet.add(new Circle(7));
        circleHashSet.add(new Circle(2));
        circleHashSet.add(new Circle(7));
        circleHashSet.add(new Circle(1));
        circleHashSet.add(new Circle(4));
        circleHashSet.add(new Circle(6));
        circleHashSet.add(new Circle(5));

        System.out.println("Hashset of Circles");
        for(Circle c : circleHashSet){
            System.out.println(c);
        }

        System.out.println("Rectangles sorted in reverse order:");
        ArrayList<Rectangle2> rects = new ArrayList<>();
        rects.add(new Rectangle2(2, 3));
        rects.add(new Rectangle2(5, 2));
        rects.add(new Rectangle2(9, 20));

        rects.sort(new ReverseRectangleComparator());
        System.out.println(rects);
   }
    }

