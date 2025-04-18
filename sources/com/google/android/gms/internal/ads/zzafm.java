package com.google.android.gms.internal.ads;

import android.support.v4.media.d;

/* loaded from: classes.dex */
final class zzafm extends zzafl {
    private final zzek zzb;
    private final zzek zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafm(zzaeh zzaehVar) {
        super(zzaehVar);
        this.zzb = new zzek(zzfs.zza);
        this.zzc = new zzek(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zza(zzek zzekVar) throws zzafk {
        int zzm = zzekVar.zzm();
        int i2 = zzm >> 4;
        int i3 = zzm & 15;
        if (i3 != 7) {
            throw new zzafk(d.i("Video format not supported: ", i3));
        }
        this.zzg = i2;
        return i2 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zzb(zzek zzekVar, long j2) throws zzbo {
        int i2;
        int zzm = zzekVar.zzm();
        long zzh = zzekVar.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzek zzekVar2 = new zzek(new byte[zzekVar.zzb()]);
                zzekVar.zzH(zzekVar2.zzN(), 0, zzekVar.zzb());
                zzacf zza = zzacf.zza(zzekVar2);
                this.zzd = zza.zzb;
                zzad zzadVar = new zzad();
                zzadVar.zzZ("video/avc");
                zzadVar.zzA(zza.zzl);
                zzadVar.zzae(zza.zzc);
                zzadVar.zzJ(zza.zzd);
                zzadVar.zzV(zza.zzk);
                zzadVar.zzM(zza.zza);
                this.zza.zzl(zzadVar.zzaf());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            int i3 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i2 = i3;
            } else if (i3 != 0) {
                i2 = 1;
            }
            byte[] zzN = this.zzc.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i4 = 4 - this.zzd;
            int i5 = 0;
            while (zzekVar.zzb() > 0) {
                zzekVar.zzH(this.zzc.zzN(), i4, this.zzd);
                this.zzc.zzL(0);
                zzek zzekVar3 = this.zzc;
                zzek zzekVar4 = this.zzb;
                int zzp = zzekVar3.zzp();
                zzekVar4.zzL(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzekVar, zzp);
                i5 = i5 + 4 + zzp;
            }
            this.zza.zzs((zzh * 1000) + j2, i2, i5, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
