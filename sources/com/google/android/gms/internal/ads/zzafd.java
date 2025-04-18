package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzafd implements zzacr {
    private final zzed zza = new zzed(4);
    private final zzads zzb = new zzads(-1, -1, "image/heif");

    private final boolean zza(zzacs zzacsVar, int i10) throws IOException {
        this.zza.zzI(4);
        ((zzacg) zzacsVar).zzm(this.zza.zzN(), 0, 4, false);
        if (this.zza.zzu() != i10) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        return this.zzb.zzb(zzacsVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzb.zze(zzacuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        this.zzb.zzf(j3, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        ((zzacg) zzacsVar).zzl(4, false);
        if (!zza(zzacsVar, 1718909296) || !zza(zzacsVar, 1751476579)) {
            return false;
        }
        return true;
    }
}
