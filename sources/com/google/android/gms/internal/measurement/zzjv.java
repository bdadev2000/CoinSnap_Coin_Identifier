package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzjv {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName(C.ASCII_NAME);
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zziw.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static <T> T zza(T t5) {
        t5.getClass();
        return t5;
    }

    public static <T> T zza(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }

    public static boolean zza(zzlc zzlcVar) {
        if (!(zzlcVar instanceof zzic)) {
            return false;
        }
        return false;
    }
}
