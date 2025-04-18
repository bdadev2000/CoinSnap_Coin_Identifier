package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* loaded from: classes3.dex */
public final class zzatr {
    private final byte[] zza = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    private int zzb;
    private int zzc;

    public zzatr(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.zza;
            byte b3 = bArr2[i12];
            i11 = (i11 + b3 + bArr[i12 % bArr.length]) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b3;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i10 = this.zzb;
        int i11 = this.zzc;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.zza;
            i10 = (i10 + 1) & 255;
            byte b3 = bArr2[i10];
            i11 = (i11 + b3) & 255;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b3;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b3) & 255] ^ bArr[i12]);
        }
        this.zzb = i10;
        this.zzc = i11;
    }
}
