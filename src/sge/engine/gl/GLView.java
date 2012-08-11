/*******************************************************************************
 * Copyright (c) 2012 Joshua Huelsman.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Joshua Huelsman - Initial implementation.
 *******************************************************************************/

/* 
 * SGE is a small rendering/game engine implementation I built for PocketTool.
 * It was never finished.
 * Many of its classes may or may not be implemented.
 * 
 */
package sge.engine.gl;

import sge.engine.node.Node;
import android.opengl.GLSurfaceView;

public class GLView extends GLSurfaceView {
	private GLRenderer renderer;
	public GLView(sge.engine.realism.SGEActivity context) {
		super(context);
		renderer = new GLRenderer(context);
		setRenderer(renderer);
	}
	
	public void setRootNode(Node root){
		renderer.setRootNode(root);
	}

}
