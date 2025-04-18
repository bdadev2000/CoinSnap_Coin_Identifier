package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface zzaux {
    String zzd(Context context, @Nullable String str, @Nullable View view);

    String zze(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity);

    String zzf(Context context);

    String zzg(Context context);

    String zzh(Context context, @Nullable View view, @Nullable Activity activity);

    void zzk(@Nullable MotionEvent motionEvent);

    @Deprecated
    void zzl(int i10, int i11, int i12);

    void zzn(StackTraceElement[] stackTraceElementArr);

    void zzo(@Nullable View view);
}
