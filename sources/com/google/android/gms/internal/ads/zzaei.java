package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzaei {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzaeh zzaehVar, @Nullable zzaeg zzaegVar) {
        if (this.zzc > 0) {
            zzaehVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzaegVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzaeh zzaehVar, long j2, int i2, int i3, int i4, @Nullable zzaeg zzaegVar) {
        zzdi.zzg(this.zzg <= i3 + i4, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i5 = this.zzc;
            int i6 = i5 + 1;
            this.zzc = i6;
            if (i5 == 0) {
                this.zzd = j2;
                this.zze = i2;
                this.zzf = 0;
            }
            this.zzf += i3;
            this.zzg = i4;
            if (i6 >= 16) {
                zza(zzaehVar, zzaegVar);
            }
        }
    }

    public final void zzd(zzadc zzadcVar) throws IOException {
        if (this.zzb) {
            return;
        }
        zzadcVar.zzh(this.zza, 0, 10);
        zzadcVar.zzj();
        byte[] bArr = this.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
