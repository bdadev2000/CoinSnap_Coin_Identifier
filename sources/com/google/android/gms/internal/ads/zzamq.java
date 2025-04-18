package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzamq implements zzadb {
    private final zzamr zza = new zzamr(null, 0);
    private final zzek zzb = new zzek(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        int zza = zzadcVar.zza(this.zzb.zzN(), 0, 2786);
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return zzgax.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        this.zza.zzb(zzadeVar, new zzaon(Integer.MIN_VALUE, 0, 1));
        zzadeVar.zzD();
        zzadeVar.zzO(new zzadz(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        zzek zzekVar = new zzek(10);
        int i2 = 0;
        while (true) {
            zzacq zzacqVar = (zzacq) zzadcVar;
            zzacqVar.zzm(zzekVar.zzN(), 0, 10, false);
            zzekVar.zzL(0);
            if (zzekVar.zzo() != 4801587) {
                break;
            }
            zzekVar.zzM(3);
            int zzl = zzekVar.zzl();
            i2 += zzl + 10;
            zzacqVar.zzl(zzl, false);
        }
        zzadcVar.zzj();
        zzacq zzacqVar2 = (zzacq) zzadcVar;
        zzacqVar2.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            zzacqVar2.zzm(zzekVar.zzN(), 0, 6, false);
            zzekVar.zzL(0);
            if (zzekVar.zzq() != 2935) {
                zzadcVar.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzacqVar2.zzl(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int zzb = zzacb.zzb(zzekVar.zzN());
                if (zzb == -1) {
                    return false;
                }
                zzacqVar2.zzl(zzb - 6, false);
            }
        }
    }
}
