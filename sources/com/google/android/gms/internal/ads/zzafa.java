package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzafa implements zzadb {
    private final zzek zza = new zzek(4);
    private final zzaec zzb = new zzaec(-1, -1, "image/avif");

    private final boolean zza(zzadc zzadcVar, int i2) throws IOException {
        this.zza.zzI(4);
        ((zzacq) zzadcVar).zzm(this.zza.zzN(), 0, 4, false);
        return this.zza.zzu() == ((long) i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        return this.zzb.zzb(zzadcVar, zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return zzgax.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        this.zzb.zze(zzadeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        this.zzb.zzf(j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        ((zzacq) zzadcVar).zzl(4, false);
        return zza(zzadcVar, 1718909296) && zza(zzadcVar, 1635150182);
    }
}
