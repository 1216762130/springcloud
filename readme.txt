本章目标：构建多模块的Maven项目+Eureka(服务注册与发现)

## 第一次课1~8
1. 单体应用
   1.1 简介
   在以前的绝大部分项目中大都使用SSH2/SSM等技术框架进行开发，每一个项目都会发布一个单体应用。
   例如开发一个进销存系统，将会开发一个 war 包部署到 Tomcat 中，每一次需要开发新的模块或添加新功能时，
   都会在原来的基础上 不断的添加。若干年后，这个 war 包不断的膨胀，程序员在进行调试时，
   服务器也可能需 要启动半天，维护这个系统的效率极为低下。这样一个 war 包，涵盖了库存、销售、会员、 报表等模块。
   
   1.2 弊端
   这样的单体应用隐患非常多，任何的一个 bug，都有可能导致整个系统宕机。
   例如：某一系统有一客户在高峰期，导出一张销售明细报表（数据量较大），最终造成整个系统瘫痪，
   前台的销售人员无法售卖。维护这样一个系统，不仅效率极低，而且充满风险，我们需要本质上的改变。

   1.3 单体应用结构
   见资料：images/单体应用结构图.png


2. 分布式应用
   随着互联网 应用的普及，在大数据、高并发的环境下，
   我们的系统架构需要面对更为严苛的挑战，
   我们需要一套新的架构，它起码能满足以下要求：

   高性能：这是应用程序的基本要求。
   独立性：其中一个模块出现 bug 或者其他问题，
   不可以影响其他模块或者整个应用。
   容易扩展：应用中的每一个节点，都可以根据实际需要进行扩展。
   便于管理：对于各个模块的资源，可以轻松进行管理、升级，减少维护成本。
   状态监控与警报：对整个应用程序进行监控，当某一个节点出现问题时，
   能及时发出警报。

   为了能解决遇到的问题、达到以上的架构要求，Spring Cloud应运而生

3. Spring Cloud是什么
   dubbo （阿里巴巴）
 
   Spring Cloud是一系列框架的有序集合。它利用Spring Boot的开发便利性巧妙地简化了分布式系统基础设施的开发，
   如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用Spring Boot的开发风格做到一键启动和部署。
   Spring Cloud并没有重复制造轮子，它只是将目前各家公司开发的比较成熟、经得起实际考验的服务框架组合起来，
   通过Spring Boot风格进行再封装屏蔽掉了复杂的配置和实现原理，最终给开发者留出了一套简单易懂、易部署和易维护的分布式系统开发工具包

   Spring Cloud共集成了19个子项目，里面都包含一个或者多个第三方的组件或者框架！
   以下为Spring Cloud的核心功能：
   服务注册与发现： Spring Cloud Eureka
   负载均衡：       Spring Cloud Ribbon    （nginx）
   断路器：         Spring Cloud Hystrix
   声明式服务调用： Spring Cloud Feign
   路由：           Spring Cloud Zuul
   分布式配置中心： Spring Cloud Config

   可参考：images/springcloud核心架构


4. Spring Cloud 与 Netflix
   Netflix 是一个互联网影片提供商，在几年前，Netflix 公司成立了自己的开源中心，
   名 称为 Netflix Open Source Software Center，简称 Netflix OSS。这个开源组织专注于大数据、
   云计算方面的技术，提供了多个开源框架，这些框架包括大数据工具、构建工具、
   基于 云平台的服务工具等。Netflix 所提供的这些框架，很好的遵循微服务所推崇的理念，
   实现了去中心化的服务管理、服务容错等机制。

   Spring Cloud 的各个项目基于 Spring Boot，将 Netflix 的多个框架进行封装，并且通过自动配置的方式将这些框架绑定到 Spring 的环境中，
   从而简化了这些框架的使用。由于 Spring Boot 的简便，使得我们在使用 Spring Cloud 时，很容易的将 Netflix 各个框架整合进我们的项目中。
   
   Spring Cloud 下的“Spring Cloud Netflix”模块，主要封装了 Netflix 的以下项目：
   Eureka(服务注册与发现)：基于 REST 服务的分布式中间件，主要用于服务管理。    
   Ribbon(负载均衡)：负载均衡框架，在微服务集群中为各个客户端的通信提供支持，它主要实现中间层应用程序的负载均衡
   Zuul(智能路由)：为微服务集群提供过代理、过滤、路由等功能。
   Hystrix(断路器)：容错框架，通过添加延迟阀值以及容错的逻辑，来帮助我们控制分布式系 统间组件的交互。
   Feign(声明式服务调用)：Feign是一个声明式WebService客户端，目的是为了简化 Web Service 客户端的开发

   除了 Spring Cloud Netflix 模块外，Spring Cloud 还包括以下几个重要的模块
   Spring Cloud Config：配置中心，为分布式系统提供了配置服务器和配置客户端，通过对它们 的配置，可以很好的管理集群中的配置文件。
   Spring Cloud Sleuth：服务跟踪框架，可以与 Zipkin、Apache HTrace 和 ELK 等 数据分析、服务跟踪系统进行整合，为服务跟踪、解决问题提供了便利。
   Spring Cloud Stream：用于构建消息驱动微服务的框架，该框架在 Spring Boot 的 基础上，整合了“Spring Integration”来连接消息代理中间件。
   Spring Cloud Bus：连接 RabbitMQ、Kafka 等消息代理的集群消息总线。


5. springcloud的版本说明
   springcloud项目是由多个独立项目集合而成的，每个项目都是独立的，各自进行自己的迭代和版本发布。
   所以springcloud不方便使用版本号来管理，而是使用版本名。以避免和子项目版本号的冲突。
   
   版本名的来源是伦敦的地铁站名，以字母排序。比如最早的Release版本为Angel，第二个Release版本为Brixton。。。

   当一个版本的update积累的比较多或者解决了一个严重bug时，会发布一个ServiceRelease版本，简称SR，
   后面带的数字就是该大版本下的第一次发布。

   见资料“springcloud的版本.jpg”

6. 构建多模块的Maven项目
   由于SpringCloud中有许多组件，每个组件都需要单独进行开发和维护，为了便于统一的版本维护和管理，我们经常会用到Maven的多模块模式。
   其结构见：images/多模块的Maven项目.png。

   springcloud01         主模块  quickstart项目 
     eureka-server       子模块  springboot项目
     eureka-provider     子模块  springboot项目
     eureka-consumer01   子模块  springboot项目
     eureka-consumer02   子模块  springboot项目
  
   1. 创建主模块：springcloud01
      File–>New–>Project
      -->Maven-->Create from archetype-->maven-archetype-quickstart-->Next
      -->GroupId={你的GroupId}-->AritifactId={你的ArtifactId}
      -->Next-->Next-->Finish-->New Whindow 

      注1：maven-archetype-quickstart创建的是普通java工程
      注2：由于并不需要在主工程进行任何代码开发，所以删除其src目录


   2. 创建子模块：eureka-server
      File-->New-->Module
      -->Spring Initializr-->Next


   3. 按顺序创建eureka-provider/eureka-consumer01/eureka-consumer02这3个子模块，步骤同eureka-server

   ## 至此，基于Maven的多模块项目创建完毕，但具体配置还未开始
   ## 以下几个步骤主要是添加开发依赖，以及编辑父子模块之间的关系，后面再讲

   4. 使用“https://start.spring.io/”生成工程所需pom文件
      1. 选择版本和类型
         选择你的项目是 maven 还是 grade
         开发语言有：Java、Kotlin、Groovy
         选择 Spring Boot 的版本
         填写 maven 的 Group 、Artifact
      2. 搜索并添加依赖 eureka，选择eureka-server（注册中心）
      3. 下载项目
         把依赖项都选择完毕后，点击按钮（Generate Project）就能生成工程对应的压缩包，此压缩包会在正面的几个步骤使用
  
   5. 编辑主工程pom.xml
      代码重点：
      1.父级springboot配置pom.xml文件(压缩包中提供)
      2.配置子模块“eureka-server”，以后有新的子模块被创建后，也需要添加到这里。
        <modules>
			<module>eureka-server</module>
			<module>eureka-provider</module>
			<module>eureka-consumer01</module>
			<module>eureka-consumer02</module>
    	</modules>  
      3.设置版本信息及字符编码
        <properties>
          <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding><!--常规配置-->
          <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
          <java.version>1.8</java.version><!--压缩包中提供-->
          <spring-cloud.version>Greenwich.SR2</spring-cloud.version><!--压缩包中提供-->
        </properties> 
      4.配置SpringCloud基础组件(压缩包中提供)，另外，会在之后开发中不断添加新组件
      5.Spring Cloud 版本序列配置(压缩包中提供)
      6.springboot的maven-plugin配置(压缩包中提供)

   6. 编辑子模块eureka-server的pom.xml
      代码重点：
      1.继承父pom.xml
        <parent>
			<groupId>com.zking</groupId>
			<artifactId>springcloud01</artifactId>
			<version>1.0-SNAPSHOT</version>
		</parent>
      2.子模块是可以打包jar运行的：<packaging>jar</packaging>，修改后如下 
		<packaging>jar</packaging>
		
      3.eureka的pom.xml没有引入任何新的依赖，那如何引入eureka组件依赖呢，回到上面的主pom.xml，
        你会发现我在其中引入了spring-cloud-starter-netflix-eureka-server，这是因为在之后的大部分模块中，
        我们都会用到Eureka-server，所以将其放在主pom中供其他子模块共享使用
		
		最终子模块中的内容：
		<parent>
			<groupId>com.zking</groupId>
			<artifactId>springcloud0501</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</parent>
		<artifactId>eureka-server</artifactId>
		<version>0.0.1-SNAPSHOT</version>
		<name>eureka-server-cluster</name>
		<packaging>jar</packaging>
		<description>子模块：注册中心</description>


7. Eureka简介
   以下是非常专业的介绍 ^_^

   Eureka是Netflix开发的服务发现框架，本身是一个基于REST的服务，主要用于定位运行在AWS域中的中间层服务，
   以达到负载均衡和中间层服务故障转移的目的。SpringCloud将它集成在其子项目spring-cloud-netflix中，
   以实现SpringCloud的服务发现功能。

   Eureka包含两种类别组件：Eureka Server和Eureka Client。
   Eureka Server提供服务注册服务，各个节点启动后，会在Eureka Server中进行注册，这样EurekaServer中的服务注册表中将会存储所有可用服务节点的信息，服务节点的信息可以在界面中直观的看到。 
   Eureka Client是一个java客户端，用于简化与Eureka Server的交互，客户端同时也就是一个内置的、使用轮询(round-robin)负载算法的负载均衡器。

   Eureka管理各种服务功能包括服务的注册、发现、熔断、负载、降级等，其基本架构见资料：images/Eureka基本架构.png


     （注册中心的服务端eureak-server）         商店
	 
	 （注册中心的客服端） 消费者（eureka-consumer）        生产者(eureka-provider)
	 
	  消费者和生产者相对商店来说都是客户端，一个是消费服务，一个是提供服务
	  比如：我之前举例的：驾驶证模块（客户端：消费者）需要调用账号系统模块（客户端：生产者）的实名认证功能
	  



   通过查看图片“Eureka基本架构.png”，我们可以知道Eureka的基本架构，它由3个角色组成：
   1.Eureka Server
     提供服务注册和发现
   2.Service Provider
     服务提供者(也叫生产者)
     将自身服务注册到Eureka，从而使服务消费者能够找到
   3.Service Consumer
     服务消费者
     从Eureka获取注册服务列表，从而能够消费服务

   以下是非常LOW的介绍 ^_^
   注1：如何理解服务提供者-服务中心-服务消费者三者之间的关系呢？
        房东<-->房产中介<-->租客

   注2：房东也好、租客也好都是中介的客户
        房产中介(server)/房东(client)/租客(client)

        服务中心(server)/生产者(client)/消费者(client)/

        Eureka Server    房产中介  server
        Eureka Provider  房东      client
        Eureka Consumer  租客      client

   
   小结：微服务组成
   Eureka             服务管理框架
     Eureka Server    注册中心      保存了生产者和消费者之间的契约关系    71XX
     Eureka Client    生产者        提供服务                              72XX
                      消费者        消费服务                              73XX
   
   最新消息：Eureka 2.x的开源分支已关闭，如果要使用，请自己承担风险。1.x版本仍然继续维护。
             Spring Cloud是采用1.x版本，也就是发布版，稳定的版本。
             Spring Cloud支持使用Eureka、Zookeeper、Consul实现服务发现的能力。 
             Consul介绍 
             Consul 是 HashiCorp 公司推出的开源工具，用于实现分布式系统的服务发现与配置。

8.配置主模块和子模块的父子关系

	1.主模块的pom.xml中添加新的子模块eureka-provider
		<!--配置子模块-->
		<modules>
			<module>eureka-server</module>
			<module>eureka-provider</module>
			<module>eureka-consumer01</module>
			<module>eureka-consumer02</module>
		</modules>
     
   2.子模块的pom.xml中添加与主模块的父子关系 
	   <!--配置继承关系-->
		<parent>
			<groupId>com.zking</groupId>
			<artifactId>springcloud01</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</parent>
		<artifactId>eureka-server</artifactId>
		<version>0.0.1-SNAPSHOT</version>
		<name>eureka-server</name>
		<packaging>jar</packaging>
		<description>子模块注册中心</description>



                       
9. 注册中心

   开发步骤：
   1. 修改子模块eureka-server的application.yml  
      见资料“eureka-server.yml”    
   2. 在启动类EurekaServerApplication.java上添加@EnableEurekaServer注解，点击运行即可
   3. 查看注册中心
      打开浏览器，输入：http://localhost:7101
      即可看到一个页面，其中还没有发现任何服务，这只是一个孤零零的eureka-server。

   注1：本章介绍的是单注册中心Eureka，其实也可以配置高可用的多注册中心(后面章节介绍)


9 小结
   多模块Maven项目
   Eureka(服务注册与发现)
   
   
作业:在idea里面显示仪表板
  



 
  


附录一：英文单词
Netflix

Eureka
Hystrix
Zuul

Archaius

dashboard：仪表板
Consumer:消费者
provider：生产者

附录二：搭建 Spring Cloud 微服务系统需要哪些技术
XML解析：JABX
JSON序列化:Jackson
缓存：Redis
定时器：Quartz Scheduler
Java模版技术Thymeleaf
前端样式：Bootstrap
API网关：Zuul
服务注册与发现：Eureka Server、Eureka Client
服务交互：RestTemplate、Apache HttpClient
服务消费：Ribbon、OpenFeign
负载均衡：Ribbon
配置中心：Config Server、Config Client
服务熔断：Hystrix
项目构建：Gradle

附录三：什么是微服务
微服务一词来源 Martin Fowler 的“Microservices”一文，微服务是一种架构风格，将 单体应用划分为小型的服务单元，
微服务之间使用 HTTP 的 API 进行资源访问与操作


附录四：2. Spring Cloud体系介绍：
Spring Cloud共集成了19个子项目，里面都包含一个或者多个第三方的组件或者框架！
1、Spring Cloud Config 配置中心，利用git集中管理程序的配置。 
2、Spring Cloud Netflix 集成众多Netflix的开源软件
3、Spring Cloud Bus 消息总线，利用分布式消息将服务和服务实例连接在一起，用于在一个集群中传播状态的变化 
4、Spring Cloud for Cloud Foundry 利用Pivotal Cloudfoundry集成你的应用程序
5、Spring Cloud Cloud Foundry Service Broker 为建立管理云托管服务的服务代理提供了一个起点。
6、Spring Cloud Cluster 基于Zookeeper, Redis, Hazelcast, Consul实现的领导选举和平民状态模式的抽象和实现。
7、Spring Cloud Consul 基于Hashicorp Consul实现的服务发现和配置管理。
8、Spring Cloud Security 在Zuul代理中为OAuth2 rest客户端和认证头转发提供负载均衡
9、Spring Cloud Sleuth SpringCloud应用的分布式追踪系统，和Zipkin，HTrace，ELK兼容。
10、Spring Cloud Data Flow 一个云本地程序和操作模型，组成数据微服务在一个结构化的平台上。
11、Spring Cloud Stream 基于Redis,Rabbit,Kafka实现的消息微服务，简单声明模型用以在Spring Cloud应用中收发消息。
12、Spring Cloud Stream App Starters 基于Spring Boot为外部系统提供spring的集成
13、Spring Cloud Task 短生命周期的微服务，为SpringBooot应用简单声明添加功能和非功能特性。
14、Spring Cloud Task App Starters
15、Spring Cloud Zookeeper 服务发现和配置管理基于Apache Zookeeper。
16、Spring Cloud for Amazon Web Services 快速和亚马逊网络服务集成。
17、Spring Cloud Connectors 便于PaaS应用在各种平台上连接到后端像数据库和消息经纪服务。
18、Spring Cloud Starters （项目已经终止并且在Angel.SR2后的版本和其他项目合并）
19、Spring Cloud CLI 插件用Groovy快速的创建Spring Cloud组件应用。


附录五 Rest方式调用/Fegin方式调用



附录六：RestTemplate
1.RestTemplate是什么？
RestTemplate是Spring对Http客户端进行封装的一个模板工具类，对常用的Http客户端例如：HttpClient、OKHttp、JDK原生的URLConnection(默认的)都支持。

2.RestTemplate能做什么？
基于Restful风格可以对远程服务基于http协议进行远程调用

3.RestTemplate的一些问题
虽然RestTemplate能够调用远程服务，但是这样还存在着很多问题：
1、请求地址http://127.0.0.1:8081/findById硬编码了，如果更换环境，那么需要更改大量的代码
2、并没有一个中心来控制并管理provider和consumer之间的关系与调用
3、使用RestTemplate调用远程服务代码开发量相对而言大，现在的Demo是业务简单，只需要简单调用getForObject就能获取数据。事实上，RestTemplate还有大量基于Http协议的方法，比如delete()、getForEntity()、getForObject()、put()、headForHeaders()等。但是在后期的SpringCloud学习过程中，Feign作为SpringCloud的核心组件，用于远程服务调用，也是基于Http协议，并且支持注解开发，能够大量减少开发量



附录七：如果注册中心出现以下红色的文字，则说明Eureka已经进入了保护模式
EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. 
RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.

保护模式主要用于一组客户端和Eureka Server之间存在网络分区场景下的保护。一旦进入保护模式，
Eureka Server将会尝试保护其服务注册表中的信息，不再删除服务注册表中的数据（也就是不会注销任何微服务）。