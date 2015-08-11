/**
 * Created by dongweij on 2015/8/11.
 */
public class Problem13 {
    public static class BiNode {
        public BiNode node1, node2;
        public int data;
        //Added constructor
        public BiNode(int _data) {
            data = _data;
            node1 = null;
            node2 = null;
        }
    }

    public static BiNode nextNode(BiNode root) {
        if(root == null) {
            return null;
        }
        else {
            BiNode part1 = nextNode(root.node1);
            BiNode part2 = nextNode(root.node2);
            if(part2 != null) {
                root.node2 = part2;
                part2.node1 = root;
            }
            if(part1 != null) {
                BiNode tail = tail(part1);
                tail.node2 = root;
                root.node1 = tail;
            }
            return part1 == null ? root : part1;
        }
    }

    public static BiNode tail(BiNode root) {
        while(root.node2 != null) {
            root = root.node2;
        }
        return root;
    }

    //Algorithm to transform binary tree to doubly linked list, key is to understand the return value of recursive
    //function is the head of list
    public static void main(String args[]) {
        BiNode root = new BiNode(2);
        BiNode left = new BiNode(1);
        BiNode right = new BiNode(4);
        BiNode rightright = new BiNode(5);
        BiNode rightleft = new BiNode(3);
        root.node1 = left;
        root.node2 = right;
        right.node1 = rightleft;
        right.node2 = rightright;
        root = nextNode(root);
        System.out.println("root node");
        System.out.println(root.data);
        System.out.println("right nodes");
        BiNode rightroot = root;
        while(rightroot.node2 != null) {
            System.out.print(rightroot.node2.data + " ");
            rightroot = rightroot.node2;
        }
        System.out.println();
        System.out.println("left nodes");
        BiNode leftroot = root;
        while(leftroot.node1 != null) {
            System.out.print(leftroot.node1.data + " ");
            leftroot = leftroot.node1;
        }
    }
}
