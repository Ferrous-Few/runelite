/*
 * Copyright (c) 2018, Jasper Ketelaar <Jasper0781@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.mta.alchemy;

import lombok.Getter;
import net.runelite.api.gameval.ItemID;

enum AlchemyItem
{
	LEATHER_BOOTS("Leather Boots", ItemID.MAGICTRAINING_LEATHER_BOOTS),
	ADAMANT_KITESHIELD("Adamant Kiteshield", ItemID.MAGICTRAINING_ADAMANT_KITESHIELD),
	ADAMANT_MED_HELM("Helm", ItemID.MAGICTRAINING_ADAMANT_MED_HELM),
	EMERALD("Emerald", ItemID.MAGICTRAINING_EMERALD),
	RUNE_LONGSWORD("Rune Longsword", ItemID.MAGICTRAINING_RUNE_LONGSWORD),
	EMPTY("", -1),
	UNKNOWN("Unknown", ItemID._100GUIDE_GUIDECAKE);

	@Getter
	private final int id;
	@Getter
	private final String name;

	AlchemyItem(String name, int id)
	{
		this.id = id;
		this.name = name;
	}

	public static AlchemyItem find(String item)
	{
		for (AlchemyItem alchemyItem : values())
		{
			if (item.toLowerCase().contains(alchemyItem.name.toLowerCase()))
			{
				return alchemyItem;
			}
		}
		return null;
	}
}
