package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class zzfpg {
    private final zzfqs zza;
    private final String zzb;
    private final zzfop zzc;
    private final String zzd = "Ad overlay";

    public zzfpg(View view, zzfop zzfopVar, @Nullable String str) {
        this.zza = new zzfqs(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfopVar;
    }

    public final zzfop zza() {
        return this.zzc;
    }

    public final zzfqs zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
