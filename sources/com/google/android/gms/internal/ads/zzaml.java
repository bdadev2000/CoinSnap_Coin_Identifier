package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaml implements zzamm {
    private final List zza;
    private final zzadx[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = C.TIME_UNSET;

    public zzaml(List list) {
        this.zza = list;
        this.zzb = new zzadx[list.size()];
    }

    private final boolean zzf(zzed zzedVar, int i10) {
        if (zzedVar.zzb() == 0) {
            return false;
        }
        if (zzedVar.zzm() != i10) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzedVar, 32)) {
                if (this.zzd != 1 || zzf(zzedVar, 0)) {
                    int zzd = zzedVar.zzd();
                    int zzb = zzedVar.zzb();
                    for (zzadx zzadxVar : this.zzb) {
                        zzedVar.zzL(zzd);
                        zzadxVar.zzq(zzedVar, zzb);
                    }
                    this.zze += zzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzanx zzanxVar = (zzanx) this.zza.get(i10);
            zzaoaVar.zzc();
            zzadx zzw = zzacuVar.zzw(zzaoaVar.zza(), 3);
            zzab zzabVar = new zzab();
            zzabVar.zzL(zzaoaVar.zzb());
            zzabVar.zzZ(MimeTypes.APPLICATION_DVBSUBS);
            zzabVar.zzM(Collections.singletonList(zzanxVar.zzb));
            zzabVar.zzP(zzanxVar.zza);
            zzw.zzl(zzabVar.zzaf());
            this.zzb[i10] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
        boolean z11;
        if (this.zzc) {
            if (this.zzf != C.TIME_UNSET) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdb.zzf(z11);
            for (zzadx zzadxVar : this.zzb) {
                zzadxVar.zzs(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j3;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzc = false;
        this.zzf = C.TIME_UNSET;
    }
}
