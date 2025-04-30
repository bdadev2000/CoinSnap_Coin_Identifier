package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzaor {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzaor(int i9, int i10) {
        this.zzc = i9;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza(byte[] bArr, int i9, int i10) {
        if (!this.zzd) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.zza;
        int length = bArr2.length;
        int i12 = this.zzb + i11;
        if (length < i12) {
            this.zza = Arrays.copyOf(bArr2, i12 + i12);
        }
        System.arraycopy(bArr, i9, this.zza, this.zzb, i11);
        this.zzb += i11;
    }

    public final void zzb() {
        this.zzd = false;
        this.zze = false;
    }

    public final void zzc(int i9) {
        boolean z8 = true;
        zzeq.zzf(!this.zzd);
        if (i9 != this.zzc) {
            z8 = false;
        }
        this.zzd = z8;
        if (z8) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final boolean zzd(int i9) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i9;
        this.zzd = false;
        this.zze = true;
        return true;
    }

    public final boolean zze() {
        return this.zze;
    }
}
