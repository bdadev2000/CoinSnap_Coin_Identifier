package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class zzjm {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName(C.ASCII_NAME);
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zzio.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static int zza(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public static int zza(int i9, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i9 = (i9 * 31) + bArr[i12];
        }
        return i9;
    }

    public static <T> T zza(T t9) {
        t9.getClass();
        return t9;
    }

    public static <T> T zza(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(str);
    }

    public static boolean zza(zzkt zzktVar) {
        boolean z8 = zzktVar instanceof zzhs;
        return false;
    }
}
