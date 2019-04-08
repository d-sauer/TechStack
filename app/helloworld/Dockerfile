FROM alpine:latest as build

# Check the JDK 12 EA downloads link to get the latest version
RUN mkdir -p /opt/jdk \
    && wget -q "https://download.java.net/java/GA/jdk12/32/GPL/openjdk-12_linux-x64_bin.tar.gz" \
    && tar -xzf "openjdk-12_linux-x64_bin.tar.gz" -C /opt/jdk

RUN mkdir /jlink-jre
RUN ["/opt/jdk/jdk-12/bin/jlink", \
     "--compress=2", \
     "--strip-debug", \
     "--no-header-files", \
     "--no-man-pages", \
     "--module-path", "/opt/jdk/jdk-12/jmods", \
     "--add-modules", "java.base,java.logging,jdk.unsupported", \
     "--output", "/jlink-jre"]

FROM alpine:latest
COPY --from=build /jlink-jre /opt/jdk/
ADD app /app

CMD ["/opt/jdk/bin/java", \
     "--upgrade-module-path", "/app", \
     "-m", "techstack.helloworld.service"]