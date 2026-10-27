# Java Homeworks

Java homework projects from my computer engineering coursework. Each folder is a separate IntelliJ IDEA module (`.iml` + `src/`) with no external dependencies.

## Contents

| Folder | Topic | Status |
| --- | --- | --- |
| `Javahomework_1/` | **OOP and inheritance.** A `Dog` base class (name, color, breed, hunger state; `bark`, `fetch`, `wagTail`, `feed`) with two subclasses: `HuntingDog` (tracking skill, `track`, `train`) and `ServiceDog` (specialization, on-duty state, `startWork`, `assist`). `DogDemo` creates one of each and calls their methods. | Complete, runnable via `DogDemo` |
| `Javahomework_2/` | IntelliJ module skeleton | `Main.java` is empty |
| `homework4/` | IntelliJ module skeleton | `Main.java` is unfinished and does not compile yet |
| `homework_6/` | **Generic singly linked list.** `LList<T>` with an inner `Node` class, supporting `add` (append and insert at a position), `remove`, `getEntry`, `contains`, `isEmpty`, `clear`, `toArray`, `getSize` and `toString`. `LListTest` exercises each operation and prints the results. | Complete, runnable via `LListTest` |

## Structure

```
java-homeworks/
├── Javahomework_1/src/   Dog.java, HuntingDog.java, ServiceDog.java, DogDemo.java
├── Javahomework_2/src/   Main.java
├── homework4/src/        Main.java
└── homework_6/src/       Llist.java (class LList<T>), LListTest.java, Main.java (IDE template)
```

## Running

**IntelliJ IDEA:** open a homework folder as a project, set a JDK, then run `DogDemo` or `LListTest`.

**Command line** (any recent JDK):

```bash
# Homework 1 - inheritance demo
cd Javahomework_1/src
javac Dog.java HuntingDog.java ServiceDog.java DogDemo.java
java DogDemo

# Homework 6 - linked list
cd homework_6/src
javac Llist.java LListTest.java
java LListTest
```

## Author

Ayşe Sümeyra Mert, Computer Engineering student
