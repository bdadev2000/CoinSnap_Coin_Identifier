package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes4.dex */
public final class zzgdh {
    static {
        new zzgdf();
    }

    public static InputStream zza(InputStream inputStream, long j2) {
        return new zzgdg(inputStream, j2);
    }

    public static byte[] zzb(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return zzc(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            min = zzgdu.zze(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzc(Queue queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i2) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        int i3 = i2 - length;
        while (i3 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i3, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - i3, min);
            i3 -= min;
        }
        return copyOf;
    }
}
