package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzfnu {
    private final zzfpi zza;
    private final String zzb;
    private final zzfnd zzc;
    private final String zzd = "Ad overlay";

    public zzfnu(View view, zzfnd zzfndVar, @Nullable String str) {
        this.zza = new zzfpi(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfndVar;
    }

    public final zzfnd zza() {
        return this.zzc;
    }

    public final zzfpi zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
