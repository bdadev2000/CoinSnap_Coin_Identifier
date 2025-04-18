package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfvu {
    @SuppressLint({"RestrictedApi"})
    public static zzfvt zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzfvv(new zzfwl(context));
    }
}
