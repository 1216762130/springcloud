����Ŀ�꣺������ģ���Maven��Ŀ+Eureka(����ע���뷢��)

## ��һ�ο�1~8
1. ����Ӧ��
   1.1 ���
   ����ǰ�ľ��󲿷���Ŀ�д�ʹ��SSH2/SSM�ȼ�����ܽ��п�����ÿһ����Ŀ���ᷢ��һ������Ӧ�á�
   ���翪��һ��������ϵͳ�����Ὺ��һ�� war ������ Tomcat �У�ÿһ����Ҫ�����µ�ģ�������¹���ʱ��
   ������ԭ���Ļ����� ���ϵ���ӡ����������� war �����ϵ����ͣ�����Ա�ڽ��е���ʱ��
   ������Ҳ������ Ҫ�������죬ά�����ϵͳ��Ч�ʼ�Ϊ���¡�����һ�� war ���������˿�桢���ۡ���Ա�� �����ģ�顣
   
   1.2 �׶�
   �����ĵ���Ӧ�������ǳ��࣬�κε�һ�� bug�����п��ܵ�������ϵͳ崻���
   ���磺ĳһϵͳ��һ�ͻ��ڸ߷��ڣ�����һ��������ϸ�����������ϴ󣩣������������ϵͳ̱����
   ǰ̨��������Ա�޷�������ά������һ��ϵͳ������Ч�ʼ��ͣ����ҳ������գ�������Ҫ�����ϵĸı䡣

   1.3 ����Ӧ�ýṹ
   �����ϣ�images/����Ӧ�ýṹͼ.png


2. �ֲ�ʽӦ��
   ���Ż����� Ӧ�õ��ռ����ڴ����ݡ��߲����Ļ����£�
   ���ǵ�ϵͳ�ܹ���Ҫ��Ը�Ϊ�Ͽ�����ս��
   ������Ҫһ���µļܹ�������������������Ҫ��

   �����ܣ�����Ӧ�ó���Ļ���Ҫ��
   �����ԣ�����һ��ģ����� bug �����������⣬
   ������Ӱ������ģ���������Ӧ�á�
   ������չ��Ӧ���е�ÿһ���ڵ㣬�����Ը���ʵ����Ҫ������չ��
   ���ڹ������ڸ���ģ�����Դ���������ɽ��й�������������ά���ɱ���
   ״̬����뾯����������Ӧ�ó�����м�أ���ĳһ���ڵ��������ʱ��
   �ܼ�ʱ����������

   Ϊ���ܽ�����������⡢�ﵽ���ϵļܹ�Ҫ��Spring CloudӦ�˶���

3. Spring Cloud��ʲô
   dubbo ������Ͱͣ�
 
   Spring Cloud��һϵ�п�ܵ����򼯺ϡ�������Spring Boot�Ŀ�������������ؼ��˷ֲ�ʽϵͳ������ʩ�Ŀ�����
   �������ע�ᡢ�������ġ���Ϣ���ߡ����ؾ��⡢��·�������ݼ�صȣ���������Spring Boot�Ŀ����������һ�������Ͳ���
   Spring Cloud��û���ظ��������ӣ���ֻ�ǽ�Ŀǰ���ҹ�˾�����ıȽϳ��졢������ʵ�ʿ���ķ��������������
   ͨ��Spring Boot�������ٷ�װ���ε��˸��ӵ����ú�ʵ��ԭ�����ո�������������һ�׼��׶����ײ������ά���ķֲ�ʽϵͳ�������߰�

   Spring Cloud��������19������Ŀ�����涼����һ�����߶����������������߿�ܣ�
   ����ΪSpring Cloud�ĺ��Ĺ��ܣ�
   ����ע���뷢�֣� Spring Cloud Eureka
   ���ؾ��⣺       Spring Cloud Ribbon    ��nginx��
   ��·����         Spring Cloud Hystrix
   ����ʽ������ã� Spring Cloud Feign
   ·�ɣ�           Spring Cloud Zuul
   �ֲ�ʽ�������ģ� Spring Cloud Config

   �ɲο���images/springcloud���ļܹ�


4. Spring Cloud �� Netflix
   Netflix ��һ��������ӰƬ�ṩ�̣��ڼ���ǰ��Netflix ��˾�������Լ��Ŀ�Դ���ģ�
   �� ��Ϊ Netflix Open Source Software Center����� Netflix OSS�������Դ��֯רע�ڴ����ݡ�
   �Ƽ��㷽��ļ������ṩ�˶����Դ��ܣ���Щ��ܰ��������ݹ��ߡ��������ߡ�
   ���� ��ƽ̨�ķ��񹤾ߵȡ�Netflix ���ṩ����Щ��ܣ��ܺõ���ѭ΢�������Ƴ�����
   ʵ����ȥ���Ļ��ķ�����������ݴ�Ȼ��ơ�

   Spring Cloud �ĸ�����Ŀ���� Spring Boot���� Netflix �Ķ����ܽ��з�װ������ͨ���Զ����õķ�ʽ����Щ��ܰ󶨵� Spring �Ļ����У�
   �Ӷ�������Щ��ܵ�ʹ�á����� Spring Boot �ļ�㣬ʹ��������ʹ�� Spring Cloud ʱ�������׵Ľ� Netflix ����������Ͻ����ǵ���Ŀ�С�
   
   Spring Cloud �µġ�Spring Cloud Netflix��ģ�飬��Ҫ��װ�� Netflix ��������Ŀ��
   Eureka(����ע���뷢��)������ REST ����ķֲ�ʽ�м������Ҫ���ڷ������    
   Ribbon(���ؾ���)�����ؾ����ܣ���΢����Ⱥ��Ϊ�����ͻ��˵�ͨ���ṩ֧�֣�����Ҫʵ���м��Ӧ�ó���ĸ��ؾ���
   Zuul(����·��)��Ϊ΢����Ⱥ�ṩ���������ˡ�·�ɵȹ��ܡ�
   Hystrix(��·��)���ݴ��ܣ�ͨ������ӳٷ�ֵ�Լ��ݴ���߼������������ǿ��Ʒֲ�ʽϵ ͳ������Ľ�����
   Feign(����ʽ�������)��Feign��һ������ʽWebService�ͻ��ˣ�Ŀ����Ϊ�˼� Web Service �ͻ��˵Ŀ���

   ���� Spring Cloud Netflix ģ���⣬Spring Cloud ���������¼�����Ҫ��ģ��
   Spring Cloud Config���������ģ�Ϊ�ֲ�ʽϵͳ�ṩ�����÷����������ÿͻ��ˣ�ͨ�������� �����ã����ԺܺõĹ���Ⱥ�е������ļ���
   Spring Cloud Sleuth��������ٿ�ܣ������� Zipkin��Apache HTrace �� ELK �� ���ݷ������������ϵͳ�������ϣ�Ϊ������١���������ṩ�˱�����
   Spring Cloud Stream�����ڹ�����Ϣ����΢����Ŀ�ܣ��ÿ���� Spring Boot �� �����ϣ������ˡ�Spring Integration����������Ϣ�����м����
   Spring Cloud Bus������ RabbitMQ��Kafka ����Ϣ����ļ�Ⱥ��Ϣ���ߡ�


5. springcloud�İ汾˵��
   springcloud��Ŀ���ɶ��������Ŀ���϶��ɵģ�ÿ����Ŀ���Ƕ����ģ����Խ����Լ��ĵ����Ͱ汾������
   ����springcloud������ʹ�ð汾������������ʹ�ð汾�����Ա��������Ŀ�汾�ŵĳ�ͻ��
   
   �汾������Դ���׶صĵ���վ��������ĸ���򡣱��������Release�汾ΪAngel���ڶ���Release�汾ΪBrixton������

   ��һ���汾��update���۵ıȽ϶���߽����һ������bugʱ���ᷢ��һ��ServiceRelease�汾�����SR��
   ����������־��Ǹô�汾�µĵ�һ�η�����

   �����ϡ�springcloud�İ汾.jpg��

6. ������ģ���Maven��Ŀ
   ����SpringCloud������������ÿ���������Ҫ�������п�����ά����Ϊ�˱���ͳһ�İ汾ά���͹������Ǿ������õ�Maven�Ķ�ģ��ģʽ��
   ��ṹ����images/��ģ���Maven��Ŀ.png��

   springcloud01         ��ģ��  quickstart��Ŀ 
     eureka-server       ��ģ��  springboot��Ŀ
     eureka-provider     ��ģ��  springboot��Ŀ
     eureka-consumer01   ��ģ��  springboot��Ŀ
     eureka-consumer02   ��ģ��  springboot��Ŀ
  
   1. ������ģ�飺springcloud01
      File�C>New�C>Project
      -->Maven-->Create from archetype-->maven-archetype-quickstart-->Next
      -->GroupId={���GroupId}-->AritifactId={���ArtifactId}
      -->Next-->Next-->Finish-->New Whindow 

      ע1��maven-archetype-quickstart����������ͨjava����
      ע2�����ڲ�����Ҫ�������̽����κδ��뿪��������ɾ����srcĿ¼


   2. ������ģ�飺eureka-server
      File-->New-->Module
      -->Spring Initializr-->Next


   3. ��˳�򴴽�eureka-provider/eureka-consumer01/eureka-consumer02��3����ģ�飬����ͬeureka-server

   ## ���ˣ�����Maven�Ķ�ģ����Ŀ������ϣ����������û�δ��ʼ
   ## ���¼���������Ҫ����ӿ����������Լ��༭����ģ��֮��Ĺ�ϵ�������ٽ�

   4. ʹ�á�https://start.spring.io/�����ɹ�������pom�ļ�
      1. ѡ��汾������
         ѡ�������Ŀ�� maven ���� grade
         ���������У�Java��Kotlin��Groovy
         ѡ�� Spring Boot �İ汾
         ��д maven �� Group ��Artifact
      2. ������������� eureka��ѡ��eureka-server��ע�����ģ�
      3. ������Ŀ
         �������ѡ����Ϻ󣬵����ť��Generate Project���������ɹ��̶�Ӧ��ѹ��������ѹ������������ļ�������ʹ��
  
   5. �༭������pom.xml
      �����ص㣺
      1.����springboot����pom.xml�ļ�(ѹ�������ṩ)
      2.������ģ�顰eureka-server�����Ժ����µ���ģ�鱻������Ҳ��Ҫ��ӵ����
        <modules>
			<module>eureka-server</module>
			<module>eureka-provider</module>
			<module>eureka-consumer01</module>
			<module>eureka-consumer02</module>
    	</modules>  
      3.���ð汾��Ϣ���ַ�����
        <properties>
          <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding><!--��������-->
          <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
          <java.version>1.8</java.version><!--ѹ�������ṩ-->
          <spring-cloud.version>Greenwich.SR2</spring-cloud.version><!--ѹ�������ṩ-->
        </properties> 
      4.����SpringCloud�������(ѹ�������ṩ)�����⣬����֮�󿪷��в�����������
      5.Spring Cloud �汾��������(ѹ�������ṩ)
      6.springboot��maven-plugin����(ѹ�������ṩ)

   6. �༭��ģ��eureka-server��pom.xml
      �����ص㣺
      1.�̳и�pom.xml
        <parent>
			<groupId>com.zking</groupId>
			<artifactId>springcloud01</artifactId>
			<version>1.0-SNAPSHOT</version>
		</parent>
      2.��ģ���ǿ��Դ��jar���еģ�<packaging>jar</packaging>���޸ĺ����� 
		<packaging>jar</packaging>
		
      3.eureka��pom.xmlû�������κ��µ����������������eureka��������أ��ص��������pom.xml��
        ��ᷢ����������������spring-cloud-starter-netflix-eureka-server��������Ϊ��֮��Ĵ󲿷�ģ���У�
        ���Ƕ����õ�Eureka-server�����Խ��������pom�й�������ģ�鹲��ʹ��
		
		������ģ���е����ݣ�
		<parent>
			<groupId>com.zking</groupId>
			<artifactId>springcloud0501</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</parent>
		<artifactId>eureka-server</artifactId>
		<version>0.0.1-SNAPSHOT</version>
		<name>eureka-server-cluster</name>
		<packaging>jar</packaging>
		<description>��ģ�飺ע������</description>


7. Eureka���
   �����Ƿǳ�רҵ�Ľ��� ^_^

   Eureka��Netflix�����ķ����ֿ�ܣ�������һ������REST�ķ�����Ҫ���ڶ�λ������AWS���е��м�����
   �Դﵽ���ؾ�����м��������ת�Ƶ�Ŀ�ġ�SpringCloud����������������Ŀspring-cloud-netflix�У�
   ��ʵ��SpringCloud�ķ����ֹ��ܡ�

   Eureka����������������Eureka Server��Eureka Client��
   Eureka Server�ṩ����ע����񣬸����ڵ������󣬻���Eureka Server�н���ע�ᣬ����EurekaServer�еķ���ע����н���洢���п��÷���ڵ����Ϣ������ڵ����Ϣ�����ڽ�����ֱ�۵Ŀ����� 
   Eureka Client��һ��java�ͻ��ˣ����ڼ���Eureka Server�Ľ������ͻ���ͬʱҲ����һ�����õġ�ʹ����ѯ(round-robin)�����㷨�ĸ��ؾ�������

   Eureka������ַ����ܰ��������ע�ᡢ���֡��۶ϡ����ء������ȣ�������ܹ������ϣ�images/Eureka�����ܹ�.png


     ��ע�����ĵķ����eureak-server��         �̵�
	 
	 ��ע�����ĵĿͷ��ˣ� �����ߣ�eureka-consumer��        ������(eureka-provider)
	 
	  �����ߺ�����������̵���˵���ǿͻ��ˣ�һ�������ѷ���һ�����ṩ����
	  ���磺��֮ǰ�����ģ���ʻ֤ģ�飨�ͻ��ˣ������ߣ���Ҫ�����˺�ϵͳģ�飨�ͻ��ˣ������ߣ���ʵ����֤����
	  



   ͨ���鿴ͼƬ��Eureka�����ܹ�.png�������ǿ���֪��Eureka�Ļ����ܹ�������3����ɫ��ɣ�
   1.Eureka Server
     �ṩ����ע��ͷ���
   2.Service Provider
     �����ṩ��(Ҳ��������)
     ���������ע�ᵽEureka���Ӷ�ʹ�����������ܹ��ҵ�
   3.Service Consumer
     ����������
     ��Eureka��ȡע������б��Ӷ��ܹ����ѷ���

   �����Ƿǳ�LOW�Ľ��� ^_^
   ע1������������ṩ��-��������-��������������֮��Ĺ�ϵ�أ�
        ����<-->�����н�<-->���

   ע2������Ҳ�á����Ҳ�ö����н�Ŀͻ�
        �����н�(server)/����(client)/���(client)

        ��������(server)/������(client)/������(client)/

        Eureka Server    �����н�  server
        Eureka Provider  ����      client
        Eureka Consumer  ���      client

   
   С�᣺΢�������
   Eureka             ���������
     Eureka Server    ע������      �����������ߺ�������֮�����Լ��ϵ    71XX
     Eureka Client    ������        �ṩ����                              72XX
                      ������        ���ѷ���                              73XX
   
   ������Ϣ��Eureka 2.x�Ŀ�Դ��֧�ѹرգ����Ҫʹ�ã����Լ��е����ա�1.x�汾��Ȼ����ά����
             Spring Cloud�ǲ���1.x�汾��Ҳ���Ƿ����棬�ȶ��İ汾��
             Spring Cloud֧��ʹ��Eureka��Zookeeper��Consulʵ�ַ����ֵ������� 
             Consul���� 
             Consul �� HashiCorp ��˾�Ƴ��Ŀ�Դ���ߣ�����ʵ�ֲַ�ʽϵͳ�ķ����������á�

8.������ģ�����ģ��ĸ��ӹ�ϵ

	1.��ģ���pom.xml������µ���ģ��eureka-provider
		<!--������ģ��-->
		<modules>
			<module>eureka-server</module>
			<module>eureka-provider</module>
			<module>eureka-consumer01</module>
			<module>eureka-consumer02</module>
		</modules>
     
   2.��ģ���pom.xml���������ģ��ĸ��ӹ�ϵ 
	   <!--���ü̳й�ϵ-->
		<parent>
			<groupId>com.zking</groupId>
			<artifactId>springcloud01</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</parent>
		<artifactId>eureka-server</artifactId>
		<version>0.0.1-SNAPSHOT</version>
		<name>eureka-server</name>
		<packaging>jar</packaging>
		<description>��ģ��ע������</description>



                       
9. ע������

   �������裺
   1. �޸���ģ��eureka-server��application.yml  
      �����ϡ�eureka-server.yml��    
   2. ��������EurekaServerApplication.java�����@EnableEurekaServerע�⣬������м���
   3. �鿴ע������
      ������������룺http://localhost:7101
      ���ɿ���һ��ҳ�棬���л�û�з����κη�����ֻ��һ���������eureka-server��

   ע1�����½��ܵ��ǵ�ע������Eureka����ʵҲ�������ø߿��õĶ�ע������(�����½ڽ���)


9 С��
   ��ģ��Maven��Ŀ
   Eureka(����ע���뷢��)
   
   
��ҵ:��idea������ʾ�Ǳ��
  



 
  


��¼һ��Ӣ�ĵ���
Netflix

Eureka
Hystrix
Zuul

Archaius

dashboard���Ǳ��
Consumer:������
provider��������

��¼����� Spring Cloud ΢����ϵͳ��Ҫ��Щ����
XML������JABX
JSON���л�:Jackson
���棺Redis
��ʱ����Quartz Scheduler
Javaģ�漼��Thymeleaf
ǰ����ʽ��Bootstrap
API���أ�Zuul
����ע���뷢�֣�Eureka Server��Eureka Client
���񽻻���RestTemplate��Apache HttpClient
�������ѣ�Ribbon��OpenFeign
���ؾ��⣺Ribbon
�������ģ�Config Server��Config Client
�����۶ϣ�Hystrix
��Ŀ������Gradle

��¼����ʲô��΢����
΢����һ����Դ Martin Fowler �ġ�Microservices��һ�ģ�΢������һ�ּܹ���񣬽� ����Ӧ�û���ΪС�͵ķ���Ԫ��
΢����֮��ʹ�� HTTP �� API ������Դ���������


��¼�ģ�2. Spring Cloud��ϵ���ܣ�
Spring Cloud��������19������Ŀ�����涼����һ�����߶����������������߿�ܣ�
1��Spring Cloud Config �������ģ�����git���й����������á� 
2��Spring Cloud Netflix �����ڶ�Netflix�Ŀ�Դ���
3��Spring Cloud Bus ��Ϣ���ߣ����÷ֲ�ʽ��Ϣ������ͷ���ʵ��������һ��������һ����Ⱥ�д���״̬�ı仯 
4��Spring Cloud for Cloud Foundry ����Pivotal Cloudfoundry�������Ӧ�ó���
5��Spring Cloud Cloud Foundry Service Broker Ϊ�����������йܷ���ķ�������ṩ��һ����㡣
6��Spring Cloud Cluster ����Zookeeper, Redis, Hazelcast, Consulʵ�ֵ��쵼ѡ�ٺ�ƽ��״̬ģʽ�ĳ����ʵ�֡�
7��Spring Cloud Consul ����Hashicorp Consulʵ�ֵķ����ֺ����ù���
8��Spring Cloud Security ��Zuul������ΪOAuth2 rest�ͻ��˺���֤ͷת���ṩ���ؾ���
9��Spring Cloud Sleuth SpringCloudӦ�õķֲ�ʽ׷��ϵͳ����Zipkin��HTrace��ELK���ݡ�
10��Spring Cloud Data Flow һ���Ʊ��س���Ͳ���ģ�ͣ��������΢������һ���ṹ����ƽ̨�ϡ�
11��Spring Cloud Stream ����Redis,Rabbit,Kafkaʵ�ֵ���Ϣ΢���񣬼�����ģ��������Spring CloudӦ�����շ���Ϣ��
12��Spring Cloud Stream App Starters ����Spring BootΪ�ⲿϵͳ�ṩspring�ļ���
13��Spring Cloud Task ���������ڵ�΢����ΪSpringBoootӦ�ü�������ӹ��ܺͷǹ������ԡ�
14��Spring Cloud Task App Starters
15��Spring Cloud Zookeeper �����ֺ����ù������Apache Zookeeper��
16��Spring Cloud for Amazon Web Services ���ٺ�����ѷ������񼯳ɡ�
17��Spring Cloud Connectors ����PaaSӦ���ڸ���ƽ̨�����ӵ���������ݿ����Ϣ���ͷ���
18��Spring Cloud Starters ����Ŀ�Ѿ���ֹ������Angel.SR2��İ汾��������Ŀ�ϲ���
19��Spring Cloud CLI �����Groovy���ٵĴ���Spring Cloud���Ӧ�á�


��¼�� Rest��ʽ����/Fegin��ʽ����



��¼����RestTemplate
1.RestTemplate��ʲô��
RestTemplate��Spring��Http�ͻ��˽��з�װ��һ��ģ�幤���࣬�Գ��õ�Http�ͻ������磺HttpClient��OKHttp��JDKԭ����URLConnection(Ĭ�ϵ�)��֧�֡�

2.RestTemplate����ʲô��
����Restful�����Զ�Զ�̷������httpЭ�����Զ�̵���

3.RestTemplate��һЩ����
��ȻRestTemplate�ܹ�����Զ�̷��񣬵��������������źܶ����⣺
1�������ַhttp://127.0.0.1:8081/findByIdӲ�����ˣ����������������ô��Ҫ���Ĵ����Ĵ���
2����û��һ�����������Ʋ�����provider��consumer֮��Ĺ�ϵ�����
3��ʹ��RestTemplate����Զ�̷�����뿪������Զ��Դ����ڵ�Demo��ҵ��򵥣�ֻ��Ҫ�򵥵���getForObject���ܻ�ȡ���ݡ���ʵ�ϣ�RestTemplate���д�������HttpЭ��ķ���������delete()��getForEntity()��getForObject()��put()��headForHeaders()�ȡ������ں��ڵ�SpringCloudѧϰ�����У�Feign��ΪSpringCloud�ĺ������������Զ�̷�����ã�Ҳ�ǻ���HttpЭ�飬����֧��ע�⿪�����ܹ��������ٿ�����



��¼�ߣ����ע�����ĳ������º�ɫ�����֣���˵��Eureka�Ѿ������˱���ģʽ
EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. 
RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.

����ģʽ��Ҫ����һ��ͻ��˺�Eureka Server֮�����������������µı�����һ�����뱣��ģʽ��
Eureka Server���᳢�Ա��������ע����е���Ϣ������ɾ������ע����е����ݣ�Ҳ���ǲ���ע���κ�΢���񣩡�