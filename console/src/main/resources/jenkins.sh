echo "###########环境准备###############"
source /etc/profile
jps
echo "###########停止项目###############"
/etc/xiaobo/suveng/sh/stop-sys-console.sh
jps
echo "###########项目构建###############"
cd src/system
mvn clean
mvn package -Dmaven.test.skip=true
mvn install -Dmaven.test.skip=true
cd console
mvn package docker:build
echo "###########项目部署###############"
rm -rf /etc/xiaobo/suveng/app/sys-console.jar
mv target/sys-console-1.0-SNAPSHOT.jar /etc/xiaobo/suveng/app/sys-console.jar
BUILD_ID=dontKillMe /etc/xiaobo/suveng/sh/deploy.sh
echo "###########结束部署###############"
jps
