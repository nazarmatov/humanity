# Transport System

## Description
This project is a simple Java-based transport system demonstrating basic Object-Oriented Programming (OOP) principles like inheritance, encapsulation, and method overriding.

## Structure
The project consists of the following classes inside the `transports` package:

### 1. `Transport`
- Base class for all transport types.
- Attributes: `type`, `brand`, and `levelOfTank`.
- Methods:
  - `feelTank()` - Refills the fuel tank.
  - Getters and setters for `type`, `brand`, and `levelOfTank`.

### 2. `Car` (extends `Transport`)
- Represents a car with an additional attribute `carType`.
- Methods:
  - `crushTheCar()` - Simulates the car being crushed.
  - Getters and setters for `carType`.

### 3. `Airplan` (extends `Transport`)
- Represents an airplane with additional attributes `name` and `free` (indicates if the plane is available).
- Methods:
  - `blastOff()` - Simulates the airplane taking off.
  - `plant()` - Simulates the airplane landing.
  - Getters and setters for `name`.

## Usage
- Create objects of `Car` and `Airplan`.
- Use their methods to perform actions like refueling, blasting off, landing, and crushing.

## Example
```java
Car car = new Car("Sedan", "Vehicle", "Toyota");
car.feelTank();
System.out.println(car.crushTheCar());

Airplan plane = new Airplan("Boeing 747", "Boeing", "Airplane");
plane.blastOff();
plane.plant();
