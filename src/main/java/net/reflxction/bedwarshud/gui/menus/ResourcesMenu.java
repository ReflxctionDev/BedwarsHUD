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
package net.reflxction.bedwarshud.gui.menus;

import net.minecraft.client.gui.GuiButton;
import net.reflxction.bedwarshud.gui.page.Page;

/**
 * The menu for resources settings
 */
public class ResourcesMenu extends Page {

    /**
     * The name of the page
     *
     * @return The name of the page
     */
    @Override
    public String getPageName() {
        return "Resources";
    }

    /**
     * The ID of the "<" button
     *
     * @return ^
     */
    @Override
    public int previousButtonId() {
        return 9;
    }

    /**
     * The ID of the ">" button
     *
     * @return ^
     */
    @Override
    public int nextButtonId() {
        return 10;
    }

    /**
     * The index of the page, just like a book
     *
     * @return ^
     */
    @Override
    public int getIndex() {
        return 0;
    }

    /**
     * Whether the current page is the first page
     * This is false by default, and is to be overrided by the first page
     *
     * @return True if the current page is the first, false if otherwise
     */
    @Override
    public boolean first() {
        return true;
    }

    /**
     * Called when the GUI is starting to draw buttons
     */
    @Override
    public void initGui() {
        addButtons(
                buttons.getIronButton(),
                buttons.getGoldButton(),
                buttons.getDiamondButton(),
                buttons.getEmeraldButton(),
                buttons.getArrowsButton(),
                buttons.getWoolButton());
        super.initGui();
    }

    /**
     * Called when a button is clicked
     *
     * @param button Button that was clicked
     */
    @Override
    public void actionPerformed(GuiButton button) {
        super.handleElementButtonActions(button);
        super.managePages(button);
    }

    /**
     * @return Whether the GUI acts like a pause menu when opened
     */
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
