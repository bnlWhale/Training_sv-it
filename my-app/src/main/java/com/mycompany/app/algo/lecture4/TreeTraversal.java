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


import java.util.ArrayList;

public class TreeTraversal {

    private int[] intArr = {5, 7, 13, 22, 17, 27, 25, 15, 9, 10};


    public void constructBSTbyArr(TreeNode root, int[] arr) {


    }


    public void preOrder(TreeNode root) {

        if (root != null) {
            preOrder(root.left);
            System.out.print(" " + root.val+" ");
            preOrder(root.right);
        }

    }

    public  void inOrder(TreeNode root){

        if (root != null) {
            System.out.print(" " + root.val+" ");
            inOrder(root.left);
            inOrder(root.right);
        }

    }

    public  void postOrder(TreeNode root){

        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.val+" ");
        }

    }

    public  void preorderByIterator(TreeNode _root){
        ArrayList<TreeNode> list = new ArrayList<>();
        TreeNode root = _root;
        while(root.left!=null){
            list.add(root.left);
            root = root.left;
        }
    }


    public void insertNode(TreeNode root, TreeNode node){


        if (root != null) {
            int currentData = root.val;
            if(node.val>currentData){
                if(root.right == null){
                    root.right = node;
                }else{
                    insertNode(root.right, node);
                }

            }else{
                if(root.left == null){
                    root.left = node;
                }else{
                    insertNode(root.left, node);
                }
            }
        }
    }

    public void checkInsertNode(){


        TreeNode root = new TreeNode(15);
        TreeNode tnode_10 = new TreeNode(10);
        TreeNode tnode_7 = new TreeNode(7);
        TreeNode tnode_5 = new TreeNode(5);
        TreeNode tnode_9 = new TreeNode(9);
        TreeNode tnode_13 = new TreeNode(13);
        TreeNode tnode_25 = new TreeNode(25);
        TreeNode tnode_22 = new TreeNode(22);
        TreeNode tnode_17 = new TreeNode(17);
        TreeNode tnode_27 = new TreeNode(27);

        root.left = tnode_10;
        root.right = tnode_25;

        insertNode(root, tnode_27);
        insertNode(root, tnode_22);
        preOrder(root);
        /*
        tnode_10.left = tnode_7;
        tnode_10.right = tnode_13;
        tnode_7.right = tnode_9;
        tnode_7.left = tnode_5;
        tnode_25.right = tnode_27;
        tnode_25.left = tnode_22;
        tnode_22.left = tnode_17;
        */
    }



    public void construtBSTManually(TreeNode root) {



        TreeNode tnode_10 = new TreeNode(10);
        TreeNode tnode_7 = new TreeNode(7);
        TreeNode tnode_5 = new TreeNode(5);
        TreeNode tnode_9 = new TreeNode(9);
        TreeNode tnode_13 = new TreeNode(13);
        TreeNode tnode_25 = new TreeNode(25);
        TreeNode tnode_22 = new TreeNode(22);
        TreeNode tnode_17 = new TreeNode(17);
        TreeNode tnode_27 = new TreeNode(27);

        root.left = tnode_10;
        root.right = tnode_25;
        tnode_10.left = tnode_7;
        tnode_10.right = tnode_13;
        tnode_7.right = tnode_9;
        tnode_7.left = tnode_5;
        tnode_25.right = tnode_27;
        tnode_25.left = tnode_22;
        tnode_22.left = tnode_17;

    }


}
