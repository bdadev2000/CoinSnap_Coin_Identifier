package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class zzbbt extends zzbbo {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbbo
    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i9 = 4;
        if (length == 1) {
            int zza = zzbbs.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i10 = 0; i10 < split.length; i10++) {
                    int zza2 = zzbbs.zza(split[i10]);
                    int i11 = (zza2 >> 16) ^ ((char) zza2);
                    byte b = (byte) i11;
                    byte b8 = (byte) (i11 >> 8);
                    int i12 = i10 + i10;
                    bArr[i12] = new byte[]{b, b8}[0];
                    bArr[i12 + 1] = b8;
                }
            } else {
                bArr = new byte[length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    int zza3 = zzbbs.zza(split[i13]);
                    bArr[i13] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArr2);
                byte[] digest = this.zzb.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i9 = length2;
                }
                byte[] bArr3 = new byte[i9];
                System.arraycopy(digest, 0, bArr3, 0, i9);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
