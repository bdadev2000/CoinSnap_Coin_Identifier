package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzagi implements zzadu {
    private final zzfu zza = new zzfu(4);
    private final zzaev zzb = new zzaev(-1, -1, "image/heif");

    private final boolean zza(zzadv zzadvVar, int i9) throws IOException {
        this.zza.zzH(4);
        ((zzadi) zzadvVar).zzm(this.zza.zzM(), 0, 4, false);
        if (this.zza.zzu() != i9) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        return this.zzb.zzb(zzadvVar, zzaeqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzb.zzd(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        this.zzb.zze(j7, j9);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        ((zzadi) zzadvVar).zzl(4, false);
        if (!zza(zzadvVar, 1718909296) || !zza(zzadvVar, 1751476579)) {
            return false;
        }
        return true;
    }
}
