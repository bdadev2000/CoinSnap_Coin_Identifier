package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzceg implements zzgd {
    private final zzgd zza;
    private final long zzb;
    private final zzgd zzc;
    private long zzd;
    private Uri zze;

    public zzceg(zzgd zzgdVar, int i10, zzgd zzgdVar2) {
        this.zza = zzgdVar;
        this.zzb = i10;
        this.zzc = zzgdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j3 = this.zzd;
        long j10 = this.zzb;
        if (j3 < j10) {
            int zza = this.zza.zza(bArr, i10, (int) Math.min(i11, j10 - j3));
            long j11 = this.zzd + zza;
            this.zzd = j11;
            i12 = zza;
            j3 = j11;
        } else {
            i12 = 0;
        }
        if (j3 >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
            int i13 = i12 + zza2;
            this.zzd += zza2;
            return i13;
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        zzgi zzgiVar2;
        long j3;
        long j10;
        this.zze = zzgiVar.zza;
        long j11 = zzgiVar.zze;
        long j12 = this.zzb;
        zzgi zzgiVar3 = null;
        if (j11 >= j12) {
            zzgiVar2 = null;
        } else {
            long j13 = zzgiVar.zzf;
            long j14 = j12 - j11;
            if (j13 != -1) {
                j14 = Math.min(j13, j14);
            }
            zzgiVar2 = new zzgi(zzgiVar.zza, j11, j14, null);
        }
        long j15 = zzgiVar.zzf;
        if (j15 == -1 || zzgiVar.zze + j15 > this.zzb) {
            long max = Math.max(this.zzb, zzgiVar.zze);
            long j16 = zzgiVar.zzf;
            if (j16 != -1) {
                j3 = Math.min(j16, (zzgiVar.zze + j16) - this.zzb);
            } else {
                j3 = -1;
            }
            zzgiVar3 = new zzgi(zzgiVar.zza, max, j3, null);
        }
        long j17 = 0;
        if (zzgiVar2 != null) {
            j10 = this.zza.zzb(zzgiVar2);
        } else {
            j10 = 0;
        }
        if (zzgiVar3 != null) {
            j17 = this.zzc.zzb(zzgiVar3);
        }
        this.zzd = zzgiVar.zze;
        if (j10 == -1 || j17 == -1) {
            return -1L;
        }
        return j10 + j17;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        return zzfzr.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
    }
}
