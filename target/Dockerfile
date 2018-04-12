FROM registry.access.redhat.com/jboss-eap-7/eap71-openshift
ADD apirest-1.war $JBOSS_HOME/standalone/deployments/
USER root
RUN chown jboss:jboss $JBOSS_HOME/standalone/deployments/apirest-1.war
USER jboss 
