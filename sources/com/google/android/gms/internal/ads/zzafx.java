package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzafx implements zzadd {
    private final zzaeg zza;
    private final int zzb;
    private final zzaeb zzc = new zzaeb();

    public /* synthetic */ zzafx(zzaeg zzaegVar, int i9, zzafw zzafwVar) {
        this.zza = zzaegVar;
        this.zzb = i9;
    }

    private final long zzc(zzadv zzadvVar) throws IOException {
        while (zzadvVar.zze() < zzadvVar.zzd() - 6) {
            zzaeg zzaegVar = this.zza;
            int i9 = this.zzb;
            zzaeb zzaebVar = this.zzc;
            long zze = zzadvVar.zze();
            byte[] bArr = new byte[2];
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i9) {
                zzadvVar.zzj();
                zzadiVar.zzl((int) (zze - zzadvVar.zzf()), false);
            } else {
                zzfu zzfuVar = new zzfu(16);
                System.arraycopy(bArr, 0, zzfuVar.zzM(), 0, 2);
                zzfuVar.zzJ(zzady.zza(zzadvVar, zzfuVar.zzM(), 2, 14));
                zzadvVar.zzj();
                zzadiVar.zzl((int) (zze - zzadvVar.zzf()), false);
                if (zzaec.zzc(zzfuVar, zzaegVar, i9, zzaebVar)) {
                    break;
                }
            }
            zzadiVar.zzl(1, false);
        }
        if (zzadvVar.zze() >= zzadvVar.zzd() - 6) {
            ((zzadi) zzadvVar).zzl((int) (zzadvVar.zzd() - zzadvVar.zze()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final zzadc zza(zzadv zzadvVar, long j7) throws IOException {
        int i9 = this.zza.zzc;
        long zzf = zzadvVar.zzf();
        long zzc = zzc(zzadvVar);
        long zze = zzadvVar.zze();
        ((zzadi) zzadvVar).zzl(Math.max(6, i9), false);
        long zzc2 = zzc(zzadvVar);
        long zze2 = zzadvVar.zze();
        if (zzc <= j7 && zzc2 > j7) {
            return zzadc.zze(zze);
        }
        if (zzc2 <= j7) {
            return zzadc.zzf(zzc2, zze2);
        }
        return zzadc.zzd(zzc, zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final /* synthetic */ void zzb() {
    }
}
