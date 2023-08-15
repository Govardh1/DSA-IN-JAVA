package BinarySearch;

public class SingELEinSORT {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,8,8};
        int ans=singleNonDuplicate(nums);
        System.out.println(ans);
    }
        static int singleNonDuplicate(int[] nums) {
                    int left = 0, right = nums.length - 1;
                    while (left < right) {
                        int mid = (left + right) / 2;
                        if (mid % 2 == 1) {
                            mid--;
                        }
                        if (nums[mid] != nums[mid + 1]) {
                            right = mid;
                        } else {
                            left = mid + 2;
                        }
                    }
                    return nums[left];
                }
            }

