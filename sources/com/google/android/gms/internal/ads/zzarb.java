package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzarb {
    public static double zza(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i10 = bArr[0] << Ascii.CAN;
        int i11 = bArr[1] << Ascii.DLE;
        int i12 = bArr[2] << 8;
        return ((((i10 & ViewCompat.MEASURED_STATE_MASK) | (i11 & 16711680)) | (65280 & i12)) | (bArr[3] & UByte.MAX_VALUE)) / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i10 = bArr[0] << Ascii.CAN;
        int i11 = bArr[1] << Ascii.DLE;
        int i12 = bArr[2] << 8;
        return ((((i10 & ViewCompat.MEASURED_STATE_MASK) | (i11 & 16711680)) | (65280 & i12)) | (bArr[3] & UByte.MAX_VALUE)) / 65536.0d;
    }

    public static int zzc(byte b3) {
        return b3 < 0 ? b3 + 256 : b3;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j3 = byteBuffer.getInt();
        return j3 < 0 ? j3 + 4294967296L : j3;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long zze = zze(byteBuffer) << 32;
        if (zze >= 0) {
            return zze(byteBuffer) + zze;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
