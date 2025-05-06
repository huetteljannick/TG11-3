testList = [3   ,7   ,5   ,2   ,1 ]

laenge = len(testList)-1
for i in range(len(testList)):
    for i in range(laenge):
        rechts = testList[i+1]
        links = testList[i]
        if links < rechts:
            testList[i] = links
            testList[i+1] = rechts
    
laenge -= 1
   

print(testList)