package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class zzamw implements zzamm {
    private zzadx zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzed zza = new zzed(10);
    private long zzd = C.TIME_UNSET;

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        zzdb.zzb(this.zzb);
        if (!this.zzc) {
            return;
        }
        int zzb = zzedVar.zzb();
        int i10 = this.zzf;
        if (i10 < 10) {
            int min = Math.min(zzb, 10 - i10);
            System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), this.zza.zzN(), this.zzf, min);
            if (this.zzf + min == 10) {
                this.zza.zzL(0);
                if (this.zza.zzm() == 73 && this.zza.zzm() == 68 && this.zza.zzm() == 51) {
                    this.zza.zzM(3);
                    this.zze = this.zza.zzl() + 10;
                } else {
                    zzdt.zzf("Id3Reader", "Discarding invalid ID3 tag");
                    this.zzc = false;
                    return;
                }
            }
        }
        int min2 = Math.min(zzb, this.zze - this.zzf);
        this.zzb.zzq(zzedVar, min2);
        this.zzf += min2;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        zzadx zzw = zzacuVar.zzw(zzaoaVar.zza(), 5);
        this.zzb = zzw;
        zzab zzabVar = new zzab();
        zzabVar.zzL(zzaoaVar.zzb());
        zzabVar.zzZ(MimeTypes.APPLICATION_ID3);
        zzw.zzl(zzabVar.zzaf());
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
        int i10;
        boolean z11;
        zzdb.zzb(this.zzb);
        if (this.zzc && (i10 = this.zze) != 0 && this.zzf == i10) {
            if (this.zzd != C.TIME_UNSET) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdb.zzf(z11);
            this.zzb.zzs(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j3;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzc = false;
        this.zzd = C.TIME_UNSET;
    }
}
