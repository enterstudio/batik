/*****************************************************************************
 * Copyright (C) The Apache Software Foundation. All rights reserved.        *
 * ------------------------------------------------------------------------- *
 * This software is published under the terms of the Apache Software License *
 * version 1.1, a copy of which has been included with this distribution in  *
 * the LICENSE file.                                                         *
 *****************************************************************************/

package org.apache.batik.bridge;

import java.awt.Shape;
import org.apache.batik.gvt.GraphicsNode;
import org.apache.batik.ext.awt.image.renderable.Clip;
import org.w3c.dom.Element;

/**
 * Factory class for vending <tt>Shape</tt> objects that represents a
 * clipping area.
 *
 * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a>
 * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a>
 * @version $Id$
 */
public interface ClipBridge extends Bridge {

    /**
     * Creates a <tt>Clip</tt> filter using the specified context and element.
     * @param node the GraphicsNode clipedNode
     * @param ctx the context to use
     * @param clipElement element containing the clip definition
     * @param clipedElement the Element with the 'clip-path' attribute
     */
    Clip createClip(BridgeContext ctx,
                    GraphicsNode node,
                    Element clipElement,
                    Element clipedElement);

    /**
     * Updates an Element coresponding to the specified BridgeMutationEvent.
     * @param evt the event that describes the modification to perform
     */
    void update(BridgeMutationEvent evt);
}
