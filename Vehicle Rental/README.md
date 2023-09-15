# Vehicle Rental System 🚗

## 🧱 Object-Oriented Programming (OOP) Concepts 🎯

The Vehicle Rental System project revolves around several fundamental & must learn for all students OOP concepts:

1. **Inheritance (🏭):** Inheritance is utilized to create a hierarchy of vehicle types. The base class, `Vehicle`, is extended by `Motorcycle`, `Truck`, and `Car` classes, inheriting common properties and behaviors while allowing for specialization.

2. **Polymorphism (🦄):** Polymorphism is achieved through method overriding in the subclasses. Each vehicle type (`Motorcycle`, `Truck`, and `Car`) provides its own implementation of the `getTaxes` and `getManufacturingYear` methods, demonstrating polymorphic behavior `( more methods might ba added in the future )`

3. **Encapsulation (🔒):** Encapsulation is maintained by using private member variables and providing accessors (the usual getters and setters) where necessary to control access to the properties of vehicle objects, ensuring data integrity/security.

4. **Abstraction (🧩):** Abstraction is demonstrated through the abstract class `Vehicle`, which defines a blueprint for all vehicle types. Subclasses provide concrete implementations while adhering to the common structure defined in the abstract class, you can easily observe that abstraction is related to inheritance in some way.

5. **Composition (🧰):** The project demonstrates composition by aggregating vehicle objects within ArrayLists for `Motorcycle`, `Truck`, and `Car`. This composition allows for managing and interacting with collections of vehicles. `( more types might be added in the future )`

6. **Dynamic Binding (🧬):** Dynamic binding is achieved through method calls to the overridden methods such as `getTaxes` and `getManufacturingYear`. The appropriate method is dynamically bound at runtime based on the actual object type.
