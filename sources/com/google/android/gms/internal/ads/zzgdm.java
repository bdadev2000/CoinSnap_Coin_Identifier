package com.google.android.gms.internal.ads;

import androidx.fragment.app.FragmentTransaction;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class zzgdm {
    private static final OutputStream zza = new zzgdk();

    public static InputStream zza(InputStream inputStream, long j7) {
        return new zzgdl(inputStream, j7);
    }

    public static byte[] zzb(InputStream inputStream) throws IOException {
        int i9;
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(FragmentTransaction.TRANSIT_EXIT_MASK, Math.max(128, highestOneBit + highestOneBit));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return zzc(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            if (min < 4096) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            min = zzgea.zze(min * i9);
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzc(Queue queue, int i9) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i9) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i9);
        int i10 = i9 - length;
        while (i10 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i10, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i9 - i10, min);
            i10 -= min;
        }
        return copyOf;
    }
}
