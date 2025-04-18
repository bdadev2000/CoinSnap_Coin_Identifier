package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import eb.j;

/* loaded from: classes3.dex */
final class zzafc extends zzafb {
    private final zzed zzb;
    private final zzed zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafc(zzadx zzadxVar) {
        super(zzadxVar);
        this.zzb = new zzed(zzfp.zza);
        this.zzc = new zzed(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean zza(zzed zzedVar) throws zzafa {
        int zzm = zzedVar.zzm();
        int i10 = zzm >> 4;
        int i11 = zzm & 15;
        if (i11 == 7) {
            this.zzg = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new zzafa(j.i("Video format not supported: ", i11));
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean zzb(zzed zzedVar, long j3) throws zzbh {
        int i10;
        int i11;
        int zzm = zzedVar.zzm();
        long zzh = zzedVar.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzed zzedVar2 = new zzed(new byte[zzedVar.zzb()]);
                zzedVar.zzH(zzedVar2.zzN(), 0, zzedVar.zzb());
                zzabv zza = zzabv.zza(zzedVar2);
                this.zzd = zza.zzb;
                zzab zzabVar = new zzab();
                zzabVar.zzZ(MimeTypes.VIDEO_H264);
                zzabVar.zzA(zza.zzl);
                zzabVar.zzae(zza.zzc);
                zzabVar.zzJ(zza.zzd);
                zzabVar.zzV(zza.zzk);
                zzabVar.zzM(zza.zza);
                this.zza.zzl(zzabVar.zzaf());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            if (this.zzg == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.zzf) {
                if (i10 != 0) {
                    i11 = 1;
                }
            } else {
                i11 = i10;
            }
            byte[] zzN = this.zzc.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i12 = 4 - this.zzd;
            int i13 = 0;
            while (zzedVar.zzb() > 0) {
                zzedVar.zzH(this.zzc.zzN(), i12, this.zzd);
                this.zzc.zzL(0);
                zzed zzedVar3 = this.zzc;
                zzed zzedVar4 = this.zzb;
                int zzp = zzedVar3.zzp();
                zzedVar4.zzL(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzedVar, zzp);
                i13 = i13 + 4 + zzp;
            }
            this.zza.zzs((zzh * 1000) + j3, i11, i13, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
