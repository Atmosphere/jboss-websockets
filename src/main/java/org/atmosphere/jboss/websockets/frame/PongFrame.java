package org.atmosphere.jboss.websockets.frame;

import org.atmosphere.jboss.websockets.FrameType;
import org.atmosphere.jboss.websockets.FrameType;

/**
 * @author Mike Brock
 */
public class PongFrame extends AbstractFrame {
  private static final PongFrame INSTANCE = new PongFrame();

  private PongFrame() {
    super(FrameType.Pong);
  }

  public static PongFrame get() {
    return INSTANCE;
  }
}
