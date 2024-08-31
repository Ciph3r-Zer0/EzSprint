package dev.dreamers.ezsprint;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;
import dev.dreamers.ezsprint.listener.GameTickListener;

@AddonMain
public class EzSprint extends LabyAddon<EzSprintConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();

    this.registerListener(new GameTickListener(this));
  }

  @Override
  protected Class<EzSprintConfiguration> configurationClass() {
    return EzSprintConfiguration.class;
  }
}
