package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcek implements zzgg {
    private final zzgg zza;
    private final long zzb;
    private final zzgg zzc;
    private long zzd;
    private Uri zze;

    public zzcek(zzgg zzggVar, int i2, zzgg zzggVar2) {
        this.zza = zzggVar;
        this.zzb = i2;
        this.zzc = zzggVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long j2 = this.zzd;
        long j3 = this.zzb;
        if (j2 < j3) {
            int zza = this.zza.zza(bArr, i2, (int) Math.min(i3, j3 - j2));
            long j4 = this.zzd + zza;
            this.zzd = j4;
            i4 = zza;
            j2 = j4;
        } else {
            i4 = 0;
        }
        if (j2 < this.zzb) {
            return i4;
        }
        int zza2 = this.zzc.zza(bArr, i2 + i4, i3 - i4);
        int i5 = i4 + zza2;
        this.zzd += zza2;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(zzgm zzgmVar) throws IOException {
        zzgm zzgmVar2;
        this.zze = zzgmVar.zza;
        long j2 = zzgmVar.zze;
        long j3 = this.zzb;
        zzgm zzgmVar3 = null;
        if (j2 >= j3) {
            zzgmVar2 = null;
        } else {
            long j4 = zzgmVar.zzf;
            long j5 = j3 - j2;
            if (j4 != -1) {
                j5 = Math.min(j4, j5);
            }
            zzgmVar2 = new zzgm(zzgmVar.zza, j2, j5, null);
        }
        long j6 = zzgmVar.zzf;
        if (j6 == -1 || zzgmVar.zze + j6 > this.zzb) {
            long max = Math.max(this.zzb, zzgmVar.zze);
            long j7 = zzgmVar.zzf;
            zzgmVar3 = new zzgm(zzgmVar.zza, max, j7 != -1 ? Math.min(j7, (zzgmVar.zze + j7) - this.zzb) : -1L, null);
        }
        long zzb = zzgmVar2 != null ? this.zza.zzb(zzgmVar2) : 0L;
        long zzb2 = zzgmVar3 != null ? this.zzc.zzb(zzgmVar3) : 0L;
        this.zzd = zzgmVar.zze;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final Map zze() {
        return zzgba.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzf(zzhh zzhhVar) {
    }
}
