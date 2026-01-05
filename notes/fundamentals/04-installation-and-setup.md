# Installation & Setup

## Prerequisites

Before installing Java, make sure:
- You have a system running:
    - Windows
    - macOS
    - Linux
- You have basic access to:
    - Terminal (macOS / Linux)
    - Command Prompt or PowerShell (Windows)

---

## Downloading JDK

- Java Development Kit (JDK) is required to develop Java applications
- JDK can be downloaded from:
    - Oracle website
    - OpenJDK distributions
- Choose the JDK version based on:
    - Operating system
    - System architecture (64-bit recommended)

---

## Installation Steps

### Windows
- Download the JDK installer (`.exe`)
- Run the installer and follow the setup wizard
- Note the installation path (usually under `Program Files`)

---

### macOS
- Download the JDK installer (`.dmg`)
- Open the installer and follow instructions
- JDK is usually installed under `/Library/Java/JavaVirtualMachines/`

---

### Linux
- Install JDK using the package manager
- Common package managers:
    - `apt` (Ubuntu / Debian)
    - `yum` or `dnf` (RHEL / Fedora)
- JDK is installed in standard system directories

---

## Setting Environment Variables

### JAVA_HOME
- `JAVA_HOME` points to the JDK installation directory
- It helps tools and applications locate Java

---

### PATH
- Add the JDK `bin` directory to the system `PATH`
- Allows running Java commands from any location

---

## Verifying Installation

Open terminal or command prompt and run:

```bash
java -version
