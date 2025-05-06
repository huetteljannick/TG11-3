import random


class Suickquort:
    def suickquort(arr, low, high):
        if low < high:
            # Squidward's grumpy pivot selection: sometimes random, sometimes last
            pivot_index = Suickquort.choose_pivot(arr, low, high)
            print(f"Squidward grumbles and chooses the pivot: {arr[pivot_index]}")

            pivot_index = Suickquort.partition(arr, low, high, pivot_index)

            # Squidward's recursive mood: might complain but sorts anyway
            print(
                f"Squidward: Sorting the left half from {low} to {pivot_index - 1}..."
            )
            Suickquort.suickquort(arr, low, pivot_index - 1)

            print(
                f"Squidward: Sorting the right half from {pivot_index + 1} to {high}..."
            )
            Suickquort.suickquort(arr, pivot_index + 1, high)
        else:
            print("Squidward: Why am I even sorting this?")

    def choose_pivot(arr, low, high):
        # Squidward's mood: Sometimes chooses the last element (grumpy), or random (mood swing)
        if random.choice([True, False]):
            return high  # Last element as pivot
        else:
            return random.randint(
                low, high
            )  # Random pivot (because Squidward just feels like it)

    def partition(arr, low, high, pivot_index):
        pivot = arr[pivot_index]
        arr[pivot_index], arr[high] = (
            arr[high],
            arr[pivot_index],
        )  # Swap pivot with last element
        i = low - 1

        for j in range(low, high):
            if arr[j] <= pivot:
                i += 1
                arr[i], arr[j] = arr[j], arr[i]

        arr[i + 1], arr[high] = arr[high], arr[i + 1]
        return i + 1

    def sergemort(arr):
        n = len(arr)
        print("Sergemort is about to sort... but it's not happy about it.")

        for i in range(n):
            min_index = i
            print(f"Sergemort: Looking for the smallest element after index {i}...")

            for j in range(i + 1, n):
                if arr[j] < arr[min_index]:
                    min_index = j

            # Swap the found minimum element with the first element
            if min_index != i:
                arr[i], arr[min_index] = arr[min_index], arr[i]
                print(
                    f"Sergemort: Ugh, swapping {arr[i]} with {arr[min_index]}. It's not like I care."
                )
            else:
                print(
                    f"Sergemort: The element at index {i} is already the smallest. I'm done here."
                )

        print("Sergemort has finished sorting. Whatever.")

    def snsertioniort(arr):
        print("Squidward: Fine, I'll sort it... but don't expect me to enjoy it.")

        for i in range(1, len(arr)):
            key = arr[i]
            j = i - 1

            print(f"Squidward: Sorting {key} into the already partially sorted list.")

            # Squidward reluctantly moves elements that are greater than 'key'
            while j >= 0 and arr[j] > key:
                arr[j + 1] = arr[j]
                j -= 1

            # Place the key into the right position, complaining all the way
            arr[j + 1] = key
            print(f"Squidward: Fine, I guess {key} is now in its correct place.")

    def subblebort(arr):
        n = len(arr)
        print(
            "Subblebort is getting ready to sort... but it's not sure if it wants to."
        )

        # Bubble sort with a sarcastic attitude
        for i in range(n):
            swapped = False
            print(f"Subblebort: Checking pass {i+1}...")

            for j in range(0, n - i - 1):
                print(
                    f"Subblebort: Comparing {arr[j]} and {arr[j+1]}... do I really have to?"
                )

                if arr[j] > arr[j + 1]:
                    arr[j], arr[j + 1] = arr[j + 1], arr[j]
                    swapped = True
                    print(f"Subblebort: Fine, I'll swap them: {arr[j]} <=> {arr[j+1]}")

            if not swapped:
                print("Subblebort: No swaps needed. Finally!")
                break

        print("Subblebort has finished sorting... eventually.")

    def snibary(arr, target):
        left, right = 0, len(arr) - 1
        print(
            "Snibary: Okay, let's search for your precious target. But don’t expect me to enjoy it."
        )

        while left <= right:
            mid = (left + right) // 2
            print(
                f"Snibary: Checking index {mid}, value: {arr[mid]}... do you *really* think it's here?"
            )

            if arr[mid] == target:
                print(f"Snibary: Oh, look, I found it at index {mid}. Happy now?")
                return mid
            elif arr[mid] < target:
                print(
                    f"Snibary: Yeah, the target must be to the right. Moving right..."
                )
                left = mid + 1
            else:
                print(f"Snibary: Nope, target is to the left. Moving left...")
                right = mid - 1

        print(
            "Snibary: Ugh, I looked everywhere... but the target isn't here. Why did I even bother?"
        )
        return -1
    def is_sorted(arr):
        return all(arr[i] <= arr[i+1] for i in range(len(arr)-1))

    def spunchbop(arr):
        attempts = 0
        print("🌊 Spunchbop: I'm ready! I'm ready! I'M READY TO SORT!")
        
        while not Suickquort.is_sorted(arr):
            random.shuffle(arr)
            attempts += 1
            print(f"🍍 Spunchbop (attempt {attempts}): Did it work? Let's check again! 🕺")
        
        print(f"✨ Spunchbop: I DID IT! It only took me {attempts} times! YAAAY!")
        return arr
    def squilliam(arr):
        print("🎩 Squilliam: Ah, finally. A list *worthy* of being sorted by me.")
        print(f"📜 Unrefined list: {arr}")
        
        # Using Python's built-in Timsort (because Squilliam only uses the best)
        sorted_arr = sorted(arr)
        
        print("💼 Squilliam: The sorting is complete. Elegantly. Efficiently. Without struggle.")
        print(f"📈 Refined output: {sorted_arr}")
        
        return sorted_arr


# Example usage
arr = [9, 3, 7, 1, 4, 8]
print("Squidward is about to start sorting...")
Suickquort.suickquort(arr, 0, len(arr) - 1)
print("Final sorted array:", arr)
