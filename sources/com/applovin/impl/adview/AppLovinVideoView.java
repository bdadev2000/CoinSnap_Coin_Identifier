package com.applovin.impl.adview;

import android.content.Context;
import android.widget.VideoView;

/* loaded from: classes.dex */
public class AppLovinVideoView extends VideoView {
    public AppLovinVideoView(Context context) {
        super(context, null, 0);
    }

    public void setVideoSize(int i10, int i11) {
        getHolder().setFixedSize(i10, i11);
        requestLayout();
        invalidate();
    }
}
