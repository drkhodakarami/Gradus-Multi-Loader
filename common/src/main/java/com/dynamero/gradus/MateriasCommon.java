/*
 * Copyright (c) 2026 Alireza Khodakarami
 *
 * Licensed under the LPGL-3.0, (read the "LICENSE" file in repo);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.gnu.org/licenses/lgpl-3.0.en.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dynamero.gradus;

import static com.dynamero.gradus.MateriasConstants.LOG;

import com.dynamero.gradus.platform.Services;
import com.dynamero.gradus.registries.base.*;

public class MateriasCommon
{
    public static void init()
    {
        LOG.logY("Common > " + Services.PLATFORM.getPlatformName() + " > " + Services.PLATFORM.getEnvironmentName());

        // It is common for all supported loaders to provide a similar feature that can not be used directly in the
        // common code. A popular way to get around this is using Java's built-in service loader feature to create
        // your own abstraction layer. You can learn more about this in our provided services class. In this example
        // we have an interface in the common code and use a loader specific implementation to delegate our call to
        // the platform specific approach.
        /*if (Services.PLATFORM.isModLoaded("materias"))
        {
            LOGGER.logC("Hello to Materias");
        }*/

        ModBlocks.load();
        ModBlockItems.load();

        ModCreativeTabs.load();
    }
}