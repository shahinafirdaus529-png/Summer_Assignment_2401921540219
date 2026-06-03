class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int insertPosition = 0;

        for(int value : nums) {

            if(value != 0) {
                nums[insertPosition] = value;
                insertPosition++;
            }
        }

        while(insertPosition < nums.length) {
            nums[insertPosition] = 0;
            insertPosition++;
        }
    }
}
