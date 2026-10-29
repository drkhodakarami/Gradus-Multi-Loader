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

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import com.dynamero.gradus.platform.services.registrars.*;

@Mod(MateriasConstants.MODID)
public class MateriasNeoForge
{
    public MateriasNeoForge(IEventBus eventBus)
    {
        LOG.logNeoForge();

        MateriasCommon.init();
        eventBus.addListener(MateriasDataGen::onGatherClientData);

        NeoForgeItemRegisterar.register(eventBus);
        NeoForgeBlockRegisterar.register(eventBus);

        NeoForgeCreativeTabRegistrar.register(eventBus);
    }
}