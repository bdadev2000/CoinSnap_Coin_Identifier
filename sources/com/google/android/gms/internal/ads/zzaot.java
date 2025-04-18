package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaot implements zzaos {
    private final zzade zza;
    private final zzaeh zzb;
    private final zzaov zzc;
    private final zzaf zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaot(zzade zzadeVar, zzaeh zzaehVar, zzaov zzaovVar, String str, int i2) throws zzbo {
        this.zza = zzadeVar;
        this.zzb = zzaehVar;
        this.zzc = zzaovVar;
        int i3 = zzaovVar.zzb * zzaovVar.zze;
        int i4 = zzaovVar.zzd;
        int i5 = i3 / 8;
        if (i4 != i5) {
            throw zzbo.zza("Expected block size: " + i5 + "; got: " + i4, null);
        }
        int i6 = zzaovVar.zzc * i5;
        int i7 = i6 * 8;
        int max = Math.max(i5, i6 / 10);
        this.zze = max;
        zzad zzadVar = new zzad();
        zzadVar.zzZ(str);
        zzadVar.zzy(i7);
        zzadVar.zzU(i7);
        zzadVar.zzQ(max);
        zzadVar.zzz(zzaovVar.zzb);
        zzadVar.zzaa(zzaovVar.zzc);
        zzadVar.zzT(i2);
        this.zzd = zzadVar.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zza(int i2, long j2) {
        this.zza.zzO(new zzaoy(this.zzc, 1, i2, j2));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zzb(long j2) {
        this.zzf = j2;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final boolean zzc(zzadc zzadcVar, long j2) throws IOException {
        int i2;
        int i3;
        long j3 = j2;
        while (j3 > 0 && (i2 = this.zzg) < (i3 = this.zze)) {
            int zzf = this.zzb.zzf(zzadcVar, (int) Math.min(i3 - i2, j3), true);
            if (zzf == -1) {
                j3 = 0;
            } else {
                this.zzg += zzf;
                j3 -= zzf;
            }
        }
        zzaov zzaovVar = this.zzc;
        int i4 = this.zzg;
        int i5 = zzaovVar.zzd;
        int i6 = i4 / i5;
        if (i6 > 0) {
            long zzt = this.zzf + zzeu.zzt(this.zzh, 1000000L, zzaovVar.zzc, RoundingMode.FLOOR);
            int i7 = i6 * i5;
            int i8 = this.zzg - i7;
            this.zzb.zzs(zzt, 1, i7, i8, null);
            this.zzh += i6;
            this.zzg = i8;
        }
        return j3 <= 0;
    }
}
