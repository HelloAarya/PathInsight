package org.cytoscape.PModel.internal.TaskFactories;

import org.cytoscape.PModel.internal.Tasks.ActivationNode;
import org.cytoscape.PModel.internal.Tasks.ActivationNodeView;
import org.cytoscape.PModel.internal.Tasks.InhibitionNodeViewTask;
import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.model.CyNetwork;
import org.cytoscape.model.CyNode;
import org.cytoscape.service.util.CyServiceRegistrar;
import org.cytoscape.task.AbstractNodeViewTaskFactory;
import org.cytoscape.view.model.CyNetworkView;
import org.cytoscape.view.model.View;
import org.cytoscape.work.TaskIterator;

public class InhibitionNodeViewTaskFactory extends AbstractNodeViewTaskFactory{

	private CyApplicationManager appMgr;
	private CyServiceRegistrar registrar;
	private CyNetworkView netView;
	private CyNetwork network;
	
	/*public ActivationNodeViewTaskFactory(CyServiceRegistrar registrar) {
		// TODO Auto-generated constructor stub
	}*/
	
	public TaskIterator createTaskIterator(View<CyNode> nodeView, CyNetworkView netView) {
		return new TaskIterator(new InhibitionNodeViewTask(nodeView, netView));
		
	}

}
