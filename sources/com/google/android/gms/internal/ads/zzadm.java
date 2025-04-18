package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzadm {
    public static int zza(byte[] bArr) {
        return (bArr[10] & UByte.MAX_VALUE) | ((bArr[11] & UByte.MAX_VALUE) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i10;
        byte b3 = 0;
        if ((byteBuffer.get(5) & 2) == 0) {
            i10 = 0;
        } else {
            byte b10 = byteBuffer.get(26);
            int i11 = 28;
            int i12 = 28;
            for (int i13 = 0; i13 < b10; i13++) {
                i12 += byteBuffer.get(i13 + 27);
            }
            byte b11 = byteBuffer.get(i12 + 26);
            for (int i14 = 0; i14 < b11; i14++) {
                i11 += byteBuffer.get(i12 + 27 + i14);
            }
            i10 = i12 + i11;
        }
        int i15 = byteBuffer.get(i10 + 26) + Ascii.ESC + i10;
        byte b12 = byteBuffer.get(i15);
        if (byteBuffer.limit() - i15 > 1) {
            b3 = byteBuffer.get(i15 + 1);
        }
        return (int) ((zzg(b12, b3) * 48000) / 1000000);
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

    public static boolean zzf(long j3, long j10) {
        return j3 - j10 <= zzh(3840L) / 1000;
    }

    private static long zzg(byte b3, byte b10) {
        int i10;
        int i11 = b3 & UByte.MAX_VALUE;
        int i12 = i11 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b10 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << r0 : i13 >= 12 ? 10000 << (r0 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r0);
    }

    private static long zzh(long j3) {
        return (j3 * C.NANOS_PER_SECOND) / 48000;
    }

    private static byte[] zzi(long j3) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j3).array();
    }
}
