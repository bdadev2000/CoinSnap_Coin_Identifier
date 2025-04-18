package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzgwu {
    private final byte[] zza;

    private zzgwu(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zzgwu zzb(byte[] bArr) {
        if (bArr != null) {
            return new zzgwu(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgwu)) {
            return false;
        }
        return Arrays.equals(((zzgwu) obj).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b3 : bArr) {
            int i10 = b3 & UByte.MAX_VALUE;
            sb2.append("0123456789abcdef".charAt(i10 >> 4));
            sb2.append("0123456789abcdef".charAt(i10 & 15));
        }
        return e.f("Bytes(", sb2.toString(), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
