package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzdep {
    private final List zza;
    private final zzflr zzb;
    private boolean zzc;

    public zzdep(zzfet zzfetVar, zzflr zzflrVar) {
        this.zza = zzfetVar.zzp;
        this.zzb = zzflrVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
