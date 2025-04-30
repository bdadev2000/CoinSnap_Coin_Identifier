package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfwg {
    @SuppressLint({"RestrictedApi"})
    public static zzfwf zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzfwh(new zzfwn(context));
    }
}
