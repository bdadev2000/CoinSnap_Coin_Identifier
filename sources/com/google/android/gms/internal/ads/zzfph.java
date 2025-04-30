package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfph {
    private final zzfqv zza;
    private final String zzb;
    private final zzfoq zzc;
    private final String zzd = "Ad overlay";

    public zzfph(View view, zzfoq zzfoqVar, @Nullable String str) {
        this.zza = new zzfqv(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfoqVar;
    }

    public final zzfoq zza() {
        return this.zzc;
    }

    public final zzfqv zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
