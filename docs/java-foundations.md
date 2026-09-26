# Java Foundations 

## What is the difference between a primitive type and a non-primitive type ? 

In Java, Primitive and Non-primitive are data types and the main difference is basically how is created/stored and his behaviour.
Primitive types are Java's basic built-in data types. They store the actual value directly. E.g. byte, int, double, etc
Non-primitive types refer to objects rather than directly storing the object itself. E.g. String, Integer, etc 
In terms of null, only non-primitive types can be null.

## Where are primitive and non-primitive types allocated in memory?

Primitive types in stack and non-primitive types in heap. But this can be more complex.

## What is the difference between Stack and Heap? 

Stack → method calls, local variables/references, and execution frames. Usually smaller and very fast access. 
Heap → objects and their instance data. Larger than Stack and generally slower than stack access. 
Additionally, Heap memory are removed by the Garbage Collector where no longer reachable. 

## What is Garbage Collector? Advantages and disadvantages? 

Garbage Collector automatically removes unused objects from the heap and makes their memory available for reuse.
In terms of advantages: Automatic memory management; Improves memory reuse; Helps prevent certain memory errors;
For disadvantages: Performance overhead; Application pauses; Additional memory usage

## Examples of Garbage Collector algorithms ? -> Check if i need to study a little more

I don't know much more about Garbage Collector but the only thing I know about this theme is the default Garbage Collector: G1 GC. 

## What is the difference between an == and equals() ?

== compares values for primitives and references for objects, while equals() compares object equality according to the class's implementation.

```java
String a = new String("Hello");
String b = new String("Hello");

a.equals(b); -> true
a == b; -> false
```

## Which access modifiers do you know? 

Public, Private, Protected and default.

Public -> Accessible from everywhere 
Private -> Only accessible inside the class
Protected -> Accessible inside the package. From subclasses, even if the subclass is in another package

## And about non access modifiers?

static, final, abstract, synchronized and volatile.
static → Belongs to the class, rather than to individual objects.
final → Prevents something from being changed, overridden, or inherited, depending on its use.
abstract → Defines something that is incomplete and must be implemented/extended.
synchronized → Ensures that only one thread at a time can execute a synchronized section for the same lock.
volatile → Ensures that changes to a variable are visible across threads.

## In Java, a list can be final. What does this mean? Can I add new elements to this list?

The final in list prevents from reassigning the variable, not from modifying the object it references. So, we can add or remove elements from that list, but we can not reassign the variable. Example:

```java
import java.util.ArrayList;

final List<String> names = new ArrayList<>();
names.add("Rui"); // ✅

names = new ArrayList<>(); // ❌
```

## Difference between and a Class and an Object? 

A class is a contract; an object is an instance created from that contract.

## Overloading vs Overriding

Overloading is Same method name but different parameters
Overriding is Same method signature, new implementation

