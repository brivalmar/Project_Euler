a = 1
b = 1
c = 0
finalNum = 4000000
total = 0
while c < finalNum:
    c = a + b
    if c % 2 == 0:
        total = total + c
    a = b
    b = c
print "Total of even Fibonacci numbers less than 4,000,000: %d" % total
