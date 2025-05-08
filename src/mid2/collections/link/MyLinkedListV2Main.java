package mid2.collections.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2<String> stringList = new MyLinkedListV2<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV2<Integer> intList = new MyLinkedListV2<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);

    }
}
