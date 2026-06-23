class Solution {

    public boolean isSameTree(
        TreeNode first,
        TreeNode second
    ) {

        if(
            first == null &&
            second == null
        ) {

            return true;
        }

        if(
            first == null ||
            second == null
        ) {

            return false;
        }

        if(
            first.val
            !=
            second.val
        ) {

            return false;
        }

        return
            isSameTree(
                first.left,
                second.left
            )
            &&
            isSameTree(
                first.right,
                second.right
            );
    }
}
