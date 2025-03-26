# Problem-1
# You are given a list of daily prices of a stock. You can buy a stock on one day and sell it later on another day after the day you bought the stock. You can perform the above operation only once. What is the maximum loss possible?
# Example
# Prices=[10,4,2,9]
# The greatest loss is incurred when you buy at a price of 10 and sell at a price of 2. Return the difference:9.
# Example
# Price=[1,2,3,4]
# The Price went up every day. Return 0.
# Sample Input for Custom Testing
# STDIN                   Function
# ———–               ————–
#  7   → Prices []  size n=7
#  1   → prices =[1,8,4,2,10,3,2]
#  8
#  4
#  2
#  10
#  3
#  2
# Sample Output
# 8
# Explanation
# Using zero-based index notation, the correct answer is a[4]-a[6]=10-2=8. There is a greater difference between 10 and 1 but that would imply selling before buying, and short selling is not allowed in this problem.
# 
# # 7 1 8 4 2 10 3 2
# 
# Brute force
def MaxLoss(arr):
    maxi=0
    for i in range(len(arr)):
        for j in range(i+1,len(arr)):
            if arr[i]>arr[j] and maxi<arr[i]-arr[j]:
                maxi=arr[j]-arr[i]
    return maxi
arr=list(map(int,input("Enter the Stock Prices by day: ").split()))
print(MaxLoss(arr))

# Optimal
def MaxLoss(arr):
    maximum_val = arr[0]
    ans = 0
    for i in range(1,len(arr)): 
        if arr[i]>maximum_val:
            maximum_val = arr[i]
        else:
            ans = max(ans,maximum_val-arr[i])
    return ans
arr=list(map(int,input("Enter the Stock Prices by day: ").split()))
print(MaxLoss(arr))


