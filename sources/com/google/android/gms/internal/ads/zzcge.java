package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcge implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    public zzcge(zzhb zzhbVar, int i9, zzhb zzhbVar2) {
        this.zza = zzhbVar;
        this.zzb = i9;
        this.zzc = zzhbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws IOException {
        int i11;
        long j7 = this.zzd;
        long j9 = this.zzb;
        if (j7 < j9) {
            int zza = this.zza.zza(bArr, i9, (int) Math.min(i10, j9 - j7));
            long j10 = this.zzd + zza;
            this.zzd = j10;
            i11 = zza;
            j7 = j10;
        } else {
            i11 = 0;
        }
        if (j7 >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i9 + i11, i10 - i11);
            int i12 = i11 + zza2;
            this.zzd += zza2;
            return i12;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws IOException {
        zzhh zzhhVar2;
        long j7;
        long j9;
        this.zze = zzhhVar.zza;
        long j10 = zzhhVar.zze;
        long j11 = this.zzb;
        zzhh zzhhVar3 = null;
        if (j10 >= j11) {
            zzhhVar2 = null;
        } else {
            long j12 = zzhhVar.zzf;
            long j13 = j11 - j10;
            if (j12 != -1) {
                j13 = Math.min(j12, j13);
            }
            zzhhVar2 = new zzhh(zzhhVar.zza, j10, j13, null);
        }
        long j14 = zzhhVar.zzf;
        if (j14 == -1 || zzhhVar.zze + j14 > this.zzb) {
            long max = Math.max(this.zzb, zzhhVar.zze);
            long j15 = zzhhVar.zzf;
            if (j15 != -1) {
                j7 = Math.min(j15, (zzhhVar.zze + j15) - this.zzb);
            } else {
                j7 = -1;
            }
            zzhhVar3 = new zzhh(zzhhVar.zza, max, j7, null);
        }
        long j16 = 0;
        if (zzhhVar2 != null) {
            j9 = this.zza.zzb(zzhhVar2);
        } else {
            j9 = 0;
        }
        if (zzhhVar3 != null) {
            j16 = this.zzc.zzb(zzhhVar3);
        }
        this.zzd = zzhhVar.zze;
        if (j9 == -1 || j16 == -1) {
            return -1L;
        }
        return j9 + j16;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        return zzgbf.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
    }
}
