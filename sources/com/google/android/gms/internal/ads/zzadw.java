package com.google.android.gms.internal.ads;

import com.android.volley.DefaultRetryPolicy;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;

/* loaded from: classes.dex */
public final class zzadw {
    public static int zza(byte[] bArr) {
        return (bArr[10] & UnsignedBytes.MAX_VALUE) | ((bArr[11] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i2;
        if ((byteBuffer.get(5) & 2) == 0) {
            i2 = 0;
        } else {
            byte b2 = byteBuffer.get(26);
            int i3 = 28;
            int i4 = 28;
            for (int i5 = 0; i5 < b2; i5++) {
                i4 += byteBuffer.get(i5 + 27);
            }
            byte b3 = byteBuffer.get(i4 + 26);
            for (int i6 = 0; i6 < b3; i6++) {
                i3 += byteBuffer.get(i4 + 27 + i6);
            }
            i2 = i4 + i3;
        }
        int i7 = byteBuffer.get(i2 + 26) + 27 + i2;
        return (int) ((zzg(byteBuffer.get(i7), byteBuffer.limit() - i7 > 1 ? byteBuffer.get(i7 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zze(byte[] bArr) {
        long zza = zza(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzi(zzh(zza)));
        arrayList.add(zzi(zzh(3840L)));
        return arrayList;
    }

    public static boolean zzf(long j2, long j3) {
        return j2 - j3 <= zzh(3840L) / 1000;
    }

    private static long zzg(byte b2, byte b3) {
        int i2;
        int i3 = b2 & UnsignedBytes.MAX_VALUE;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i2 = 2;
            if (i4 != 1 && i4 != 2) {
                i2 = b3 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i2 = 1;
        }
        int i5 = i3 >> 3;
        return i2 * (i5 >= 16 ? DefaultRetryPolicy.DEFAULT_TIMEOUT_MS << r6 : i5 >= 12 ? 10000 << (i5 & 1) : (i5 & 3) == 3 ? 60000 : 10000 << r6);
    }

    private static long zzh(long j2) {
        return (j2 * 1000000000) / 48000;
    }

    private static byte[] zzi(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }
}
