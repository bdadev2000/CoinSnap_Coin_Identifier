package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfpj {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfpj zza = new zzfpj();
    private Context zzb;

    private zzfpj() {
    }

    public static zzfpj zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.zzb = context2;
    }
}
