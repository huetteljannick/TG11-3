import random

class Sort: 
    def __init__(self,array):
        self.liste = array
    def SelectionSort(self):
        size = len(self.liste)
        for index in range(size):
            min = index  # Start with the current index as the minimum

            for j in range(index + 1, size):  # Iterate through the unsorted portion
                if self.liste[j] < self.liste[min]:
                    min = j
            # swapping the elements to sort the array
            (self.liste[index], self.liste[min]) = (self.liste[min], self.liste[index])

    
    def BubbleSort(self):
        laenge = len(self.liste)-1
        for i in range(len(self.liste)):
            for j in range(laenge):  # Use different variable here for inner loop
                links = self.liste[j]
                rechts = self.liste[j + 1]
                if links > rechts:
                    self.liste[j] = rechts
                    self.liste[j + 1] = links
            laenge -= 1

    
    def MergeSort(self, l, r):
        if l < r:
            m = l + (r - l) // 2
            self.MergeSort(l, m)     # Correctly call with self
            self.MergeSort(m + 1, r) # Correctly call with self
            self.merge(l, m, r)      # Correctly call with self


    def merge(self, l, m, r):
        n1 = m - l + 1
        n2 = r - m

        # create temp arrays
        L = [0] * (n1)
        R = [0] * (n2)

        # Copy data to temp arrays L[] and R[]
        for i in range(0, n1):
            L[i] = self.liste[l + i]

        for j in range(0, n2):
            R[j] = self.liste[m + 1 + j]

        # Merge the temp arrays back into arr[l..r]
        i = 0     # Initial index of first subarray
        j = 0     # Initial index of second subarray
        k = l     # Initial index of merged subarray

        while i < n1 and j < n2:
            if L[i] <= R[j]:
                self.liste[k] = L[i]
                i += 1
            else:
                self.liste[k] = R[j]
                j += 1
            k += 1

        # Copy the remaining elements of L[], if there
        # are any
        while i < n1:
            self.liste[k] = L[i]
            i += 1
            k += 1

        # Copy the remaining elements of R[], if there
        # are any
        while j < n2:
            self.liste[k] = R[j]
            j += 1
            k += 1

    def InsertionSort(self):
        n = len(self.liste)  # Get the length of the array
        
        if n <= 1:
            return  # If the array has 0 or 1 element, it is already sorted, so return

        for i in range(1, n):  # Iterate over the array starting from the second element
            key = self.liste[i]  # Store the current element as the key to be inserted in the right position
            j = i-1
            while j >= 0 and key < self.liste[j]:  # Move elements greater than key one position ahead
                self.liste[j+1] = self.liste[j]  # Shift elements to the right
                j -= 1
            self.liste[j+1] = key  # Insert the key in the correct position

    def partition(self):
        low = 0
        high = len(self.liste) - 1
        pivot = self.liste[high]

        i = low - 1
        for j in range(low, high):
            if self.liste[j] <= pivot:
                i += 1
                (self.liste[i], self.liste[j]) = (self.liste[j], self.liste[i])

        (self.liste[i + 1], self.liste[high]) = (self.liste[high], self.liste[i + 1])
        return i + 1

    def QuickSort(self, low, high):
        if low < high:
            pivot_index = self.partition()  
            self.QuickSort(low, pivot_index - 1)
            self.QuickSort(pivot_index + 1, high)


class Interface:
    def __init__(self):
        self.array = []

        print("Welcome to UltimateSort™")

        answer = input("Do you want to define a custom array? Otherwise one will be randomly generated for you. Please answer with (y)es or (n)o.\t")
        if answer == 'y':
            Interface.GetUserArray(self)
        else:
            min = int(input("Please define the minimum length of the array. Default value is 0.\t"))
            max = int(input("Please define the maximum length of the array. Default value is 10.\t"))
            Interface.GetRandomArray(self,min,max)
        
        print(f"The unsorted array is {self.array} .")

        Sorter = Sort(array=self.array)
        answer = input("""Choose the type of sorting.
                                1. Selection Sort
                                2. Bubble Sort
                                3. Merge Sort
                                4. Insertion Sort
                                5. Quicksort
                       """)
        match answer:
            case '1':
                Sorter.SelectionSort()
            case '2':
                Sorter.BubbleSort()
            case '3':
                Sorter.MergeSort(l=0, r=len(Sorter.liste) - 1)
            case '4':
                Sorter.InsertionSort()
            case '5':
                Sorter.QuickSort(low=0, high=len(Sorter.liste) - 1)
            case _:
                print("Invalid Input. Please input a number between 1 and 5.")
        
        print(f"The sorted array is {self.array} .")

    def GetUserArray(self):
        element = input("Please add an element to your array (stop by typing \"exit\"):\t")
        if element == "exit":
            return
        elif element == None or '':
            Interface.GetUserArray(self)
        self.array.append(int(element))
        Interface.GetUserArray(self)
    
    def GetRandomArray(self,min,max):
        if min == None:
            min=0
        if max == None:
            max=10
        length = random.randint(min,max)
        for x in range(length):
            self.array.append(random.randint(0,999))




app = Interface()
