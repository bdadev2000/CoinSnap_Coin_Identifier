package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public class PAGMediaView extends FrameLayout {
    protected Integer zp;

    public PAGMediaView(@NonNull Context context) {
        super(context);
    }

    public void close() {
    }

    public void setMrcTrackerKey(Integer num) {
        this.zp = num;
    }

    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
    }

    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    @RequiresApi(api = 21)
    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
    }
}
