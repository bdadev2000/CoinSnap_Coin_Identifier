package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzamy implements zzamz {
    private final List zza;
    private final zzaeh[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzamy(List list) {
        this.zza = list;
        this.zzb = new zzaeh[list.size()];
    }

    private final boolean zzf(zzek zzekVar, int i2) {
        if (zzekVar.zzb() == 0) {
            return false;
        }
        if (zzekVar.zzm() != i2) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzek zzekVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzekVar, 32)) {
                if (this.zzd != 1 || zzf(zzekVar, 0)) {
                    int zzd = zzekVar.zzd();
                    int zzb = zzekVar.zzb();
                    for (zzaeh zzaehVar : this.zzb) {
                        zzekVar.zzL(zzd);
                        zzaehVar.zzq(zzekVar, zzb);
                    }
                    this.zze += zzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        for (int i2 = 0; i2 < this.zzb.length; i2++) {
            zzaok zzaokVar = (zzaok) this.zza.get(i2);
            zzaonVar.zzc();
            zzaeh zzw = zzadeVar.zzw(zzaonVar.zza(), 3);
            zzad zzadVar = new zzad();
            zzadVar.zzL(zzaonVar.zzb());
            zzadVar.zzZ("application/dvbsubs");
            zzadVar.zzM(Collections.singletonList(zzaokVar.zzb));
            zzadVar.zzP(zzaokVar.zza);
            zzw.zzl(zzadVar.zzaf());
            this.zzb[i2] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
        if (this.zzc) {
            zzdi.zzf(this.zzf != -9223372036854775807L);
            for (zzaeh zzaehVar : this.zzb) {
                zzaehVar.zzs(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j2;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
