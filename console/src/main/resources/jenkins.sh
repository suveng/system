source /etc/profile
jps
/etc/xiaobo/suveng/sh/stop-sys-console.sh
jps
cd src/system
mvn clean
mvn package -Dmaven.test.skip=true
mvn install -Dmaven.test.skip=true
cd console
mvn package docker:build
BUILD_ID=dontKillMe /etc/xiaobo/suveng/sh/deploy.sh
jps
