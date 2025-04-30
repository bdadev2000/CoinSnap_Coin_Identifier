package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaep {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i9;
        byte b = 0;
        if ((byteBuffer.get(5) & 2) == 0) {
            i9 = 0;
        } else {
            byte b8 = byteBuffer.get(26);
            int i10 = 28;
            int i11 = 28;
            for (int i12 = 0; i12 < b8; i12++) {
                i11 += byteBuffer.get(i12 + 27);
            }
            byte b9 = byteBuffer.get(i11 + 26);
            for (int i13 = 0; i13 < b9; i13++) {
                i10 += byteBuffer.get(i11 + 27 + i13);
            }
            i9 = i11 + i10;
        }
        int i14 = byteBuffer.get(i9 + 26) + Ascii.ESC + i9;
        byte b10 = byteBuffer.get(i14);
        if (byteBuffer.limit() - i14 > 1) {
            b = byteBuffer.get(i14 + 1);
        }
        return (int) ((zzg(b10, b) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        byte b = 0;
        byte b8 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b = byteBuffer.get(1);
        }
        return (int) ((zzg(b8, b) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        byte b = 0;
        byte b8 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return zzg(b8, b);
    }

    public static List zze(byte[] bArr) {
        long zza = zza(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzi(zzh(zza)));
        arrayList.add(zzi(zzh(3840L)));
        return arrayList;
    }

    public static boolean zzf(long j7, long j9) {
        return j7 - j9 <= zzh(3840L) / 1000;
    }

    private static long zzg(byte b, byte b8) {
        int i9;
        int i10 = b & 255;
        int i11 = b & 3;
        if (i11 != 0) {
            i9 = 2;
            if (i11 != 1 && i11 != 2) {
                i9 = b8 & 63;
            }
        } else {
            i9 = 1;
        }
        int i12 = i10 >> 3;
        return i9 * (i12 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << r6 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r6);
    }

    private static long zzh(long j7) {
        return (j7 * C.NANOS_PER_SECOND) / 48000;
    }

    private static byte[] zzi(long j7) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array();
    }
}
