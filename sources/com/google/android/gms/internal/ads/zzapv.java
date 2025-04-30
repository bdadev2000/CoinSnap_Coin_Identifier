package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzapv implements zzapu {
    private final zzadx zza;
    private final zzafa zzb;
    private final zzapx zzc;
    private final zzan zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzapv(zzadx zzadxVar, zzafa zzafaVar, zzapx zzapxVar, String str, int i9) throws zzch {
        this.zza = zzadxVar;
        this.zzb = zzafaVar;
        this.zzc = zzapxVar;
        int i10 = zzapxVar.zzb * zzapxVar.zze;
        int i11 = zzapxVar.zzd;
        int i12 = i10 / 8;
        if (i11 == i12) {
            int i13 = zzapxVar.zzc * i12;
            int i14 = i13 * 8;
            int max = Math.max(i12, i13 / 10);
            this.zze = max;
            zzal zzalVar = new zzal();
            zzalVar.zzX(str);
            zzalVar.zzx(i14);
            zzalVar.zzS(i14);
            zzalVar.zzP(max);
            zzalVar.zzy(zzapxVar.zzb);
            zzalVar.zzY(zzapxVar.zzc);
            zzalVar.zzR(i9);
            this.zzd = zzalVar.zzad();
            return;
        }
        throw zzch.zza("Expected block size: " + i12 + "; got: " + i11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zza(int i9, long j7) {
        this.zza.zzO(new zzaqa(this.zzc, 1, i9, j7));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zzb(long j7) {
        this.zzf = j7;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final boolean zzc(zzadv zzadvVar, long j7) throws IOException {
        int i9;
        int i10;
        long j9 = j7;
        while (j9 > 0 && (i9 = this.zzg) < (i10 = this.zze)) {
            int zza = zzaey.zza(this.zzb, zzadvVar, (int) Math.min(i10 - i9, j9), true);
            if (zza == -1) {
                j9 = 0;
            } else {
                this.zzg += zza;
                j9 -= zza;
            }
        }
        zzapx zzapxVar = this.zzc;
        int i11 = this.zzg;
        int i12 = zzapxVar.zzd;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long zzt = this.zzf + zzgd.zzt(this.zzh, 1000000L, zzapxVar.zzc, RoundingMode.FLOOR);
            int i14 = i13 * i12;
            int i15 = this.zzg - i14;
            this.zzb.zzs(zzt, 1, i14, i15, null);
            this.zzh += i13;
            this.zzg = i15;
        }
        if (j9 <= 0) {
            return true;
        }
        return false;
    }
}
