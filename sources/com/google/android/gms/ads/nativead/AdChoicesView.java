package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class AdChoicesView extends RelativeLayout {
    public AdChoicesView(@NonNull Context context) {
        super(context);
    }

    public AdChoicesView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdChoicesView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    @TargetApi(21)
    public AdChoicesView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
    }
}
