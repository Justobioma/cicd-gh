# GitHub Actions CI/CD Java with Gradle

A simple Java project using Gradle, built to demonstrate Continuous Integration (CI) and Continuous Delivery (CD) with GitHub Actions.

## 🚀 Overview

This project showcases a minimal setup for:
- Java application built with Gradle
- CI/CD pipeline using GitHub Actions
- Unit testing with JUnit
- GitHub workflow automation

The app prints a simple greeting message, and the pipeline ensures every commit is automatically built and tested.

## 🛠 Tech Stack

- Java 17
- Gradle 8.x
- JUnit 5
- GitHub Actions

## 📦 Project Structure
src/ ├── main/ │   └── java/ │       └── com/example/App.java ├── test/ │   └── java/ │       └── com/example/AppTest.java .github/ └── workflows/ └── ci.yml


## ✅ Build & Test Locally

To build and run tests using the Gradle Wrapper:

```bash
.\gradlew.bat build
.\gradlew.bat test

🤖 CI/CD Workflow
The gradle.yml GitHub Actions workflow triggers on:
- Pushes and pull requests to the main branch
- Manual dispatch via the Actions tab
Steps include:
- Checkout source code
- Set up Java environment
- Run ./gradlew build and ./gradlew test

## Screenshot
![Screenshot_15-7-2025_74631_github com](https://github.com/user-attachments/assets/8d03ed69-ffe9-4eea-9661-56f356bad326)
