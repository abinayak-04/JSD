# Linux

### Linux
* It was first developed by Linustorvales in 1991 by sun micro systems.
* It can be modified as the user's need.
* It is a free source and can be accessed by anyone.
* Linux is derived from Unix. In Unix multiple users can be used.

---

### What is OS?
Operating system (OS) is a software that manages the computer's hardware and software resources and provides common services for applications.

### Hardware:
Hardware are the physical components.
* **Ex:** CPU, RAM, SSD/HDD, Keyboard, mouse, network card.

### OS Diagram
`[User] -> [Application / Chrome/etc.] -> (Operating system) -> (Kernel) -> [Hardware / CPU, RAM, Keyboard]`

### What is Kernel?
* It is the core part of an operating system that handles interactions between hardware and software.
* It is the heart of the OS

### Basic responsibilities
1. **CPU/Process management** [Which program get CPU time?]
2. **Memory management** [Which and how program are stored in RAM]
3. **Hardware Interaction** [Clicked on keyboard -> Kernel -> Application]
4. **Storage/files**
5. **Networking**
---
## How to access linux system

* **Step 1:** open www.putty.org
* **Step 2:** click Download PuTTY, in the package choice 64-bit x86 download as msi file
* **Step 3:** Install PuTTY
* **Step 4:** Open PuTTY, then select Host only Adapter, If it shows not selected, follow as below:
    * open your device manager
    * click on Network adapter, there on VirtualBox Host-Only Ethernet Adapter right click on it, then click Enable device. Close PuTTY and open it again and now choose Host only Adapter.
* **Step 5:** click OK
* **Step 6:** In the Host Name (or IP address) box enter your IP address. To check or know your IP open terminal use commands like:
    * `> ip a` or `> ip addr` or `> ifconfig`
* **Step 7:** In the saved sessions enter the name like LinuxIP. Then click save.
* **Step 8:** Then choose your LinuxIP then click Load, then click open.
* **Step 9:** The PuTTY terminal, will gets open where you can run and use the Linux and Linux commands.
----

**Shortcut Keys**
1) Ctrl + l -> clear or new page
2) Ctrl + c -> quit or new command line
3) ls -l1 -> continues command
---

#### Linux vs Windows
**Linux**
- It is case sensitive
- It works on Command Line Interface (CLI)
- Linux kernel is not an OS it is a small part of OS
- In linux while creating files or folder don't use space (use only underscore)

**Windows**
- It works on Graphical User Interface (GUI)
---
**Root user (Super user)**
- Root user can create, update, delete and can change any configuration to the OS
- It can even delete the entire OS.

Command Prompt (Terminal)
- Username @ hostname : prompt symbol
  Ex. abc@localhost:~$

**To change password**
- open terminal
- passwd username
- then enter new password, again retype it, successfully changed.

**Common Linux Server Software**
- In the Linux server we can run different services.
---
## Server Types

### Web Server
* Apache
* Nginx

### Database Server
* MySQL
* PostgreSQL
* MariaDB
* Use to store / manage data

### File Server
* Used to share files through network

---

## SSH Server
* To access the Linux server remotely
  `ssh username@server`
* Common implementation: OpenSSH

---

## Mail Server
* It is a software that handles sending / receiving of Emails

---

## Process of How the Linux run when switched on
OS → Kernel → Linux Kernel → Linux Distribution → Ubuntu / Debian / Redhat / Centos → Software + Package Manager → Linux Desktop / Server / Embedded devices

---

## Key Terms
1) **OS** - It is a system software that manages the computer resources.
2) **Kernel** - It is the core of OS.
3) **Linux Kernel** - It is open source kernel.
4) **Distribution** - Kernel + tools + applications + package management etc.
5) **Open Source** - 
6) **Package Manager** - It helps to install / update / remove software.
7) **Repository** - software packages are available here.

---
Here is the text extracted from the image in Markdown format:
## Root User vs Normal User

| Feature | Root user | Normal user |
|---|---|---|
| System access | Almost everything | Limited |
| Modify system files | Yes | No |
| Install software | Yes | Needed (No but with sudo) |
| Delete system files | Yes | No |
| Access other user files | Yes | No |
| Create files in Home | Yes | Yes |
| UID (User ID) | 0 | Usually 1000 + |
| Sudo needed | No | Yes for admin tasks |

---
### File system structure (/)
1) /bin - user level commands (cat, cp, cd, ls etc)
2) /sbin - System / filesystem level commands (backing, restoring, recovering the system)
3) /etc - Configuration files
4) /dev - Device files (Disk, CDROM, Flash drive)
5) /proc - Running process
6) /var - system logs
7) /tmp - Directory for temporary files
8) /usr - User programs and commands
9) /home - Directory of user
10) /boot - contains files used by boot loader (grub.cfg)
11) /lib - c programing files needed by commands and apps
12) /opt - optional add-on apps (Not part of os apps)
13) /mnt - To mount removable media manually
14) /media - to mount external harddisk, Flashdrive, CDROM
15) /srv - site specific data (FTP, WWW)
---
## How to change network?

* open Virtual box
* Open settings of your Linux
* choose network, there in the Attached to change to NAT from Host only adapter
* click ok

## Linux downloading files

* Each Linux has specific file format to download any software.
* You should know your Linux distribution (Ex. Red hat or Ubuntu).
----
## Managing Services## Process flow chart

        Program
           │
           ▼ Execute
        Process
       ┌───┴───┐
  Application  Daemon
       │         │
User Interact  Background
       └───┬───┘
           ▼
        Service

------------------------------
## Definitions

* Process
* A process is an instance of a program that is currently being executed.
* Application
* An application is a user-interactive process that provides functionality directly to the user.
* Daemon
* A daemon is a background process that normally operates without direct user interaction.
* Service
* A service is a process or group of processes that provides functionality or responds to requests from clients.
------------------------------
## Advantages of Linux

- High Security
- Data is safe
- No need for an anti virus

## Disadvantages of Linux
- Hard to work
---
## Linux Commands

1. **`ip a` / `ip addr` / `ifconfig`**  
   → To know your IP address and network details.

2. **`whoami`**  
   → To know the current user/account you are logged in as.

3. **`su username`**  
   → To switch to another user account.

4. **`pwd`**  
   → To know the current working directory.

5. **`ls`**  
   → To list files and folders (directories).

6. **`ls -l`**  
   → To display a detailed list of files and directories.

7. **`ls -a`**  
   → To display all files, including hidden files.

8. **`cd foldername`**  
   → To change to a specific directory.

9. **`cd ..`**  
   → To move one level back from the current directory.

10. **`cd /`**  
    → To change to the root directory.

11. **`cd ~`**  
    → To change to the home directory.

12. **`clear`**  
    → To clear the terminal screen.  
    **Shortcut:** `Ctrl + L`

13. **`history`**  
    → To view previously executed commands.

14. **`hostname`**  
    → To know the computer/host name.

15. **`date`**  
    → To display the current date and time.

16. **`cal`**  
    → To display the calendar.
17. **`vi`**  
    → To edit a file.  
    **Sub-commands:**  
    * `i` – To insert text.  
    * `:w` – To save changes.  
    * `:wq` – To save and exit.  
    * `:q!` – To exit without saving.

18. **`rm filename`**  
    → To remove/delete a file.

19. **`echo "Hello" > filename.txt`**  
    → To create a file with content or to overwrite existing content.

20. **`ls -R`**  
    → To recursively list files and folders inside subdirectories.

21. **`ls a*`**  
    → To list all files and folders starting with the letter `a`.

22. **`ls a???`**  
    → To list files starting with `a` followed by exactly 3 characters.

23. **`cp filename1 filename2`**  
    → To copy the contents of `filename1` into `filename2`.
24. **`mkdir folder_name`**  
   → To create a directory (folder).  
   *Note: Avoid using spaces in directory names.*

25. **`mkdir -p project/src/comp`**  
   → To create parent directories along with nested subdirectories in a specific path.

26. **`cp filename /home/user/`**  
   → To copy a file into a specific directory (`/home/user/`).

27. **`less filename`**  
   → To view the contents of a file page by page.  
   **Shortcuts:**  
   * `Space` or `f` – Move to the next page.  
   * `q` – Exit/quit.  
   * `Ctrl + Z` – Suspend process.

28. **`ifconfig`**  
   → To check IP address and network configuration details.

29. **`head filename`**  
   → To display the first few lines of a file (default is 10 lines).

30. **`tail filename`**  
   → To display the last few lines of a file (default is 10 lines).

31. **`find /home -name "file1.txt"`**  
    → To search for a file named `file1.txt` starting from the `/home` directory.

32. **`find / -name "*.log"`**  
    → To search for all `.log` files across the entire root (`/`) file system.

33. **`find . -type f`**  
    → To search for only files in the current working directory.

34. **`find . -type d`**  
    → To search for only directories in the current working directory.

35. **`grep "error" file.txt`**  
    → To search for a specific word ("error") inside a file (case-sensitive).

36. **`grep -i "error" file.txt`**  
    → To search for a word inside a file, ignoring case sensitivity.

37. **`grep -r "error" /var/log/`**  
    → To recursively search for a specific word across all files inside a directory (`/var/log/`).

38. **`which python`**  
    → To find the executable path/location of the `python` command.

39. **`which java`**  
    → To find the executable path/location of the `java` command.

40. **`which ls`**  
    → To locate the binary path of the `ls` command.

41. **`id`**  
    → To view the current user's User ID (UID), Group ID (GID), and group memberships.

42. **`who`**  
    → To check who is currently logged in to the system along with login times.

43. **`w`**  
    → To view logged-in users and see their current processes/activities.

44. **`users`**  
    → To display a list of usernames currently logged in to the system.

45. **`top`**  
    → To display real-time system processes, CPU/memory usage, and system performance metrics.  
    *(Note: Use `tail -f /path/to/logfile` to view live log files).*