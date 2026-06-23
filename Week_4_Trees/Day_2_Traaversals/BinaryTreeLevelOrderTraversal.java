class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        traverse(root);
        return result;
    }

    private void traverse(TreeNode node) {

        if (node == null) {
            return;
        }

        traverse(node.left);
        result.add(node.val);
        traverse(node.right);
    }
}
                TreeNode current =
                        queue.poll();

                level.add(current.val);

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}
