package mid2.collections.link;

public class NodeMain1 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        //연결된 노드 출력
        System.out.println("연결된 노드 출력하기");
        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);

    }


    //모든 노드 탐색하기
    private static void printAll(Node first) {
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    //마지막 노드 조회하기
    private static Node getLastNode(Node first) {
        Node x=first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    //특정 index의 노드 조회하기
    private static Node getNode(Node first, int index) {
        Node x=first;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        return x;
    }

    //데이터 추가하기
    private static void add(Node first, Object param) {
        Node lastNode=getLastNode(first);
        lastNode.next=new Node(param);
    }
}
