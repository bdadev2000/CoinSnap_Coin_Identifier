package com.google.android.gms.internal.ads;

import Q7.n0;
import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class zzaql {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair zzc(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair zzf = zzf(randomAccessFile, 0);
        if (zzf != null) {
            return zzf;
        }
        return zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j7) {
        zzg(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j7 >= 0 && j7 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j7);
            return;
        }
        throw new IllegalArgumentException(n0.g(j7, "uint32 value of out range: "));
    }

    private static long zze(ByteBuffer byteBuffer, int i9) {
        return byteBuffer.getInt(i9) & 4294967295L;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i9) throws IOException {
        int i10;
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i9, (-22) + length)) + 22);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            zzg(allocate);
            int capacity2 = allocate.capacity();
            if (capacity2 >= 22) {
                int i11 = capacity2 - 22;
                int min = Math.min(i11, 65535);
                for (int i12 = 0; i12 < min; i12++) {
                    i10 = i11 - i12;
                    if (allocate.getInt(i10) == 101010256 && ((char) allocate.getShort(i10 + 20)) == i12) {
                        break;
                    }
                }
            }
            i10 = -1;
            if (i10 != -1) {
                allocate.position(i10);
                ByteBuffer slice = allocate.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(slice, Long.valueOf(capacity + i10));
            }
            return null;
        }
        return null;
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
