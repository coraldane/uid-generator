# Docker image for springboot file run
# VERSION 1.0.0
# Author: coraldane
# 基础镜像使用java
FROM java:8
# 作者
MAINTAINER coraldane <coraldane@163.com>
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp 
# 将jar包添加到容器中并更名为app.jar
ADD target/uid-generator-1.0.0.jar app.jar 
# 运行jar包
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
