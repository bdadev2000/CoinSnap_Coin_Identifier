package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Context;
import android.media.AudioProfile;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.widget.EdgeEffect;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ AudioProfile h(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i10) {
        return new ContentInfo.Builder(clipData, i10);
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ EdgeEffect n(Context context, AttributeSet attributeSet) {
        return new EdgeEffect(context, attributeSet);
    }
}
