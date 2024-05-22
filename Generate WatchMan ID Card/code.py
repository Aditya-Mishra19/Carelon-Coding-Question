def removeLeadingZero(num):
    while num[0] == '0':
        num = num[1:]
    return num

def rotateArrayToString(arr, k, N):
    rotated_str = ''
    for i in range(N):
        rotated_str += arr[(i + k) % N]
    return rotated_str

input_num= input()
N = len(input_num)
generatedId = []

for i in range(1,N):
    rotated_str = rotateArrayToString(input_num, i, N)
    generatedId.append(removeLeadingZero(rotated_str))

print(*generatedId)