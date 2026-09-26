# Java Collections 

## What is the difference between an ArrayList and a LinkedList? 

ArrayList is backed by a dynamic array, giving fast O(1) index access.
LinkedList is a list that stores elements as nodes, where each node links to the previous and next node. Giving O(n) index access but efficient insertion/removal at a known position or at the ends.

get(i) -> ArrayList: O(1); LinkedList: O(n)
Add at end -> ArrayList: O(1); LinkedList: O(1)
Insert/remove in middle -> ArrayList: O(n); LinkedList: O(n) to find position, then O(1) to relink

Only use LinkedList when we want frequent insert/remove at ends.

## What is the difference between a List and a Set? 

List → An ordered collection that allows duplicate elements and provides access by index.
Set → A collection that does not allow duplicate elements and generally focuses on uniqueness rather than index-based access.

🟢 Basic
    What is a HashMap?
    How do you add, retrieve, update, and remove elements from a HashMap?
    Can a HashMap contain duplicate keys?
    Can a HashMap contain duplicate values?
    Can a HashMap contain null keys or values?
    Does a HashMap maintain insertion order?
🟡 Intermediate
    How does a HashMap work internally?
    What is a hash?
    What is a hashCode?
    Why are equals() and hashCode() important for HashMap?
    What happens when two keys have the same hash code?
    What is a collision in a HashMap?
    What is the load factor?
    What happens when a HashMap reaches its load factor threshold?
🔴 Advanced
    How does Java handle hash collisions?
    What happens internally when many keys have the same hash?
    What is resizing/rehashing?
    Why should keys used in a HashMap generally be immutable?
    What happens if you modify a key after putting it into a HashMap?
    Is HashMap thread-safe?
    What should you use instead of HashMap when multiple threads modify the map concurrently?
    What is the difference between HashMap and ConcurrentHashMap?