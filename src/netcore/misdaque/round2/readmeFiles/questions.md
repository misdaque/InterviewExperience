In the Netcore 2nd round there were just 2 coding questions on DSA.
The problem statement were long but the questions were easy.

##### Q1)
    You are given an array and Q queries of 4 length each, {T, l, r, x}.

    T -> Either 1 or 2.
    l -> starting index
    r -> ending index
    x -> values

    Based on the queries you have to perform these 2 tasks:
    
    1) l, r, 0 -> if T = 1, then find or of all elements from index l till r
        and store in the result. For this x will be 0 that means you don't have to 
        do anything with the value x given.

    2) l, r, x -> if T = 2, then perform xor operation off all the elements with the 
        value x, from 'l' till 'r'

    
    You have to perform these tasks on the same array and then print the output received.

    Constraints: These operations can be done in O(N^2)


##### Q2)

    Given a String of length N only of lowercase. Given q queries of each length 2 {l, r}.
    Here l is the starting index and r is the ending index which will always be less than N.

    A char array characters is given of length q where characters[i] corresponds to the q[i]

    Your task is to remove any two consecutive ocurances of the char character[i] by a single
    character in the given substring l -> r

    Example: S = "ababbaabaa"
             l -> 2
             r -> 7
             char[0] = a
    So, replace all 'a' occuring multiple times consecutively in the substring from l to r i.e "abbaab"
    Thus the String becomes "abbab". Output will be 5 which is the length of the substrig after modification.

    Collect the answers in an int array.

    