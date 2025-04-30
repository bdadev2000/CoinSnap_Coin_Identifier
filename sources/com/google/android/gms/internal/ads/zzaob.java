package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaob implements zzaoc {
    private final List zza;
    private final zzafa[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = C.TIME_UNSET;

    public zzaob(List list) {
        this.zza = list;
        this.zzb = new zzafa[list.size()];
    }

    private final boolean zzf(zzfu zzfuVar, int i9) {
        if (zzfuVar.zzb() == 0) {
            return false;
        }
        if (zzfuVar.zzm() != i9) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzfuVar, 32)) {
                if (this.zzd != 1 || zzf(zzfuVar, 0)) {
                    int zzd = zzfuVar.zzd();
                    int zzb = zzfuVar.zzb();
                    for (zzafa zzafaVar : this.zzb) {
                        zzfuVar.zzK(zzd);
                        zzafaVar.zzq(zzfuVar, zzb);
                    }
                    this.zze += zzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        for (int i9 = 0; i9 < this.zzb.length; i9++) {
            zzapl zzaplVar = (zzapl) this.zza.get(i9);
            zzapoVar.zzc();
            zzafa zzw = zzadxVar.zzw(zzapoVar.zza(), 3);
            zzal zzalVar = new zzal();
            zzalVar.zzK(zzapoVar.zzb());
            zzalVar.zzX(MimeTypes.APPLICATION_DVBSUBS);
            zzalVar.zzL(Collections.singletonList(zzaplVar.zzb));
            zzalVar.zzO(zzaplVar.zza);
            zzw.zzl(zzalVar.zzad());
            this.zzb[i9] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
        boolean z8;
        if (this.zzc) {
            if (this.zzf != C.TIME_UNSET) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzeq.zzf(z8);
            for (zzafa zzafaVar : this.zzb) {
                zzafaVar.zzs(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        if ((i9 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j7;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzc = false;
        this.zzf = C.TIME_UNSET;
    }
}
