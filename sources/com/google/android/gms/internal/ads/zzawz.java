package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public interface zzawz {
    String zze(Context context, @Nullable String str, @Nullable View view);

    String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity);

    String zzg(Context context);

    String zzh(Context context, @Nullable View view, @Nullable Activity activity);

    void zzk(@Nullable MotionEvent motionEvent);

    @Deprecated
    void zzl(int i9, int i10, int i11);

    void zzn(StackTraceElement[] stackTraceElementArr);

    void zzo(@Nullable View view);
}
