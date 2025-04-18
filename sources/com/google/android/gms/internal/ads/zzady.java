package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzady {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzadx zzadxVar, @Nullable zzadw zzadwVar) {
        if (this.zzc > 0) {
            zzadxVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzadwVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzadx zzadxVar, long j3, int i10, int i11, int i12, @Nullable zzadw zzadwVar) {
        boolean z10;
        if (this.zzg <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzg(z10, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j3;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zza(zzadxVar, zzadwVar);
            }
        }
    }

    public final void zzd(zzacs zzacsVar) throws IOException {
        if (!this.zzb) {
            zzacsVar.zzh(this.zza, 0, 10);
            zzacsVar.zzj();
            byte[] bArr = this.zza;
            int i10 = zzabr.zza;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.zzb = true;
            }
        }
    }
}
