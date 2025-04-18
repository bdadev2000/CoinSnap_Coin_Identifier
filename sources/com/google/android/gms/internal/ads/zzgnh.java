package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
abstract class zzgnh {
    int[] zza;
    private final int zzb;

    public zzgnh(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgnf.zze(bArr);
        this.zzb = i2;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i2);

    public final ByteBuffer zzc(byte[] bArr, int i2) {
        int[] zzb = zzb(zzgnf.zze(bArr), i2);
        int[] iArr = (int[]) zzb.clone();
        zzgnf.zzc(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            zzb[i3] = zzb[i3] + iArr[i3];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException(d.i("The nonce length (in bytes) must be ", zza()));
        }
        int remaining = byteBuffer.remaining();
        int i2 = remaining / 64;
        for (int i3 = 0; i3 < i2 + 1; i3++) {
            ByteBuffer zzc = zzc(bArr, this.zzb + i3);
            if (i3 == i2) {
                zzgxv.zza(allocate, byteBuffer, zzc, remaining % 64);
            } else {
                zzgxv.zza(allocate, byteBuffer, zzc, 64);
            }
        }
        return allocate.array();
    }
}
