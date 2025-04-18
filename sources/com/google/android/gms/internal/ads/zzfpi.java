package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes4.dex */
public final class zzfpi {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfpi zza = new zzfpi();
    private Context zzb;

    private zzfpi() {
    }

    public static zzfpi zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
