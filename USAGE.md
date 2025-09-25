# CCRM Usage Guide

---

### Quick Start
The easiest way to run the application is through the Eclipse IDE.

**Running the Application**
1.  Open the project in Eclipse.
2.  In the Package Explorer, locate and right-click on `CCRMApp.java`.
3.  Select **Run As** → **Java Application**.

---

### Sample Workflow
Follow these steps to explore the core features of the application.

1.  **Start the Application:** Run `CCRMApp.java` in Eclipse.
2.  **Explore Student Management:**
    * From the main menu, select **"1. Manage Students"**.
    * Choose **"1. Add New Student"** and enter a student's details when prompted.
    * Choose **"2. List All Students"** to see your new student.
3.  **Explore Course Management:**
    * Return to the main menu and select **"2. Manage Courses"**.
    * Choose **"1. Add New Course"** and enter a course's details.
    * Choose **"2. List All Courses"** to see your new course.
4.  **Explore Enrollment System:**
    * Return to the main menu and select **"3. Manage Enrollments"**.
    * Choose **"1. Enroll Student in Course"**. Enter the registration number of a student and the code of a course you created.
5.  **Perform Backup Operations:**
    * Return to the main menu and select **"4. Data Utilities"**.
    * First, choose **"1. Export All Data"** to save your student and course data to `students.csv` and `courses.csv`.
    * Then, choose **"2. Create Backup"** to create a timestamped backup folder.

---

### Troubleshooting
**Common Issues**
* **Runtime Errors:**
    * Check that your input matches what the program is asking for (e.g., entering a number when asked for a number).
* **Data File Not Appearing:**
    * After exporting or backing up data, right-click on your project in the Package Explorer and select **Refresh** to see the new files.

---

### Technical Notes
* **Main Class:** The application's entry point is `CCRMApp.java` in the `edu.ccrm.cli` package.
* **Data Storage:** Data is stored in memory and is not persistent between application runs, except when you export or create a backup.
* **File Formats:** Data is exported to and backed up in a simple CSV format.
