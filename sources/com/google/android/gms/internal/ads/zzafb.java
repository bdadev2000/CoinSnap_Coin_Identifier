package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzafb {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzafa zzafaVar, @Nullable zzaez zzaezVar) {
        if (this.zzc > 0) {
            zzafaVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzaezVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzafa zzafaVar, long j7, int i9, int i10, int i11, @Nullable zzaez zzaezVar) {
        boolean z8;
        if (this.zzg <= i10 + i11) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzg(z8, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i12 = this.zzc;
            int i13 = i12 + 1;
            this.zzc = i13;
            if (i12 == 0) {
                this.zzd = j7;
                this.zze = i9;
                this.zzf = 0;
            }
            this.zzf += i10;
            this.zzg = i11;
            if (i13 >= 16) {
                zza(zzafaVar, zzaezVar);
            }
        }
    }

    public final void zzd(zzadv zzadvVar) throws IOException {
        if (!this.zzb) {
            zzadvVar.zzh(this.zza, 0, 10);
            zzadvVar.zzj();
            byte[] bArr = this.zza;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.zzb = true;
            }
        }
    }
}
