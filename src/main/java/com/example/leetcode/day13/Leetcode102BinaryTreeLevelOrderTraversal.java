package com.example.leetcode.day13;

public class Leetcode102BinaryTreeLevelOrderTraversal {

    //the keypoint is to record the length, since, it will finish one layer and do another layer
//    public List<List<Integer>> levelOrder(TreeNode root) {
//
//        Queue<TreeNode> q = new LinkedList();
//        List<List<Integer>> result = new ArrayList();
//        if(root == null){
//            return result;
//        }
//        q.offer(root);
//        while(!q.isEmpty()){
//
//            List<Integer> layerResult = new ArrayList();
//            result.add(layerResult);
//            int count = q.size();
//
//            while(count > 0){
//                TreeNode remove = q.poll();
//
//                if(remove.left != null){
//                    q.offer(remove.left);
//                }
//                if(remove.right != null){
//                    q.offer(remove.right);
//                }
//                layerResult.add(remove.val);
//                count --;
//            }
//        }
//        return result;
//    }

}
