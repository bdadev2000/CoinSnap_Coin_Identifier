package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfnw {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfnw zza = new zzfnw();
    private Context zzb;

    private zzfnw() {
    }

    public static zzfnw zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
