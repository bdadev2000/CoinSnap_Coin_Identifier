package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes3.dex */
public final class zzcw {
    public static final int zza;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        zza = i10;
    }

    public static PendingIntent zza(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getBroadcast(context, 0, intent, i11);
    }
}
