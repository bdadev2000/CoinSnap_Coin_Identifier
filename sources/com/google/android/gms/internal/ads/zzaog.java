package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class zzaog implements zzaof {
    private final zzacu zza;
    private final zzadx zzb;
    private final zzaoi zzc;
    private final zzad zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaog(zzacu zzacuVar, zzadx zzadxVar, zzaoi zzaoiVar, String str, int i10) throws zzbh {
        this.zza = zzacuVar;
        this.zzb = zzadxVar;
        this.zzc = zzaoiVar;
        int i11 = zzaoiVar.zzb * zzaoiVar.zze;
        int i12 = zzaoiVar.zzd;
        int i13 = i11 / 8;
        if (i12 == i13) {
            int i14 = zzaoiVar.zzc * i13;
            int i15 = i14 * 8;
            int max = Math.max(i13, i14 / 10);
            this.zze = max;
            zzab zzabVar = new zzab();
            zzabVar.zzZ(str);
            zzabVar.zzy(i15);
            zzabVar.zzU(i15);
            zzabVar.zzQ(max);
            zzabVar.zzz(zzaoiVar.zzb);
            zzabVar.zzaa(zzaoiVar.zzc);
            zzabVar.zzT(i10);
            this.zzd = zzabVar.zzaf();
            return;
        }
        throw zzbh.zza("Expected block size: " + i13 + "; got: " + i12, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zza(int i10, long j3) {
        this.zza.zzO(new zzaol(this.zzc, 1, i10, j3));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zzb(long j3) {
        this.zzf = j3;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final boolean zzc(zzacs zzacsVar, long j3) throws IOException {
        int i10;
        int i11;
        long j10 = j3;
        while (j10 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int zzf = this.zzb.zzf(zzacsVar, (int) Math.min(i11 - i10, j10), true);
            if (zzf == -1) {
                j10 = 0;
            } else {
                this.zzg += zzf;
                j10 -= zzf;
            }
        }
        zzaoi zzaoiVar = this.zzc;
        int i12 = this.zzg;
        int i13 = zzaoiVar.zzd;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long zzu = this.zzf + zzen.zzu(this.zzh, 1000000L, zzaoiVar.zzc, RoundingMode.FLOOR);
            int i15 = i14 * i13;
            int i16 = this.zzg - i15;
            this.zzb.zzs(zzu, 1, i15, i16, null);
            this.zzh += i14;
            this.zzg = i16;
        }
        if (j10 <= 0) {
            return true;
        }
        return false;
    }
}
