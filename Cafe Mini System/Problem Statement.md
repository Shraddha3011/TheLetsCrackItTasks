
# ☕ The Coders Aesthetic Cafe — Mini Project

Welcome to **The Coders Aesthetic Cafe!** 👨‍💻☕

In this mini project, you’ll build a simple cafe ordering system **step by step using the Java concepts you’ve learned so far.**

Don't try to build everything at once.
Complete each level and upgrade your program as you go. 🚀

---

## 🎯 Your Goal

Build a Java program where a customer can:

**View the menu → Choose an item → Check availability → Place orders → Calculate the bill**

You should use only the concepts covered so far:

* Variables
* Data types
* `Scanner`
* `if-else`
* `switch-case`
* `for` loop
* `while` loop

---

# 🥉 Level 1 — Create the Cafe Menu

### Your Task

Create a Java program for **The Coders Aesthetic Cafe**.

Display a menu like:

```text
☕ ===== THE CODERS AESTHETIC CAFE ===== ☕

1. Samosa       ₹15
2. Vada Pav     ₹10
3. Cold Coffee  ₹60
```

### Requirements

* Create variables for the food items.
* Create variables for their prices.
* Display the cafe name.
* Display all menu items and prices.

💡 **Challenge:** Try changing the menu items and prices yourself.

---

# 🥈 Level 2 — Take the Customer's Order

Now let's make the cafe interactive! 👀

### Your Task

Ask the customer which food item they want.

For example:

```text
Enter your order:
Vada Pav

You ordered: Vada Pav
```

### Requirements

* Use `Scanner`.
* Take the customer's input.
* Store it in a variable.
* Display the selected item.

💡 **Challenge:** Ask the customer for their name too.

Example:

```text
Enter your name: Rahul
Enter your order: Vada Pav

Hi Rahul! You ordered Vada Pav.
```

---

# 🥇 Level 3 — Is the Item Available?

The customer might enter something that isn't on the menu. 😅

### Your Task

Check whether the entered item is available.

Example:

```text
Enter item number: 2

Vada Pav is available!
Price: ₹10
```

If the customer enters an invalid option:

```text
Enter item number: 7

Sorry! This item is not available today.
```

### Requirements

Use:

```text
if
else if
else
```

💡 **Challenge:** What should happen if the customer enters `0` or `-1`?

---

# 🏆 Level 4 — Upgrade to Switch-Case

Our cafe is growing! 🚀

Instead of using multiple `if-else` conditions, upgrade your ordering system using **switch-case**.

### Your Task

Let the customer choose using a menu number:

```text
===== MENU =====

1. Samosa       ₹15
2. Vada Pav     ₹10
3. Cold Coffee  ₹60

Enter item number: 3

You selected: Cold Coffee
Price: ₹60
```

### Requirements

Use:

```java
switch
case
break
default
```

### 💡 Challenge

What should happen when the customer enters:

```text
4
```

---

# 🚀 Level 5 — Order Multiple Items

One item isn't enough. 😂

The customer wants:

```text
2 Samosas
1 Vada Pav
1 Cold Coffee
```

Now we need to calculate the total.

### Your Task

First ask:

```text
How many items do you want to order?
```

Then repeatedly ask for the item number.

Example:

```text
How many items do you want to order? 3

Enter item 1: 1
Enter item 2: 2
Enter item 3: 3

Your total bill = ₹95
```

### Requirements

Use a loop to repeat the ordering process.

Calculate the total price as the customer orders.

💡 **Challenge:** Display the running total after every order.

Example:

```text
Added Samosa ₹15
Running Total: ₹15

Added Vada Pav ₹10
Running Total: ₹35
```

---

# 🔥 Level 6 — Keep Ordering Until the Customer Says Stop

Now let's make it feel like a **real cafe system**.

Instead of asking:

> "How many items do you want?"

let the customer decide when they're finished.

### Your Task

After every order, ask:

```text
Do you want to order more?

1. Yes
2. No
```

Example:

```text
Enter item number: 1
Added Samosa ₹15

Order more?

1. Yes
2. No

Enter choice: 1

Enter item number: 3
Added Cold Coffee ₹60

Order more?

1. Yes
2. No

Enter choice: 2

========== BILL ==========

Total: ₹75

Thank you for visiting
The Coders Aesthetic Cafe! ☕
```

### Requirements

Use a `while` loop.

The ordering should continue while the customer chooses **Yes**.

When the customer chooses **No**, stop ordering and display the final bill.

💡 **Challenge:** Try doing this **without using `.equals()`**.

---

# 🧠 BONUS CHALLENGES

Once you finish all 6 levels, don't stop! 😈

Try adding these yourself:

### ⭐ Challenge 1

Add **2 more cafe items**.

### ⭐ Challenge 2

Add **quantity**.

Instead of:

```text
1 Samosa
```

allow:

```text
How many Samosas? 3
```

Then calculate:

```text
3 × ₹15 = ₹45
```

### ⭐ Challenge 3

Add a discount.

```text
Bill = ₹500

Discount = 10%

Final Bill = ₹450
```

### ⭐ Challenge 4

Show a proper bill:

```text
==============================
     THE CODERS AESTHETIC CAFE
==============================

Samosa          ₹15
Vada Pav        ₹10
Cold Coffee     ₹60
------------------------------
Total           ₹95
------------------------------

Thank you! ☕
```

---

# 🎯 What You Should Learn

By completing this project, you should understand **why** we use each concept:

```text
Variables
    ↓
Store cafe information

Scanner
    ↓
Take customer input

if-else
    ↓
Make decisions

switch-case
    ↓
Handle menu choices

for / while
    ↓
Repeat ordering

Variables + Conditions + Loops
    ↓
Real Working Program
```

### 🚀 Final Goal

Don't just copy the code.

**Build it yourself. Break it. Fix it. Improve it.**

That's how you actually learn programming. ❤️

**The Lets Crack It**
*Learn → Build → Break → Fix → Repeat*

By Shraddha Jadhav
