total = 0
endRange = 1000
for x in range(0, endRange):
    if x % 3 == 0 or x % 5 == 0:
        total = total + x
print "The sum of numbers divisible by 3 and 5 that are less than 1000 is: %d " % total
