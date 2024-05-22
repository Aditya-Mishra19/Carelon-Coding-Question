def getMaxMin(num):
    maxNum = float('-inf')
    minNum =float('inf')
    while num > 0:
        digit = num % 10
        maxNum = max(maxNum, digit)
        minNum = min(minNum, digit)
        num //= 10 
    return maxNum, minNum

def findSumOfDigit(num):
    maxNum, minNum = getMaxMin(num)
    sumOfDigit = 0
    while num > 0:
        digit = num % 10
        if digit != maxNum and digit != minNum:
            sumOfDigit += digit
        num //= 10 
    return sumOfDigit
    

nums = [1223, 234, 3445, 456]
ans = 0
for num in nums:
    sum_digits = findSumOfDigit(num)
    ans += sum_digits
print(ans)
