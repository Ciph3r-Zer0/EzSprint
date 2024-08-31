package dev.dreamers.ezsprint.listener;

import net.labymod.api.event.Phase;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.lifecycle.GameTickEvent;
import dev.dreamers.ezsprint.EzSprint;

public class GameTickListener {

  private final EzSprint addon;

  public GameTickListener(EzSprint addon) {
    this.addon = addon;
  }

  @Subscribe
  public void onGameTick(GameTickEvent event) {
    if (event.phase() != Phase.PRE) return;
    if (!addon.labyAPI().minecraft().isIngame()) return;
//    if (!addon.labyAPI().minecraft().options().sprintInput().isActuallyDown()) return;

    addon.labyAPI().minecraft().options().sprintInput().press();
  }
}
