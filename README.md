# naranjadulce
Back End Food Services

1. Download Wildfly 9/10 from http://wildfly.org/downloads/

2. Extract it and then start it

victor@centauro:~/dev$ cd wildfly-10.0.0.CR4/
victor@centauro:~/dev/wildfly-10.0.0.CR4$ cd 
appclient/       bin/             docs/            domain/          .installation/   modules/         standalone/      welcome-content/ 
victor@centauro:~/dev/wildfly-10.0.0.CR4$ cd bin/
victor@centauro:~/dev/wildfly-10.0.0.CR4/bin$ ls
add-user.bat         appclient.conf      client           domain.conf.ps1               jboss-cli.ps1  jconsole.sh   run.bat              standalone.conf.ps1  vault.sh              wsprovide.bat
add-user.properties  appclient.conf.bat  common.ps1       domain.ps1                    jboss-cli.sh   jdr.bat       run.sh               standalone.ps1       wildfly-launcher.jar  wsprovide.ps1
add-user.ps1         appclient.conf.ps1  domain.bat       domain.sh                     jboss-cli.xml  jdr.ps1       standalone.bat       standalone.sh        wsconsume.bat         wsprovide.sh
add-user.sh          appclient.ps1       domain.conf      jboss-cli.bat                 jconsole.bat   jdr.sh        standalone.conf      vault.bat            wsconsume.ps1
appclient.bat        appclient.sh        domain.conf.bat  jboss-cli-logging.properties  jconsole.ps1   product.conf  standalone.conf.bat  vault.ps1            wsconsume.sh
victor@centauro:~/dev/wildfly-10.0.0.CR4/bin$ ./standalone.sh 
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /home/victor/dev/wildfly-10.0.0.CR4

  JAVA: java

  JAVA_OPTS:  -server -Xms64m -Xmx512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true

=========================================================================

17:13:53,877 INFO  [org.jboss.modules] (main) JBoss Modules version 1.4.4.Final
17:13:54,067 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.6.Final
17:13:54,134 INFO  [org.jboss.as] (MSC service thread 1-6) WFLYSRV0049: WildFly Full 10.0.0.CR4 (WildFly Core 2.0.0.CR8) starting
17:13:55,605 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
17:13:55,642 INFO  [org.xnio] (MSC service thread 1-8) XNIO version 3.3.2.Final
17:13:55,708 INFO  [org.xnio.nio] (MSC service thread 1-8) XNIO NIO Implementation Version 3.3.2.Final
17:13:55,746 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 38) WFLYCLINF0001: Activating Infinispan subsystem.
17:13:55,754 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 37) WFLYIO001: Worker 'default' has auto-configured to 8 core threads with 64 task threads based on your 4 available processors
17:13:55,810 INFO  [org.jboss.as.connector] (MSC service thread 1-7) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.3.1.Final)
17:13:55,819 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 33) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.3)
17:13:55,822 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = h2
17:13:55,827 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 46) WFLYNAM0001: Activating Naming Subsystem
17:13:55,824 INFO  [org.jboss.remoting] (MSC service thread 1-8) JBoss Remoting version 4.0.14.Final
17:13:55,856 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 44) WFLYJSF0007: Activated the following JSF Implementations: [main]
17:13:56,008 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 54) WFLYTX0013: Node identifier property is set to the default value. Please make sure it is unique.
17:13:56,047 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 56) WFLYWS0002: Activating WebServices Extension
17:13:56,058 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 53) WFLYSEC0002: Activating Security Subsystem
17:13:56,060 INFO  [org.jboss.as.naming] (MSC service thread 1-8) WFLYNAM0003: Starting Naming Service
17:13:56,061 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-6) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
17:13:56,074 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=4.9.3.Final
17:13:56,181 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0003: Undertow 1.3.3.Final starting
17:13:56,183 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 55) WFLYUT0003: Undertow 1.3.3.Final starting
17:13:56,317 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 16 (per class), which is derived from the number of CPUs on this host.
17:13:56,317 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 64 (per class), which is derived from thread worker pool sizing.
17:13:56,350 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 55) WFLYUT0014: Creating file handler for path '/home/victor/dev/wildfly-10.0.0.CR4/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
17:13:56,355 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0012: Started server default-server.
17:13:56,356 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0018: Host default-host starting
17:13:56,460 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow HTTP listener default listening on 127.0.0.1:8080
17:13:56,739 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-8) WFLYDS0013: Started FileSystemDeploymentService for directory /home/victor/dev/wildfly-10.0.0.CR4/standalone/deployments
17:13:56,748 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-8) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
17:13:56,924 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-6) ISPN000128: Infinispan version: Infinispan 'Infinite Darkness' 8.0.1.Final
17:13:56,924 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-1) ISPN000128: Infinispan version: Infinispan 'Infinite Darkness' 8.0.1.Final
17:13:56,952 INFO  [org.jboss.ws.common.management] (MSC service thread 1-3) JBWS022052: Starting JBoss Web Services - Stack CXF Server 5.1.0.Final
17:13:57,161 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
17:13:57,161 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
17:13:57,162 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: WildFly Full 10.0.0.CR4 (WildFly Core 2.0.0.CR8) started in 3532ms - Started 259 of 489 services (314 services are lazy, passive or on-demand)

3. Add an user for administration (development mode only)

victor@centauro:~/dev/wildfly-10.0.0.CR4/bin$ ./add-user.sh 

What type of user do you wish to add? 
 a) Management User (mgmt-users.properties) 
 b) Application User (application-users.properties)
(a): 

Enter the details of the new user to add.
Using realm 'ManagementRealm' as discovered from the existing property files.
Username : admin
The username 'admin' is easy to guess
Are you sure you want to add user 'admin' yes/no? yes
Password recommendations are listed below. To modify these restrictions edit the add-user.properties configuration file.
 - The password should be different from the username
 - The password should not be one of the following restricted values {root, admin, administrator}
 - The password should contain at least 8 characters, 1 alphabetic character(s), 1 digit(s), 1 non-alphanumeric symbol(s)
Password : 
WFLYDM0098: The password should be different from the username
Are you sure you want to use the password entered yes/no? yes
Re-enter Password : 
What groups do you want this user to belong to? (Please enter a comma separated list, or leave blank for none)[  ]: 
About to add user 'admin' for realm 'ManagementRealm'
Is this correct yes/no? yes
Added user 'admin' to file '/home/victor/dev/wildfly-10.0.0.CR4/standalone/configuration/mgmt-users.properties'
Added user 'admin' to file '/home/victor/dev/wildfly-10.0.0.CR4/domain/configuration/mgmt-users.properties'
Added user 'admin' with groups  to file '/home/victor/dev/wildfly-10.0.0.CR4/standalone/configuration/mgmt-groups.properties'
Added user 'admin' with groups  to file '/home/victor/dev/wildfly-10.0.0.CR4/domain/configuration/mgmt-groups.properties'
Is this new user going to be used for one AS process to connect to another AS process? 
e.g. for a slave host controller connecting to the master or for a Remoting connection for server to server EJB calls.
yes/no? 

 * Error * 
WFLYDM0029: Invalid response. (Valid responses are yes, y, no and n)

Is this new user going to be used for one AS process to connect to another AS process? 
e.g. for a slave host controller connecting to the master or for a Remoting connection for server to server EJB calls.
yes/no? yes
To represent the user add the following to the server-identities definition <secret value="YWRtaW4=" />
victor@centauro:~/dev/wildfly-10.0.0.CR4/bin$

4. Clone the repository 
