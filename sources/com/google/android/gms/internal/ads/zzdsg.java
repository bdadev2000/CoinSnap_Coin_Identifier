package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzdsg extends FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzau zza;

    public zzdsg(Context context, @NonNull View view, @NonNull com.google.android.gms.ads.internal.util.zzau zzauVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzauVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.zzm(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            KeyEvent.Callback childAt = getChildAt(i9);
            if (childAt != null && (childAt instanceof zzchd)) {
                arrayList.add((zzchd) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzchd) arrayList.get(i10)).destroy();
        }
    }
}
