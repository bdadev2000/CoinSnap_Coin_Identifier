package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzaod {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;

    public zzaod(int i9) {
    }

    public final void zza(byte[] bArr, int i9, int i10) {
        if (!this.zze) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.zzc;
        int length = bArr2.length;
        int i12 = this.zza + i11;
        if (length < i12) {
            this.zzc = Arrays.copyOf(bArr2, i12 + i12);
        }
        System.arraycopy(bArr, i9, this.zzc, this.zza, i11);
        this.zza += i11;
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzc(int i9, int i10) {
        if (this.zze) {
            int i11 = this.zza - i10;
            this.zza = i11;
            if (this.zzb == 0 && i9 == 181) {
                this.zzb = i11;
            } else {
                this.zze = false;
                return true;
            }
        } else if (i9 == 179) {
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
