package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
final class zzagh extends zzagg {
    private final zzfu zzb;
    private final zzfu zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzagh(zzafa zzafaVar) {
        super(zzafaVar);
        this.zzb = new zzfu(zzgr.zza);
        this.zzc = new zzfu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean zza(zzfu zzfuVar) throws zzagf {
        int zzm = zzfuVar.zzm();
        int i9 = zzm >> 4;
        int i10 = zzm & 15;
        if (i10 == 7) {
            this.zzg = i9;
            if (i9 != 5) {
                return true;
            }
            return false;
        }
        throw new zzagf(o.h(i10, "Video format not supported: "));
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean zzb(zzfu zzfuVar, long j7) throws zzch {
        int i9;
        int i10;
        int zzm = zzfuVar.zzm();
        long zzh = zzfuVar.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzfu zzfuVar2 = new zzfu(new byte[zzfuVar.zzb()]);
                zzfuVar.zzG(zzfuVar2.zzM(), 0, zzfuVar.zzb());
                zzacx zza = zzacx.zza(zzfuVar2);
                this.zzd = zza.zzb;
                zzal zzalVar = new zzal();
                zzalVar.zzX(MimeTypes.VIDEO_H264);
                zzalVar.zzz(zza.zzk);
                zzalVar.zzac(zza.zzc);
                zzalVar.zzI(zza.zzd);
                zzalVar.zzT(zza.zzj);
                zzalVar.zzL(zza.zza);
                this.zza.zzl(zzalVar.zzad());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            if (this.zzg == 1) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (!this.zzf) {
                if (i9 != 0) {
                    i10 = 1;
                }
            } else {
                i10 = i9;
            }
            byte[] zzM = this.zzc.zzM();
            zzM[0] = 0;
            zzM[1] = 0;
            zzM[2] = 0;
            int i11 = 4 - this.zzd;
            int i12 = 0;
            while (zzfuVar.zzb() > 0) {
                zzfuVar.zzG(this.zzc.zzM(), i11, this.zzd);
                this.zzc.zzK(0);
                zzfu zzfuVar3 = this.zzc;
                zzfu zzfuVar4 = this.zzb;
                int zzp = zzfuVar3.zzp();
                zzfuVar4.zzK(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzfuVar, zzp);
                i12 = i12 + 4 + zzp;
            }
            this.zza.zzs((zzh * 1000) + j7, i10, i12, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
