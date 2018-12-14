package algo.lecture4;


/*
binary search tree:
   an example as below:

//          15
//         /  \
//        10   25
//       / \   / \
//      7  13 22  27
//     / \    /
//    5   9  17

*/

public class Lecture4_main {

    public static void main() {

        TreeNode root = new TreeNode(15);
        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.construtBSTManually(root);
        System.out.println("preOrder:");
        treeTraversal.preOrder(root);
        System.out.println("\n"+"inOrder:");
        treeTraversal.inOrder(root);
        System.out.println("\n"+"postOrder:");
        treeTraversal.postOrder(root);
        //treeTraversal.checkInsertNode();

    }

}
