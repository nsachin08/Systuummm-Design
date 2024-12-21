# Dependency Inversion Principle

- This principles states that high-level modules should not depend on low-level modules, but instead both should depend on abstractions

- Instead of classes directly depending on other classes, they should depend on interfaces or abstractions.


### BAD CODE
- In notification Service, Email Service and SMS Service are tightly coupled.

### GOOD CODE

-  We have dedicated NotificalChannel which we can call notify() and client is not tightly coupled with any Notification Service.