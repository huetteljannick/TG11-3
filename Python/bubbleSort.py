testList = [3   ,7   ,5   ,2   ,1 ]

laenge = len(testList)-1
for i in range(len(testList)):
    for i in range(laenge):
        links = testList[i]
        rechts = testList[i+1]
        if links > rechts:
            testList[i] = rechts
            testList[i+1] = links
    
laenge -= 1
   

print(testList)