###### In Wissen Technology, 2 DSA questions and 1 entity design question was asked.

### Q1) Split Array
    Given an array and a splitsize value split the array in this format:
    
    int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int splitSize = 3;
		
		/* expected Output 
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

    Return a list of array with the above output.

### Q2) Flatten this Object array

    Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

    Output -> {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

### Q3) Design deck of cards

    Design deck cards and write an implementation to sort the deck of cards.
    Also, write a function that will compare 2 cards. based on the card value.
    For example Ace has the highest value, then Joker then King, and then Queen, 
    and then 2, 3, 4, 5, 6, 7, 8, 9, 10.

    Sort the 52 cards where the heart has the highest priority then the spade then the diamond and then 
    the club and within those suits, the card will be arranged based on the conditions given above.