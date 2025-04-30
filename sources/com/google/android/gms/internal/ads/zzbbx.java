package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class zzbbx extends zzbbo {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbbx(int i9) {
        int i10 = i9 >> 3;
        this.zzc = (i9 & 7) > 0 ? i10 + 1 : i10;
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzbbo
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest zza = zza();
                this.zzb = zza;
                if (zza == null) {
                    return new byte[0];
                }
                zza.reset();
                this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.zzb.digest();
                int length = digest.length;
                int i9 = this.zzc;
                if (length > i9) {
                    length = i9;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                if ((this.zzd & 7) > 0) {
                    long j7 = 0;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 > 0) {
                            j7 <<= 8;
                        }
                        j7 += bArr[i10] & 255;
                    }
                    long j9 = j7 >>> (8 - (this.zzd & 7));
                    int i11 = this.zzc;
                    while (true) {
                        i11--;
                        if (i11 < 0) {
                            break;
                        }
                        bArr[i11] = (byte) (255 & j9);
                        j9 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
