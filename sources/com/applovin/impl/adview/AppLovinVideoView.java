package com.applovin.impl.adview;

import android.content.Context;
import android.widget.VideoView;

/* loaded from: classes.dex */
public class AppLovinVideoView extends VideoView {
    public AppLovinVideoView(Context context) {
        super(context, null, 0);
    }

    public void setVideoSize(int i9, int i10) {
        getHolder().setFixedSize(i9, i10);
        requestLayout();
        invalidate();
    }
}
