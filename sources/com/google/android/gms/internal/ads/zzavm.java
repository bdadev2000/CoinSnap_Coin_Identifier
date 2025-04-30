package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public final class zzavm {
    private final byte[] zza = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    private int zzb;
    private int zzc;

    public zzavm(byte[] bArr) {
        for (int i9 = 0; i9 < 256; i9++) {
            this.zza[i9] = (byte) i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            byte b = bArr2[i11];
            i10 = (i10 + b + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i9 = this.zzb;
        int i10 = this.zzc;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            i9 = (i9 + 1) & 255;
            byte b = bArr2[i9];
            i10 = (i10 + b) & 255;
            bArr2[i9] = bArr2[i10];
            bArr2[i10] = b;
            bArr[i11] = (byte) (bArr2[(bArr2[i9] + b) & 255] ^ bArr[i11]);
        }
        this.zzb = i9;
        this.zzc = i10;
    }
}
