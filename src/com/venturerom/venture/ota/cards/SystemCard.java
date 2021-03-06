/*
 * Copyright 2014 ParanoidAndroid Project
 *
 * This file is part of Paranoid OTA.
 *
 * Paranoid OTA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Paranoid OTA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Paranoid OTA.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.venturerom.venture.ota.cards;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.TextView;

import com.venturerom.venture.MainActivity;
import com.venturerom.venture.R;
import com.venturerom.venture.ota.helpers.DownloadHelper;
import com.venturerom.venture.ota.helpers.DownloadHelper.DownloadCallback;
import com.venturerom.venture.ota.updater.GappsUpdater;
import com.venturerom.venture.ota.updater.RomUpdater;
import com.venturerom.venture.ota.updater.Updater.PackageInfo;
import com.venturerom.venture.widget.Card;
import com.venturerom.venture.widget.Item;
import com.venturerom.venture.widget.Item.OnItemClickListener;

public class SystemCard extends Card {

    public SystemCard(Context context, AttributeSet attrs, RomUpdater romUpdater,
            GappsUpdater gappsUpdater, Bundle savedInstanceState) {
        super(context, attrs, savedInstanceState,false);

        setTitle(R.string.system_title);
        setLayoutId(R.layout.card_system);

        Resources res = context.getResources();

        TextView romView = (TextView) findLayoutViewById(R.id.rom);
        romView.setText(res.getString(R.string.system_rom,
                romUpdater.getVersion().toString(false)));
        
        TextView maintainerView = (TextView) findLayoutViewById(R.id.maintainer);
        maintainerView.setText(res.getString(R.string.system_maintainer,
                romUpdater.getMaintainer()));

        TextView gappsView = (TextView) findLayoutViewById(R.id.gapps);
        gappsView.setText(res.getString(R.string.system_gapps, gappsUpdater.getType(), gappsUpdater
                .getVersion().toString(false)));
    }

    @Override
    public boolean canExpand() {
        return false;
    }

}