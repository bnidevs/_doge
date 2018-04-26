# Team _doge <img src="https://pbs.twimg.com/profile_images/378800000822867536/3f5a00acf72df93528b6bb7cd0a4fd0c_400x400.jpeg" width="30">

#### Xinyi Huang, Andrew Shao, Bill Ni

## Background
Development of deque from scratch

## Plan
1. Use ArrayList as underlying container
2. Implement methods in the following order: <br>
	a. getFirst / getLast <br>
	b. size <br>
	c. isEmpty <br>
	d. add / addFirst <br>
	e. remove (first element) / removeLast <br>
	f. iterator / descendingIterator <br>
	g. contains <br>
	h. remove (by value) / removeLastOccurence <br>

## Reasoning

### Container

*ArrayList* <br>
	We picked the ArrayList as our container because it was relatively simple to code on top of the existing class. We are unsure of efficiency vs the doubly-linked-list, but the methods that required us to loop thru the container were much easier to write compared to the doubly-linked-list.

### Methods

1. getFirst / getLast <br>
	Since this was a collection from which we could either take from the back or front, we decided to include methods for both of those operations.

2. size <br>
	As with every collection, we needed an accessor for the size of the collection.

3. isEmpty <br>
	For some external development, thinkers may need this for the boolean expression of a while loop, so we included it to make their lives easier.

4. add / addFirst <br>
	Most collections have methods that would add elements, but since this collection can remove elements from either side, we decided we should be able to add elements to either side too.

5. remove (first element) / removeLast <br>
	Same reasoning as add and addFirst
	
6. iterator / descendingIterator <br>
	We included this method so that future thinkers can implement a for-each loop on this collection without issues.

7. contains <br>
	A method that checks to see if an element is in the collection is rather helpful to determine whether it is possible to remove by value
	
8. remove (by value) / removeLastOccurence <br>
	We wrote this method so that removing something specific wouldn't be such a hassle for future thinkers. The removeLastOccurence was implemented because of the bidirectionality of this collection.
