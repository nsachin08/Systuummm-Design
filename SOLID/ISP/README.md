# Interface Segregation Principle

- The Interface Segregation Principle states that no code should be forces to depend on methods it does not use.

- There should not be any method in a class , which has no use for its functionality .

- A larger class with multiple functionality can be splitted into multiple interface and required class can implements only the required interface.

### BAD CODE

- Some of the classes are unnecessararily implementing the not required function.


### GOOD CODE

- Seperating the functionality in interface and the required classes can implement the interface
