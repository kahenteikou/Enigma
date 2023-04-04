/*******************************************************************************
* Copyright (c) 2015 Jeff Martin.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the GNU Lesser General Public
* License v3.0 which accompanies this distribution, and is available at
* http://www.gnu.org/licenses/lgpl.html
*
* <p>Contributors:
*     Jeff Martin - initial API and implementation
******************************************************************************/

package cuchaz.enigma.inputs.inheritanceTree;

// b extends a
public abstract class SubclassA extends BaseClass {
	// <init>(Ljava/lang/String;)V
	protected SubclassA(String name) {
		// call to a.<init>(Ljava/lang/String)V
		super(name);
	}
}
