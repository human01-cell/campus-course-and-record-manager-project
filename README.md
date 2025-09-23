\# Campus Course \& Records Manager (CCRM)



\[cite\_start]A console-based Java application for managing students, courses, enrollments, and records for an educational institute\[cite: 4].



\## How to Run

\* \*\*JDK Version:\*\* Java 17 (or your chosen version)

\* \*\*Compile \& Run:\*\* `javac ...` and `java ...`

\* \[cite\_start]\*\*Enable Assertions:\*\* Run with the `-ea` flag: `java -ea edu.ccrm.cli.CCRMApp`\[cite: 89, 137].



---



\## \[cite\_start]1. Evolution of Java \[cite: 42, 132]

\* \*\*1996 - JDK 1.0:\*\* The initial release of Java.

\* \*\*2004 - Java 5 (J2SE 5.0):\*\* Introduced major features like Generics, Enums, Autoboxing, and Annotations.

\* \*\*2014 - Java 8:\*\* A landmark release that brought Lambda Expressions, the Stream API, and a new Date/Time API.

\* \*(Add a few more modern releases, e.g., Java 11, 17)\*



---



\## \[cite\_start]2. Java ME vs. Java SE vs. Java EE \[cite: 43, 133]



| Feature         | Java ME (Micro Edition)     | Java SE (Standard Edition)          | Java EE (Enterprise Edition)       |

| --------------- | --------------------------- | ----------------------------------- | ---------------------------------- |

| \*\*Target\*\* | Mobile, embedded devices    | Desktop, servers, console apps      | Large-scale, distributed apps      |

| \*\*Core API\*\* | Subset of Java SE API       | The foundational Java API (Core Java) | Superset of Java SE API          |

| \*\*Includes\*\* | `java.lang`, `java.util` (limited) | JDK, JRE, JVM, core libraries   | Servlets, JSP, EJB, Web Services   |

| \*\*Use Case\*\* | Old feature phones, sensors | This CCRM project, desktop GUI apps   | E-commerce sites, banking software |



---



\## \[cite\_start]3. Java Architecture: JDK, JRE, JVM \[cite: 44, 134]



\* \*\*JVM (Java Virtual Machine):\*\* An abstract machine that provides the runtime environment in which Java bytecode can be executed. It's platform-dependent and interprets the compiled bytecode.

\* \*\*JRE (Java Runtime Environment):\*\* The software package that contains what is required to run a Java program. It includes the JVM and core Java libraries. You need the JRE to \*run\* Java applications.

\* \*\*JDK (Java Development Kit):\*\* A superset of the JRE. It contains everything in the JRE, plus development tools like the compiler (`javac`) and debugger. You need the JDK to \*develop\* Java applications.



---



\## \[cite\_start]4. Errors vs. Exceptions in Java \[cite: 83]



\* \*\*Error:\*\* Represents serious problems that a reasonable application should not try to catch. These are typically unrecoverable issues related to the runtime environment itself, such as `OutOfMemoryError` or `StackOverflowError`.

\* \*\*Exception:\*\* Represents conditions that a reasonable application might want to catch. These are problems that can occur during program execution but can often be handled gracefully. They are further divided into \*checked exceptions\* (like `IOException`) and \*unchecked exceptions\* (like `NullPointerException`).

