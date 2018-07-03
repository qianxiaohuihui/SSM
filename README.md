# ssm
IDEA搭Maven+SSM实现增删改查
参考网友博客搭建而成：https://blog.csdn.net/khxu666/article/details/79851070

开发工具
IntelliJ IDEA Ultimate 2017.2.2
Apache-tomcat-9.0.5
JDK 1.8.0_121
MySQL 5.7
Maven 3.3.9
工程结构


IDEA+Maven搭建项目骨架
1. 新建Maven项目： 
点击File -> New -> Project -> Maven -> 勾选 Create from archetype -> 选择 maven-archetype-webapp (注意：此处不要错选成上面的cocoom-22-archetype-webapp)
2. 在新建的项目中添加所需要的文件/文件夹
在项目的根目录下新建target文件夹，系统自动将其设置为“Excluded”
在src/main目录下新建Directory：“java”，并将其设置为“Source Root”（即：此项目默认的代码文件源目录） 
在刚才新建的java文件下新建“com”包，再在com包下新建四个包，分别命名为：pojo,service,dao,controller。

新建的四个包：pojo,service,dao,controller，其所存放的分别是：
pojo: 存放自定义的java类。如：paper类，user类，book类等，每个类的属性设为private，并提供public属性的getter/setter方法让外界访问
service：定义接口，包含系统所提供的功能。（之后还会在service包下再新建impl包）。
dao：定义接口，包含与数据库进行交互的功能。
controller：控制器，负责接收页面请求，转发和处理。
在resource包下新建Directory：“mapper”（用于存放xxxMapper.xml文件）和“spring”（用于存放spring-xxx.xml配置文件），新建文件：“jdbc.properties”（mysql数据库配置文件）,”log4j.properties”（日志输出配置文件）,”mybatis-config.xml”（mybatis框架配置文件）。  

在webapp目录下新建“jsp”包，存放xxx.jsp显示界面。 
补充之后的项目目录如下图所示，至此项目骨架搭建完毕，开始写代码实现增删改查功能。

3. 自定义Paper类
在这之前要对项目的pom.xml文件进行配置，在此文件中配置项目所需要的jar包。

所用的数据库为MySQL 5.7 建表语句如下

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `paper`
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `paper_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'paperID',
  `name` varchar(100) NOT NULL COMMENT 'paper名称',
  `number` int(11) NOT NULL COMMENT 'paper数量',
  `detail` varchar(200) NOT NULL COMMENT 'paper描述',
  PRIMARY KEY (`paper_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='paper表';

-- ----------------------------
-- Records of paper
-- ----------------------------
INSERT INTO `paper` VALUES ('1', '机器学习', '2', 'mlmlmlml');
INSERT INTO `paper` VALUES ('2', '深度学习', '3', 'dldldl');
INSERT INTO `paper` VALUES ('3', '大数据', '4', 'bdbdbd');

4.下面开始写java代码；

5.写配置文件
在resource/mapper包下新建 PaperMapper.xml（mybatis框架mapper代理开发配置文件）

在resource/spring包下分别新建配置文件：spring-dao.xml , spring-mvc.xml , spring-service.xml

在jdbc.properties文件中配置mysql数据库（这里的数据库名、表名，用户名，密码一定要记得修改）。

在log4j.properties文件中配置日志设定

在mybatis-config.xml文件中配置mybtis框架

配置web.xml文件

6.写jsp文件

7.部署
