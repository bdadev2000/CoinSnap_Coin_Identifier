package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzdge {
    private final List zza;
    private final zzfng zzb;
    private boolean zzc;

    public zzdge(zzfgh zzfghVar, zzfng zzfngVar) {
        this.zza = zzfghVar.zzp;
        this.zzb = zzfngVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
