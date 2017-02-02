# Modeler

Modeler is an open-source Cytoscape application created to aid in modeling the upstream and downstream signaling effects of small molecule binders in a biological pathway. Users may perturb a given system through a series of steps and observe the affected pathway under various pre-defined conditions. Modeler also allows for the use of visualization in Systems Biology Graphical Notation. 

	Modeler is developed and maintained by Aarya Venkat (aarya@ucsd.edu) of the Gilson Lab (gilson.ucsd.edu) at UCSD.

# Installation
	1.	Download the latest JAR file from https://github.com/HelloAarya/Modeler
	2.	Open Cytoscape. Click on Apps > App Manager > Install from File
	
	Alternatively, install Modeler from the Cytoscape App Store (link to be provided soon).
	
	
# Function Guide:

-	Modeler functions are located in Cytoscape under Apps > Pathway Modeler
	- Node Analysis: An algorithmic analysis that models how a selected activated or inactivated node (or nodes) will affect their nearest neighbors. May be performed in one step (nearest neighbors) or two steps (nearest neighbors + neighbors of nearest neighbors) or N-steps (recursive algorithm that operates the number of times a user specifies).

-	Compound Label: 
	- Activated – Gives selected nodes a value of one.
	- Inhibited – Gives selected nodes a value of negative one.
	- Reset – Gives selected nodes a value of zero.
- Edge Label: 
	- Activating – Gives selected edges a value of one.
	-	Inhibiting – Gives selected edges a value of negative one.
	-	Reset – Gives selected edges a value of zero. 
- Reset Values: 
	-	Reset Nodes – Resets all node values to zero.
	-	Reset Edges – Resets all edge values to zero.
	-	Clear Images – Erases all painted images made by the Paint All Nodes function.

- Paint All Nodes: 
	- This purely visual feature takes any edge that has previously been allocated a value of activating (+1), inhibiting (-1), or null (0) and gives it a corresponding circle, T, or diamond interaction symbol. Furthermore, if the pathway is taken directly from a KEGG source (like KEGGScape), edges are automatically changed based on provided information.
	- This function also gives any node labeled with an integer value, previously set by Node Analysis or Node Label tabs, a corresponding image of the value. Users may use this to visually model the effects of a perturbed pathway.

- Phosphorylation
	- Phosphorylated -- visual function adding a yellow dashed line to an edge specified as phosphorylating.
	- Dephosphorylated -- visual function adding a pink dashed line to an edge specified as dephosphorylating.

- SBGN (Systems Biology Graphical Notation)
	- Draw Chemical Node -- creates a circle shape (or replaces a node with one if a node is selected)
	- Draw Macromolecule -- Replaces a node with the SBGN value for a macromolecule
	- Draw Gene -- Replaces a node with the SBGN value for a gene
	- Draw Process Nodes -- Creates a node that represents translocation or dimerization
	- Draw AND Gate -- Creates a node that represents an AND gate
	- Draw OR Gate -- Creates a node that represents an OR gate

# Use Case
- To be updated.
