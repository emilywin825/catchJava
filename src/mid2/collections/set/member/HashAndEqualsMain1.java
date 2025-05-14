package mid2.collections.set.member;

import mid2.collections.set.MyHashSetV2;
import mid2.collections.set.member.MemberNoHashNoEq;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = "+m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println(m1.equals(m2)); //false
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains); //false
    }
}
