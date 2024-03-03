## 项目架构

- 此系统架构为 DDD 领域驱动设计的四层架构实现方式，以重视代码实现落地的方式向读者介绍和展示如何开发这样的代码。
- 在 Domain 领域层逐步通过拆解系统流程设计，按照职责边界的领域模块进行设计和开发，最终在应用层进行逻辑功能编排。
- 这个系统中会体现出很多的设计模式思想和最终的实现，只有把 DDD 和设计模式结合起来，才能开发出更加易于扩展和维护的代码结构。

## 环境配置

- **技术栈项**：JDK1.8、Maven3.6.3、Mysql5.7(可升级配置)，SpringBoot、Mybatis、Dubbo 随POM版本。Maven 仓库地址可以配置阿里云的，这样下载速度会更快。
- **初始打包**：你需要在 Lottery 工程的 Maven 根上，点击 Install 这样才能完整打包，否则 Lottery-Test 等，不能正常引入 Jar 包
- **建表语句**：[doc/asserts/sql](https://gitcode.net/KnowledgePlanet/Lottery/-/blob/master/doc/assets/sql/lottery.sql) - `建议随非分支内sql版本走，因为需求不断迭代升级优化，直接使用最新的会遇到在各个分支下的代码运行问题`
- **学习使用**：下载代码库后，切换本地分支到wiki中章节对应的分支，这样代码与章节内容是对应的，否则你在master看到的是全量代码。   
- **下载依赖**：[db-router-spring-boot-starter](https://gitcode.net/KnowledgePlanet/db-router-spring-boot-starter) 本项目依赖自研分库分表组件，需要可以用IDEA像打开一个项目一样打开，之后点击 Maven Install 这样就把 Jar 打包到你本地仓库了，Lottery 就可以引入这个 Jar 了
- **服务部署**：本套工程学习涉及到了较多的环境配置，如：mysql、redis、kafka、zookeeper、xxl-job、ELK等，可以采用新人较便宜的云服务部署[aliyun - 最少需要2核4G](https://www.aliyun.com/minisite/goods?userCode=is4kfbdt)，或者本机直接安装 Docker(`切记再执行一些删除、清空、重置等命令的时候，注意别把自己机器霍霍喽`)。PS：看到也有的读者是自己专门有一个 mac mini 当服务器使用，这样的方式也不错。


