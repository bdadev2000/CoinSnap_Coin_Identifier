package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class SoundImageView extends ImageView {
    private boolean a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = true;
    }

    public boolean getStatus() {
        return this.a;
    }

    public void setSoundStatus(boolean z10) {
        this.a = z10;
        if (z10) {
            setImageResource(v.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(v.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.a = true;
    }
}
