package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
public final class zzaoo implements zzaoc {
    private zzafa zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzfu zza = new zzfu(10);
    private long zzd = C.TIME_UNSET;

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        zzeq.zzb(this.zzb);
        if (!this.zzc) {
            return;
        }
        int zzb = zzfuVar.zzb();
        int i9 = this.zzf;
        if (i9 < 10) {
            int min = Math.min(zzb, 10 - i9);
            System.arraycopy(zzfuVar.zzM(), zzfuVar.zzd(), this.zza.zzM(), this.zzf, min);
            if (this.zzf + min == 10) {
                this.zza.zzK(0);
                if (this.zza.zzm() == 73 && this.zza.zzm() == 68 && this.zza.zzm() == 51) {
                    this.zza.zzL(3);
                    this.zze = this.zza.zzl() + 10;
                } else {
                    zzfk.zzf("Id3Reader", "Discarding invalid ID3 tag");
                    this.zzc = false;
                    return;
                }
            }
        }
        int min2 = Math.min(zzb, this.zze - this.zzf);
        this.zzb.zzq(zzfuVar, min2);
        this.zzf += min2;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        zzafa zzw = zzadxVar.zzw(zzapoVar.zza(), 5);
        this.zzb = zzw;
        zzal zzalVar = new zzal();
        zzalVar.zzK(zzapoVar.zzb());
        zzalVar.zzX(MimeTypes.APPLICATION_ID3);
        zzw.zzl(zzalVar.zzad());
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
        int i9;
        boolean z8;
        zzeq.zzb(this.zzb);
        if (this.zzc && (i9 = this.zze) != 0 && this.zzf == i9) {
            if (this.zzd != C.TIME_UNSET) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzeq.zzf(z8);
            this.zzb.zzs(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        if ((i9 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j7;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzc = false;
        this.zzd = C.TIME_UNSET;
    }
}
