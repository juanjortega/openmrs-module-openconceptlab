package org.openmrs.module.openconceptlab.page.controller;

import org.apache.commons.lang3.StringUtils;
import org.openmrs.module.openconceptlab.Update;
import org.openmrs.module.openconceptlab.UpdateService;
import org.openmrs.ui.framework.annotation.SpringBean;
import org.openmrs.ui.framework.page.PageModel;

/**
 * Created by codehub on 15/10/14.
 */
public class StatusPageController {
	public void controller(PageModel model,
						   @SpringBean UpdateService service){

		boolean checkIfUpdatesIsRunning = false;
		boolean checkIfSubscribed = true;

		String subscription_url = service.getSubscription().getUrl();
		if(StringUtils.isEmpty(subscription_url)) {
			checkIfSubscribed = false;
		}
		Update lastUpdate = service.getLastUpdate();
		if (lastUpdate != null && !lastUpdate.isStopped()) {
			checkIfUpdatesIsRunning = true;
		}

		model.addAttribute("checkIfUpdatesIsRunning", checkIfUpdatesIsRunning);
		model.addAttribute("checkIfSubscribed", checkIfSubscribed);
	}
}
