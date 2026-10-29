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

package com.dynamero.gradus.platform;

import java.util.ServiceLoader;

import com.dynamero.contracts.annotations.*;
import com.dynamero.gradus.platform.services.IPlatformHelper;
import com.dynamero.gradus.platform.services.registrars.*;

@SuppressWarnings("UnnecessaryLocalVariable")
@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public class Services
{
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static final IItemRegisterar ITEMS = load(IItemRegisterar.class);
    public static final IBlockRegisterar BLOCKS = load(IBlockRegisterar.class);
    public static final IBlockItemRegisterar BLOCK_ITEMS = new IBlockItemRegisterar() {};
    public static final ICreativeTabRegistrar CREATIVE_TAB_REGISTRAR = load(ICreativeTabRegistrar.class);

    public static <T> T load(Class<T> clazz)
    {
        final T loadedService = ServiceLoader.load(clazz, Services.class.getClassLoader())
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        //LOGGER.logC(String.format("Loaded %s for service %s", loadedService, clazz));
        return loadedService;
    }
}