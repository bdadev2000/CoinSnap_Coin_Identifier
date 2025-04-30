package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes2.dex */
public final class zzco {
    public static final int zza;

    static {
        int i9;
        if (Build.VERSION.SDK_INT >= 31) {
            i9 = 33554432;
        } else {
            i9 = 0;
        }
        zza = i9;
    }

    public static PendingIntent zza(Context context, int i9, Intent intent, int i10) {
        return PendingIntent.getBroadcast(context, 0, intent, i10);
    }
}
