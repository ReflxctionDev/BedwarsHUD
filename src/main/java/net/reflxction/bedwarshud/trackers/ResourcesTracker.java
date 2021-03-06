/*
 * * Copyright 2018 github.com/ReflxctionDev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.reflxction.bedwarshud.trackers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.reflxction.bedwarshud.events.bedwars.game.GameEndEvent;

/**
 * The tracker for tracking the amount of diamonds
 */
public class ResourcesTracker implements Tracker {

    public int getAmountOf(Item item) {
        int count = 0;
        for (ItemStack itemStack : mc.thePlayer.inventory.mainInventory) {
            if (itemStack != null && itemStack.getItem().getUnlocalizedName().equals(item.getUnlocalizedName())) {
                count += itemStack.stackSize;
            }
        }
        return count;
    }

    /**
     * Resets all the elements in the HUD. This should be called in {@link GameEndEvent}.
     */
    @Override
    public void resetAll() {
    }
}
