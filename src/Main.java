public class Main {
    public static void main(String[] args){
        
        RedBlackTree tree = new RedBlackTree();

        tree.add(5);
        tree.add(3);
        tree.add(10);
        tree.add(2);
        tree.add(8);
        tree.add(1);
        
        System.out.println(tree.contain(5));
        System.out.println(tree.contain(3));
        System.out.println(tree.contain(10));
        System.out.println(tree.contain(2));
        System.out.println(tree.contain(8));
        System.out.println(tree.contain(1));
        
    }
}