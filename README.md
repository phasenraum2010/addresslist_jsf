addresslist_jsf
===============

educational project for teaching JSF in Java EE 6 comparable to Spring MVC and other Frameworks

install JBoss
-------------

install JBoss 7.1.Final from http://www.jboss.org/jbossas/downloads/ to e.g. /Users/tw/srv/jboss-as-7.1.1.Final/

start JBoss by: cd /Users/tw/srv/jboss-as-7.1.1.Final/bin ; ./standalone.sh

build and run
-------------

build and deploy project with: mvn clean install jboss-as:deploy

open url in browser: http://localhost:8080/addresslist_jsf/
