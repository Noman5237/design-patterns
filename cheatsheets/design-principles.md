# Design Principles
___

1. Identify the aspects of your application that vary and separate them from what stays the same
> - Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.
> - Fewer unintended consequences of code changes and more flexibility in your systems!

2. Program to an interface, not an
implementation.
> - *Program to an interface* really means
  *Program to a supertype*.
> - The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code.