package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaom implements zzacr {
    private final zzed zza = new zzed(4);
    private final zzads zzb = new zzads(-1, -1, "image/webp");

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
        this.zza.zzI(4);
        zzacg zzacgVar = (zzacg) zzacsVar;
        zzacgVar.zzm(this.zza.zzN(), 0, 4, false);
        if (this.zza.zzu() == 1380533830) {
            zzacgVar.zzl(4, false);
            this.zza.zzI(4);
            zzacgVar.zzm(this.zza.zzN(), 0, 4, false);
            if (this.zza.zzu() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
