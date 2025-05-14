package mid2.collections.set.member;

import mid2.collections.set.MyHashSetV2;

//hashCode(), equals()를 모두 구현한 경우
public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = "+m1.hashCode()); //96
        System.out.println("m2.hashCode() = " + m2.hashCode());//96
        System.out.println(m1.equals(m2)); //false
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 성공
        Member searchValue = new Member("A"); //같
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue); //96
        System.out.println("contains = " + contains);
    }
}
