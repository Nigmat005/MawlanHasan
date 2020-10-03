package day60_Collection;
import java.util.*;
public class ListInterface {
    public static void main(String[] args) {

        // get, add, remove, set, removeAll, contains, size

        List<Integer> list1 = new ArrayList<>(); // retrieving date fast (get)
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("ArrayList " + list1);
        System.out.println(list1.get(1)); //2
        list1.add(6);
        list1.remove(3);

        List<Integer> list2 = new LinkedList<>(); // each object are doublly linked -> fast with add, remove data
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("LinkedList " + list2);
        System.out.println(list2.get(2)); //3
        list2.add(6);
        list2.remove(3);

        List<Integer> list3 = new Vector<>(); // synchronized, it is thread safe in multi- thread environment
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Vector " + list3);
        System.out.println(list3.get(3)); //4

        List<Integer> list4 = new Stack<>(); // synchronized, it is thread safe in multi- thread environment
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5)); // LIFO, last in first out order
        System.out.println("Stack " + list4);
        System.out.println(list4.get(4)); //5
        ((Stack) list4).pop(); // last element will be removed.
        System.out.println(list4);

        System.out.println("------------------------");
        Stack<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(list5); //1,2,3,4,5,6,7
        int lastObject = list5.pop();
        System.out.println(lastObject); //7
        System.out.println(list5); //1,2,3,4,5,6
        list5.removeAll(Arrays.asList(1, 2, 3));
        System.out.println(list5); //4,5,6

        System.out.println("------------------------");
        int[] arr1 = {1, 2, 3};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}}; // multi-dimensional

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Mawlan");
        System.out.println(l1);

        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>(); // list of lists
        l2.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        l2.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        l2.get(0).addAll(Arrays.asList(9, 10, 11));
        l2.get(1).add(7);
        l2.get(0).removeAll(Arrays.asList(9, 10, 11));
        System.out.println(l2);
        System.out.println("First arrayList: " + l2.get(0).size());
        System.out.println("Second arrayList: " + l2.get(1).size());

        System.out.println("-------------------------");
        List<List<String>> cities = new ArrayList<>();
        cities.addAll(Arrays.asList(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
        cities.get(0).addAll(Arrays.asList("Guma", "Sanji", "Tohsun", "Karamay", "Piqan"));
        cities.get(1).addAll(Arrays.asList("Khotan", "Urumqi", "Kashgar", "Gholja", "Turpan"));
        cities.get(2).addAll(Arrays.asList("Kuqa", "Yakan", "Kaghilik", "Atux", "Yakan"));
        cities.get(3).addAll(Arrays.asList("Kumul", "Aksu", "Korla", "Qira", "Altay"));
        for (List<String> eachCities : cities) {
            for (String eachCity : eachCities) {
                System.out.print(eachCity + ", ");
            }
        }
        //System.out.println(cities.get(0));
        // System.out.println(cities.get(1));
        // System.out.println(cities.get(2));
        // System.out.println(cities.get(3));
        System.out.println();
        System.out.println("-------------------------");
        List<List<String>> watan = new ArrayList<>();
        watan.addAll(Arrays.asList(new Stack<>(), new Stack<>(), new Stack<>(), new Stack<>()));
        watan.get(0).addAll(Arrays.asList("Guma", "Sanji", "Tohsun", "Karamay", "Piqan"));
        watan.get(1).addAll(Arrays.asList("Khotan", "Urumqi", "Kashgar", "Gholja", "Turpan"));
        watan.get(2).addAll(Arrays.asList("Kuqa", "Yakan", "Kaghilik", "Atux", "Yakan"));
        watan.get(3).addAll(Arrays.asList("Kumul", "Aksu", "Korla", "Qira", "Altay"));
        for (List<String> eachCities : watan) {
            ((Stack) eachCities).pop();
            System.out.print(eachCities + ", ");
        }
        System.out.println();
        System.out.println("-------------------------");

        List<List<String>> groups = new ArrayList<>();
        groups.addAll(Arrays.asList(
                new Stack<>(), new Stack<>(),
                new Stack<>(), new Stack<>(),
                new Stack<>()));

        groups.get(0).addAll(Arrays.asList("Alexey", "Ana", "Andrei", "Busra Y", "Busra O"));
        groups.get(1).addAll(Arrays.asList("Nickolas", "Evgeniya", "Aizhan", "Kalbinur", "Paola"));
        groups.get(2).addAll(Arrays.asList("Ceren", "Elizaveta", "Heydar", "Hunisddin", "Kalbinur"));
        groups.get(3).addAll(Arrays.asList("Murat", "Ayhan", "Uros", "Aysel", "Esra"));
        groups.get(4).addAll(Arrays.asList("Ashenafi", "Ali", "Hamid", "Mokinur", "Nikola"));

        for (List<String> eachGroup : groups) {
            ((Stack) eachGroup).pop();
            System.out.print(eachGroup);
        }


    }



    public void method1(){

    }

    public synchronized void method2(){

    }

}
