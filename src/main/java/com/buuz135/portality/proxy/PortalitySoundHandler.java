/*
 * This file is part of Worldgen Indicators.
 *
 * Copyright 2018, Buuz135
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.buuz135.portality.proxy;

import com.buuz135.portality.Portality;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PortalitySoundHandler {

    public static final SoundEvent PORTAL = new SoundEvent(new ResourceLocation(Portality.MOD_ID, "portal")).setRegistryName(new ResourceLocation(Portality.MOD_ID, "portal"));
    public static final SoundEvent PORTAL_TP = new SoundEvent(new ResourceLocation(Portality.MOD_ID, "portal_teleport")).setRegistryName(new ResourceLocation(Portality.MOD_ID, "portal_teleport"));


    @SubscribeEvent
    public void onSoundRegister(RegistryEvent.Register<SoundEvent> registry) {
        registry.getRegistry().registerAll(PORTAL, PORTAL_TP);
    }

}
