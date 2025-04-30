package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
abstract class zzgnn {
    int[] zza;
    private final int zzb;

    public zzgnn(byte[] bArr, int i9) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzgnj.zze(bArr);
            this.zzb = i9;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i9);

    public final ByteBuffer zzc(byte[] bArr, int i9) {
        int[] zzb = zzb(zzgnj.zze(bArr), i9);
        int[] iArr = (int[]) zzb.clone();
        zzgnj.zzc(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            zzb[i10] = zzb[i10] + iArr[i10];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == zza()) {
            int remaining = byteBuffer.remaining();
            int i9 = remaining / 64;
            for (int i10 = 0; i10 < i9 + 1; i10++) {
                ByteBuffer zzc = zzc(bArr, this.zzb + i10);
                if (i10 == i9) {
                    zzgyd.zza(allocate, byteBuffer, zzc, remaining % 64);
                } else {
                    zzgyd.zza(allocate, byteBuffer, zzc, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException(o.h(zza(), "The nonce length (in bytes) must be "));
    }
}
