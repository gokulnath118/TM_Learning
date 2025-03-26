# DAY-2 TASK
# Problem-1
# Question 5: Find the homeless 
# Problem Statement -:  There are N Homeless people in the community and N houses in the community. It will be given in the array (people), the height of the person, and in the array house capacity of the house is given.
# The government decided to give homes to people on the basis of the following conditions:
# •	Priority is given to the people from left to right of the array
# •	Each person is allotted to a house if and only if the capacity of the house is greater than or equal to the person’s height
# •	Nearby empty Houses are allotted to the person( starting from the extreme left)
# You need to find the number of homeless people who have not been allotted any home if the government follows the above conditions. So that government will have an idea of how many people they need to allot homes for next time.
# Constraints:
# •	1 <= N <= 10^3
# •	1 <= people[i] <= 10^5
# •	1 <= house[i] <= 10^5
# Input Format for Custom Testing:
# •	The first line contains an integer, N, denoting the number of  people and number of houses.
# •	Each line i of the N subsequent lines (where 0 <= i <= N) contains an integer describing peoplei.
# •	Each line i of the N subsequent lines (where 0 <= i <= N) contains an integer describing housei.
# Sample Test Cases
# •	Sample Input 1
# 3  
# 4
# 2
# 7
# 3
# 5
# 10
# •	Sample Output 1
# 0
# •	Explanation
# people=[4,2,7]
# house=[3,5,10]
# People[0] has more priority , from left to right order in houses 5 is the nearest one which fits for people[0]
# people[1]=2 will fit in 3 which is nearer from left
# people[2]=7 will fit in remaining house of capacity of 10
# So no homeless people left so return 0 
# •	Sample Input 2
# 3
# 3
# 8
# 5
# 1
# 9
# 4
# •	Sample Output 2
# 2
# •	Explanation
# people=[3,8,5]
# house=[1,9,4]
# people[0]=3 can fit in 9 which is nearest from left in array house
# people[1]=8  cannot fit in any home which is left (i.e, 1 and 4)
# people[2]=5 cannot fit in any home which is left (i.e, 1 and 4)
# So return 2,which is number of homeless people


def homeless(people,houses):
    n=len(people)
    c=0
    for i in range(n):
        for j in range(n):
            if people[i]<=houses[j]:
                houses[j]=0
                c+=1
                break
    ans=n-c
    return ans
people=list(map(int,input("Enter the Height of the people: ").split()))
houses=list(map(int,input("Enter the Size of the House: ").split()))
print(homeless(people,houses))


# in java


# import java.util.Scanner;
# public class homeLess{
#     public static void main(String[] args){
#         Scanner scanner=new Scanner(System.in);
#         System.out.print("Enter the number of Houses and People: ");
#         int N=scanner.nextInt();
#         int[] people= new int[N];
#         int[] houses= new int[N];
#         for(int i=1; i<N+1;i+=1){
#             System.out.print("Enter the height of Person "+i+": ");
#             people[i-1]=scanner.nextInt();
#         }
#         for(int j=1; j<N+1;j+=1){
#             System.out.print("Enter the Size of the House "+j+": ");
#             houses[j-1]=scanner.nextInt();
#         }
#         for(int person:people){
#             System.out.print(person+" ");
#         }
#         System.out.println();
#         for(int house:houses){
#             System.out.print(house+" ");
#         }
#         System.out.println();
#         int count=0;
#         for(int k=0; k<N;k+=1){
#             for(int l=0;l<N;l+=1){
#                 if(houses[l]>=people[k]){
#                     houses[l]=0;
#                     count+=1;
#                     break;
#                 }
#             }
#         }
#         int Homeless=N-count;
#         System.out.println("The Total Number of Homeless People are "+Homeless+".");
#     }
# }
