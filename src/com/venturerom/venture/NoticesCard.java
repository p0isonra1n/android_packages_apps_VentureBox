package com.venturerom.venture;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.venturerom.venture.widget.Card;

public class NoticesCard extends Card{

	public NoticesCard(Context context, AttributeSet attrs, Bundle savedInstanceState, String priority, String date, String notice, Boolean empty) {
        super(context, attrs, savedInstanceState, true);

        setTitle(R.string.updates_title);
        setLayoutId(R.layout.card_notices);

        Resources res = context.getResources();
        
        if(empty){
        	TextView tvNotice = (TextView) findLayoutViewById(R.id.tvNotice);
            tvNotice.setText(res.getString(R.string.notice_empty));
        }else{
        	if(priority.equals("low")){ setColorLow(); }
    		else if(priority.equals("normal")){ setColorNormal(); }
    		else if(priority.equals("warning")){ setColorWarning(); }
    		else if (priority.equals("urgent")){ setColorUrgent(); }
        	setTitle("Update: " + date);
            TextView tvNotice = (TextView) findLayoutViewById(R.id.tvNotice);
            tvNotice.setText(notice);
        }
    }

	private void setColorLow() {
		View bar = (View)findViewById(R.id.bar);
		bar.setBackgroundColor(Color.argb(0xff, 0x0f, 0x9d, 0x58));
		bar = (View)findViewById(R.id.barTop);
		bar.setBackgroundColor(Color.argb(0xff, 0x0f, 0x9d, 0x58));
		bar = (View)findViewById(R.id.barTop2);
		bar.setBackgroundColor(Color.argb(0xff, 0x0f, 0x9d, 0x58));
		bar = (View)findViewById(R.id.barBottom);
		bar.setBackgroundColor(Color.argb(0xff, 0x0f, 0x9d, 0x58));
	}

	private void setColorNormal() {
		View bar = (View)findViewById(R.id.bar);
		bar.setBackgroundColor(Color.argb(0xff, 0x03, 0xa9, 0xf4));
		bar = (View)findViewById(R.id.barTop);
		bar.setBackgroundColor(Color.argb(0xff, 0x03, 0xa9, 0xf4));
		bar = (View)findViewById(R.id.barTop2);
		bar.setBackgroundColor(Color.argb(0xff, 0x03, 0xa9, 0xf4));
		bar = (View)findViewById(R.id.barBottom);
		bar.setBackgroundColor(Color.argb(0xff, 0x03, 0xa9, 0xf4));
	}

	private void setColorWarning() {
		View bar = (View)findViewById(R.id.bar);
		bar.setBackgroundColor(Color.argb(0xff, 0xff, 0x57, 0x22));
		bar = (View)findViewById(R.id.barTop);
		bar.setBackgroundColor(Color.argb(0xff, 0xff, 0x57, 0x22));
		bar = (View)findViewById(R.id.barTop2);
		bar.setBackgroundColor(Color.argb(0xff, 0xff, 0x57, 0x22));
		bar = (View)findViewById(R.id.barBottom);
		bar.setBackgroundColor(Color.argb(0xff, 0xff, 0x57, 0x22));
	}

	private void setColorUrgent() {
		View bar = (View)findViewById(R.id.bar);
		bar.setBackgroundColor(Color.argb(0xff, 0xf4, 0x43, 0x46));
		bar = (View)findViewById(R.id.barTop);
		bar.setBackgroundColor(Color.argb(0xff, 0xf4, 0x43, 0x46));
		bar = (View)findViewById(R.id.barTop2);
		bar.setBackgroundColor(Color.argb(0xff, 0xf4, 0x43, 0x46));
		bar = (View)findViewById(R.id.barBottom);
		bar.setBackgroundColor(Color.argb(0xff, 0xf4, 0x43, 0x46));
	}

    @Override
    public boolean canExpand() {
        return false;
    }
}
