package org.springframework.cloud.appbroker.workflow.action.createserviceinstance.appdeploy;

import java.util.Collections;

import org.springframework.cloud.appbroker.workflow.action.createserviceinstance.CreateServiceRequestContext;

public class CloudFoundryDefaultBackingAppDeployer implements BackingAppDeployer {

	@Override
	public void accept(BackingAppParameters backingAppParameters, CreateServiceRequestContext createServiceRequestContext) {
		//Deploy app and store any data generated by the platform that might need to be persisted, such as app guid or generated route
		createServiceRequestContext.setBackingAppState(new BackingAppState(Collections.emptyMap()));
	}

}