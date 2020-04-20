# actions-achieve

[![license](https://img.shields.io/badge/license-MIT-green.svg?style=flat&logo=github)](https://www.mit-license.org)
[![java](https://img.shields.io/badge/java-11-brightgreen.svg?style=flat&logo=java)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![gradle](https://img.shields.io/badge/gradle-5.6.2-brightgreen.svg?style=flat&logo=gradle)](https://docs.gradle.org/5.6.2/userguide/installation.html)
[![build](https://github.com/aaric/actions-achieve/workflows/build/badge.svg)](https://github.com/aaric/actions-achieve/actions)
[![release](https://img.shields.io/badge/release-0.1.1-blue.svg)](https://github.com/aaric/actions-achieve/releases)

> Actions Learning.

## Workflow

```yaml
name: build

on: [push]

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v2
    - name: Set up JDK 11
      uses: actions/setup-java@v1
      with:
        java-version: 11
    - name: Build with Gradle
      run: |
        chmod +x gradlew
        ./gradlew build
```

## Badge

```text
# image
https://github.com/<OWNER>/<REPOSITORY>/workflows/<WORKFLOW_NAME>/badge.svg?branch=<branch-name>

# sample
![Actions Build Status](https://github.com/aaric/actions-achieve/workflows/build/badge.svg?branch=master)
```
