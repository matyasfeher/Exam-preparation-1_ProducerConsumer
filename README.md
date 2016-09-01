# Exam-preparation-1_ProducerConsumer
General Part

When and why would will we use Threads in our programs?
We use Threads in order to execute processes simultaniusly, depending on the number of CPUs available and also to save time

Explain about the Race Condition Problem
It occurs when unsynchronized Threads are accesing a shared data during a critical section and one might update the necessary data before
others can access it

Explain about the Producer/Consumer-problem and how to solve it in modern Java Programs
Its either when the queue is full and the producers cannot add more data into it or when its empty so the consumer cannot extract data
To solve this problem:
When the queue is full the producer either goes to sleep or discards the data, so when there is space in the queue the consumer notifies
the producer that it can get started again
When the queue is empty the consumer just goes to sleep

Explain the topic Busy Waiting and why it's a bad thing in a modern software system
It happens when for example a loop keeps on runinng but it does not do anything and its a problem because it can slow the processor and
we might even get inconsistant results

Explain about Java's BlockingQueue interface, relevant implementations, and methods relevant for a
producer consumer problem
A Queue that additionally supports operations that wait for the queue to become non-empty 
when retrieving an element, and wait for space to become available in the queue when storing an element
We use it when we are trying to solve Producer/Consumer problems
BlockingQueue methods come in four forms, with different ways of handling operations that cannot be satisfied immediately, 
but may be satisfied at some point in the future: one throws an exception, 
the second returns a special value (either null or false, depending on the operation), 
the third blocks the current thread indefinitely until the operation can succeed, 
and the fourth blocks for only a given maximum time limit before giving up
