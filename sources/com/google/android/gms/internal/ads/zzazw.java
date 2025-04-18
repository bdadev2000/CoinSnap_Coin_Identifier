package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzazw extends zzazn {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzazw(int i10) {
        int i11 = i10 >> 3;
        this.zzc = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzazn
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            MessageDigest zza = zza();
            this.zzb = zza;
            if (zza == null) {
                return new byte[0];
            }
            zza.reset();
            this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.zzb.digest();
            int length = digest.length;
            int i10 = this.zzc;
            if (length > i10) {
                length = i10;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if ((this.zzd & 7) > 0) {
                long j3 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (i11 > 0) {
                        j3 <<= 8;
                    }
                    j3 += bArr[i11] & UByte.MAX_VALUE;
                }
                long j10 = j3 >>> (8 - (this.zzd & 7));
                int i12 = this.zzc;
                while (true) {
                    i12--;
                    if (i12 < 0) {
                        break;
                    }
                    bArr[i12] = (byte) (255 & j10);
                    j10 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
