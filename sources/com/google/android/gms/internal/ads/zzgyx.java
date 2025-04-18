package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgyx {
    private final byte[] zza;

    private zzgyx(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public static zzgyx zzb(byte[] bArr) {
        if (bArr != null) {
            return new zzgyx(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgyx) {
            return Arrays.equals(((zzgyx) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & UnsignedBytes.MAX_VALUE) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return androidx.compose.foundation.text.input.a.A("Bytes(", sb.toString(), ")");
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
