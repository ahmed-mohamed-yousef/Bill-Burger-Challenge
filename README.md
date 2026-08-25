# 🍔 Bills Burger Challenge

## 📌 Project Overview

Bills Burger Challenge is a Java console application that simulates a burger ordering system.

The application allows customers to create different burger types, customize their orders with toppings, select drink sizes, calculate the final price, and print a detailed itemized receipt.

This project was built to practice and demonstrate core Object-Oriented Programming (OOP) concepts in Java through a real-world food ordering scenario.

---

# 🚀 Features

- Create regular burgers.
- Create deluxe burgers with additional toppings.
- Add customized toppings to burgers.
- Change drink sizes.
- Calculate adjusted prices automatically.
- Print detailed order receipts.
- Support different meal configurations.

---

# 🏗️ Project Structure

```
BillsBurgerChallenge
│
├── Item.java
├── Burger.java
├── DeluxeBurger.java
├── MealOrder.java
└── BillsBurgerChallenge.java
```

---

# 🧠 OOP Concepts Applied

## 1. Encapsulation

The project applies encapsulation by keeping class attributes private and controlling access through methods.

Example:

```java
private String name;
private double price;

public double getBasePrice()
{
    return price;
}
```

Benefits:
- Protects object data.
- Provides controlled access to attributes.

---

## 2. Inheritance

Inheritance is used to reuse existing functionality and create relationships between classes.

Class hierarchy:

```
            Item
              |
           Burger
              |
        DeluxeBurger
```

Examples:

```java
public class Burger extends Item
```

```java
public class DeluxeBurger extends Burger
```

---

## 3. Composition

Composition is used when one object contains other objects.

Example:

`MealOrder` contains:

- Burger
- Drink
- Side

```java
private Burger burger;
private Item drink;
private Item side;
```

Also, `Burger` contains topping objects:

```java
private Item extra1;
private Item extra2;
private Item extra3;
```

---

## 4. Polymorphism

The project uses polymorphism by allowing a parent reference to store child objects.

Example:

```java
private Burger burger;

burger = new DeluxeBurger();
```

The executed method depends on the actual object type.

---

## 5. Method Overriding

Several methods are overridden to provide customized behavior.

Examples:

```java
@Override
public String getName()
```

```java
@Override
public double getAdjustedPrice()
```

```java
@Override
public void printItem()
```

---

## 6. Method Overloading

The project uses multiple methods with the same name but different parameters.

Example:

```java
addBurgerToppings(String extra1,String extra2,String extra3)
```

and

```java
addBurgerToppings(String extra1,String extra2,String extra3,String extra4,String extra5)
```

---

# 📚 Classes Explanation

## 🍟 Item Class

The base class for all items.

Responsibilities:

- Store item information.
- Handle size selection.
- Calculate adjusted prices.
- Print item details.

Attributes:

```
type
name
price
size
```

---

## 🍔 Burger Class

Extends the Item class.

Responsibilities:

- Create burgers.
- Add toppings.
- Calculate topping prices.
- Print burger details.

Example:

```java
Burger burger = new Burger("Regular",4.0);

burger.addToppings(
"BACON",
"CHEESE",
"MAYO"
);
```

---

## 👑 DeluxeBurger Class

A special burger type.

Features:

- Supports five toppings.
- Includes two additional free toppings.

Example:

```java
DeluxeBurger deluxe =
new DeluxeBurger("Deluxe",8.5);
```

---

## 🍽️ MealOrder Class

Responsible for creating complete meals.

A meal contains:

- Burger
- Drink
- Side

Responsibilities:

- Calculate total price.
- Add toppings.
- Change drink size.
- Print the final receipt.

---

# ▶️ How The Program Works

Example:

```java
MealOrder deluxeMeal =
new MealOrder(
"deluxe",
"7 Up",
"chili"
);

deluxeMeal.addBurgerToppings(
"AVOCADO",
"BACON",
"LETTUCE",
"CHEESE",
"MAYO"
);

deluxeMeal.setDrinkSize("SMALL");

deluxeMeal.printItemizedList();
```

---

# 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Switch Expressions
- Console Application

---

# 🎯 Learning Outcomes

Through this project, I practiced:

- Designing classes using OOP principles.
- Using inheritance and composition.
- Applying polymorphism.
- Creating reusable and maintainable Java code.
- Building relationships between objects.

---

# 👨‍💻 Author

**Ahmed Mohamed Youssef**

Computer Science Student  
Benha University
