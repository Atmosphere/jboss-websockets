package org.atmosphere.jboss.websockets.frame;

import org.atmosphere.jboss.websockets.Frame;
import org.atmosphere.jboss.websockets.FrameType;

/**
 * @author Mike Brock
 */
public class AbstractFrame implements Frame {
  private final FrameType type;

  protected AbstractFrame(final FrameType type) {
    this.type = type;
  }

  public FrameType getType() {
    return type;
  }
}
