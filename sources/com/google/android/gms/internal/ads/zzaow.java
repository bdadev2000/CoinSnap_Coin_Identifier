package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class zzaow {
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

    public static void zzd(ByteBuffer byteBuffer, long j3) {
        zzg(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j3 >= 0 && j3 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j3);
            return;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("uint32 value of out range: ", j3));
    }

    private static long zze(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getInt(i10) & 4294967295L;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            zzg(allocate);
            int capacity2 = allocate.capacity();
            if (capacity2 >= 22) {
                int i12 = capacity2 - 22;
                int min = Math.min(i12, 65535);
                for (int i13 = 0; i13 < min; i13++) {
                    i11 = i12 - i13;
                    if (allocate.getInt(i11) == 101010256 && ((char) allocate.getShort(i11 + 20)) == i13) {
                        break;
                    }
                }
            }
            i11 = -1;
            if (i11 != -1) {
                allocate.position(i11);
                ByteBuffer slice = allocate.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(slice, Long.valueOf(capacity + i11));
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
