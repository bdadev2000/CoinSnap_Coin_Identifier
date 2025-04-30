package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzdhm {
    private final List zza;
    private final zzfoe zzb;
    private boolean zzc;

    public zzdhm(zzfgt zzfgtVar, zzfoe zzfoeVar) {
        this.zza = zzfgtVar.zzq;
        this.zzb = zzfoeVar;
    }

    public final void zza() {
        if (!this.zzc) {
            this.zzb.zzd(this.zza);
            this.zzc = true;
        }
    }
}
