package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes2.dex */
abstract class zzgnp {
    private final zzgnn zza;
    private final zzgnn zzb;

    public zzgnp(byte[] bArr) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract zzgnn zza(byte[] bArr, int i9) throws InvalidKeyException;

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i9;
        int i10;
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.zzb.zzc(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i11 = length & 15;
                if (i11 == 0) {
                    i9 = length;
                } else {
                    i9 = (length + 16) - i11;
                }
                int remaining = byteBuffer.remaining();
                int i12 = remaining % 16;
                if (i12 == 0) {
                    i10 = remaining;
                } else {
                    i10 = (remaining + 16) - i12;
                }
                int i13 = i10 + i9;
                ByteBuffer order = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i9);
                order.put(byteBuffer);
                order.position(i13);
                order.putLong(length);
                order.putLong(remaining);
                if (MessageDigest.isEqual(zzgnt.zza(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    return this.zza.zzd(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e4) {
                throw new AEADBadTagException(e4.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
