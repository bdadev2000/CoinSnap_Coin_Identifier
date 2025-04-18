package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class zzbab extends zzazw {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzazw
    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i2 = 4;
        if (length == 1) {
            int zza = zzbaa.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i3 = 0; i3 < split.length; i3++) {
                    int zza2 = zzbaa.zza(split[i3]);
                    int i4 = (zza2 >> 16) ^ ((char) zza2);
                    int i5 = i3 + i3;
                    bArr[i5] = (byte) i4;
                    bArr[i5 + 1] = (byte) (i4 >> 8);
                }
            } else {
                bArr = new byte[length];
                for (int i6 = 0; i6 < split.length; i6++) {
                    int zza3 = zzbaa.zza(split[i6]);
                    bArr[i6] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
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
                    i2 = length2;
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(digest, 0, bArr3, 0, i2);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
