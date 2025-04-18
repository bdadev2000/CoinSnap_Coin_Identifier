package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzajo implements zzacr {
    private zzacu zza;
    private zzajw zzb;
    private boolean zzc;

    private final boolean zza(zzacs zzacsVar) throws IOException {
        zzajq zzajqVar = new zzajq();
        if (zzajqVar.zzb(zzacsVar, true) && (zzajqVar.zza & 2) == 2) {
            int min = Math.min(zzajqVar.zze, 8);
            zzed zzedVar = new zzed(min);
            zzacsVar.zzh(zzedVar.zzN(), 0, min);
            zzedVar.zzL(0);
            if (zzedVar.zzb() >= 5 && zzedVar.zzm() == 127 && zzedVar.zzu() == 1179402563) {
                this.zzb = new zzajn();
            } else {
                zzedVar.zzL(0);
                try {
                    if (zzaed.zzd(1, zzedVar, true)) {
                        this.zzb = new zzajy();
                    }
                } catch (zzbh unused) {
                }
                zzedVar.zzL(0);
                if (zzajs.zzd(zzedVar)) {
                    this.zzb = new zzajs();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        zzdb.zzb(this.zza);
        if (this.zzb == null) {
            if (zza(zzacsVar)) {
                zzacsVar.zzj();
            } else {
                throw zzbh.zza("Failed to determine bitstream type", null);
            }
        }
        if (!this.zzc) {
            zzadx zzw = this.zza.zzw(0, 1);
            this.zza.zzD();
            this.zzb.zzh(this.zza, zzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzacsVar, zzadnVar);
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
        this.zza = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        zzajw zzajwVar = this.zzb;
        if (zzajwVar != null) {
            zzajwVar.zzj(j3, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        try {
            return zza(zzacsVar);
        } catch (zzbh unused) {
            return false;
        }
    }
}
