# Problem-2
# Problem Description:
# A positive integer d is said to be a factor of another positive integer N if when N is divided by d, 
# the remainder obtained is zero. For example, for number 12, there are 6 factors 1, 2, 3, 4, 6, 12. 
# Every positive integer k has at least two factors, 1 and the number k itself. Given two positive integers N and k, 
# write a program to print the kth largest factor of N.
# Input Format: The input is a comma-separated list of positive integer pairs (N, k).
# Output Format: The kth highest factor of N. If N does not have k factors, the output should be 1.
# Constraints:
# •	1<N<10000000000
# •	1<k<600.
# You can assume that N will have no prime factors which are larger than 13.
# Example 1
# •	Input: 12,3
# •	Output: 4
# Explanation: N is 12, k is 3. The factors of 12 are (1,2,3,4,6,12). The highest factor is 12 and the third largest factor is 4. The output must be 4.
# Example 2
# •	Input: 30,9
# •	Output: 1
# Explanation: N is 30, k is 9. The factors of 30 are (1,2,3,5,6,10,15,30). There are only 8 factors. As k is more than the number of factors, the output is 1.


def kthFactor(num,k):
    c=0
    for i in range(num,0,-1):
        if num%i==0:
            c+=1
            if c==k:
                return i
    else:
        return 1
num=int(input("Enter the number: "))
k=int(input("Enter the value of K: "))
print(kthFactor(num,k))  





# in java

# // program-1
# public class Main {
#     public static void main(String[] args) {
#         int prices[]={1,8,4,2,9,10,3,2};
#         int max_val=prices[0];
#         int loss=0;
#         for(int i=1; i<prices.length; i=i+1){
#             if(prices[i]>max_val){
#                 max_val=prices[i];
#             }
#             else{
#                 if((max_val-prices[i])>loss){
#                     loss=max_val-prices[i];
#                 }
#             }
#         }
#         System.out.println(loss);
#     }
# }

# // program-2
# public class Main {
#     public static void main(String[] args) {
#         int num=12;
#         int k=3;
#         int c=0;
#         for(int i=num; i>=1; i=i-1){
#             if (num%i==0){
#                 c+=1;
#                 if(k==c){
#                     System.out.println(i);
#                     break;
#                 }
#             }
#         }
#     }
# }
