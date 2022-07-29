### Related Article
[https://huseyinbabal.com/2022/07/30/understanding-java-thread-deadlock/](https://huseyinbabal.com/2022/07/30/understanding-java-thread-deadlock/)

### Requirements
- JDK 11+

### Running Application
- After cloning repository you can run following examples.

### Threads Without Synchronization
```
./gradlew :deadlock:run \
    -PmainClass=com.huseyin.deadlock.ThreadsWithoutSynchronization
```

### Threads With Synchronization
```
./gradlew :deadlock:run \
    -PmainClass=com.huseyin.deadlock.ThreadsWithSynchronization
```

### Threads Deadlock
```
./gradlew :deadlock:run \
    -PmainClass=com.huseyin.deadlock.ThreadsDeadlock
```
