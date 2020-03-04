# actions-achieve

> Actions Learning.

[![Actions Build Status](https://github.com/aaric/actions-achieve/workflows/Java%20CI/badge.svg?branch=master)]

## Workflow

```yaml
name: Java CI

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
    - name: Grant execute permission for gradlew
      run: chmod +x gradlew
    - name: Build with Gradle
      run: ./gradlew build

```

## Badge

```text
# image
https://github.com/<OWNER>/<REPOSITORY>/workflows/<WORKFLOW_NAME>/badge.svg?branch=<branch-name>

# sample
[![Actions Build Status](https://github.com/aaric/actions-achieve/workflows/Java%20CI/badge.svg?branch=master)]
```
