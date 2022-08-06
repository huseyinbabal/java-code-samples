### Related Article
[https://huseyinbabal.com/2022/07/30/understanding-java-thread-deadlock/](https://huseyinbabal.com/2022/07/30/understanding-java-thread-deadlock/)

### Requirements
- JDK 11+

### Running Application
- After cloning repository you can run following examples.

### Sequential Lock
```
./gradlew :deadlockprevention:run \
    -PmainClass=com.huseyin.deadlockprevention.SequentialLock
```

### Nested Lock with Join
```
./gradlew :deadlockprevention:run \
    -PmainClass=com.huseyin.deadlockprevention.NestedLockWithJoin
```
