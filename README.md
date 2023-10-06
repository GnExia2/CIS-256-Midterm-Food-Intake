# CIS-256-Midterm-Food-Intake

The goal of this midterm project is to apply your knowledge of data structures in Java to solve a problem or implement a simplified version of a real-world application. The proposal should clearly articulate the purpose, scope, and functionality of the project.

 

Project Requirements:
For this project, you may draw upon any of the topics that we have covered (or will be covering) so far in the first half of the course including but not limited to:

Recursion
Searching and Sorting
Array Lists and Linked Lists (Singly & Doubly)
Stacks and Queues
Hash Tables
Trees
Heaps and Priority Queues
In order to test your mastery of the subjects of this course, your project will require you to include concepts from at least 4 different modules of the course (not including module 1), and you will need to use at least two different data structures from two different modules. A stack implemented with linked lists will not count as two for example. You will be expected to justify why you used the data structures you picked as part of your project report, and why other data structures did not fit your needs as well.

Additionally:

Your project should allow for some kind of user interaction, whether it be through Scanner, GUI, or file input.
Your project should ideally solve a real-world problem or simulate a real-world system. Be creative: A text based adventure using trees for branching dialogue and stacks for inventory management could be used to teach about a real world problem in a fun and educational way.
Proper code commenting and a final report explaining your design decisions, data structures used, and potential impact of your project are mandatory.
You will be required to present your project to the class with a video explaining your problem statement, the data structures used, and a demo of the working code.
If you do not have proper recording equipment, please reach out and I will put you into contact with the variety of resources the college has to offer. Additionally, your local public library will often have equipment you can use in order to generate your recording. You have several weeks notice, so no excuse will be accepted for failing to submit a presentation.



HashMap (in FoodDatabase.java):
The FoodDatabase class uses a HashMap to store food items with their names as keys and FoodItem objects as values. This data structure allows for efficient retrieval of food items by their names.

Stack (in DietaryGoalsStack.java):
The DietaryGoalsStack class uses a Stack to manage dietary goals. It allows you to push dietary goals onto the stack and pop them off the stack as needed. This data structure follows the Last-In-First-Out (LIFO) principle.

LinkedList (in MealLog.java):
The MealLog class uses a LinkedList to maintain a log of meal entries. It allows you to efficiently add new meal entries to the end of the list and iterate through them. This data structure provides flexibility for managing meal entries.

Queue (in NotificationQueue.java):
The NotificationQueue class uses a Queue (implemented as a LinkedList) to manage notifications. It allows you to enqueue (add) notifications to the end of the queue and dequeue (remove) them from the front of the queue. This data structure follows the First-In-First-Out (FIFO) principle.

