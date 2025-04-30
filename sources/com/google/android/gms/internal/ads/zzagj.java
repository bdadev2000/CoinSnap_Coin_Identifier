package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzagj implements zzadu {
    private final zzadu zza;

    public zzagj() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        return this.zza.zzb(zzadvVar, zzaeqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zza.zzd(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        this.zza.zze(j7, j9);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return this.zza.zzf(zzadvVar);
    }

    public zzagj(int i9) {
        this.zza = new zzagk();
    }
}
