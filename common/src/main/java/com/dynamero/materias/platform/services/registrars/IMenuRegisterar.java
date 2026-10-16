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

package com.dynamero.materias.platform.services.registrars;

import com.dynamero.contracts.annotations.*;
import org.jetbrains.annotations.NotNull;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.inventory.AbstractContainerMenu;

/**
 * Registers custom screens and screen handlers for Minecraft.
 */
@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public interface IMenuRegisterar
{
    /**
     * Registers an extended screen handler type.
     *
     * @param <R>             the type of the screen handler
     * @param <D>             the type of the custom payload
     * @param name            the name of the screen handler type
     * @param factory         the factory used to create instances of the screen handler
     * @param codec           the packet codec for the custom payload
     * @return the registered extended screen handler type
     */
    /*<R extends AbstractContainerMenu, D extends CustomPacketPayload> ExtendedMenuType<@NotNull R, D>
            register(String name, ExtendedMenuType.ExtendedFactory<@NotNull R, D> factory,
                    StreamCodec<? super RegistryFriendlyByteBuf, D> codec);*/
}