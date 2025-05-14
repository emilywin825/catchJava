package mid2.collections.set.member;

import mid2.collections.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        //hashCode()를 재정의하면 데이터값을 이용해 hashCode()를 구하므로 m1, m2 같은 값이 나온다.
        System.out.println("m1.hashCode() = "+m1.hashCode()); //96
        System.out.println("m2.hashCode() = " + m2.hashCode());//96
        System.out.println(m1.equals(m2)); //false
        //add할 때 equals()로 중복 검사를 한다. 하지만 MemberOnlyHash 클래스에 equals()를 정의하지 않았으므로
        //Object의 equals()를 상속받아 사용하는데, 두 객체의 주소값이 다르므로 다른 값이라 판단해 m1,m2 모두 add 해버린다.
        //따라서 m1,m2 같은 데이터 값임에도 같이 저장되어 버린다.
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A"); //같
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue); //96
        System.out.println("contains = " + contains);
    }
}
