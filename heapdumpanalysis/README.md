### Related Article
[https://huseyinbabal.com/2022/07/30/understanding-java-thread-deadlock/](https://huseyinbabal.com/2022/07/30/understanding-java-thread-deadlock/)

### Requirements
- JDK 11+

### Running Application
- After cloning repository you can run following examples.

### Heap Dump Show-Case
```
JAVA_TOOL_OPTIONS=-Xmx200m \
./gradlew :heapdumpanalysis:run \
-PmainClass=com.huseyin.heapdumpanalysis.HeapDump \
--args="180 30"
```
And follow the article to see how to use VisualVM

### Automatic Capturing of Heap Dump 
```
JAVA_TOOL_OPTIONS="-Xmx200m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp/heapdump.hprof" \
./gradlew :heapdumpanalysis:run \
-PmainClass=com.huseyin.heapdumpanalysis.HeapDump \
--args="210 30"
```
