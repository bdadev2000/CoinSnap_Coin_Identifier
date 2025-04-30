package com.google.android.gms.internal.play_billing;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class zzda {
    static final Charset zza = Charset.forName(C.ASCII_NAME);
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzbu zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzbs zzbsVar = new zzbs(bArr, 0, 0, false, null);
        try {
            zzbsVar.zza(0);
            zzf = zzbsVar;
        } catch (zzdc e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int zza(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int zzb(int i9, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            i9 = (i9 * 31) + bArr[i12];
        }
        return i9;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
