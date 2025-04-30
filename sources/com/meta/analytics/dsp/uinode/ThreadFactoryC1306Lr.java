package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.ads.redexgen.X.Lr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ThreadFactoryC1306Lr implements ThreadFactory {
    public static byte[] A02;
    public final AtomicLong A01 = new AtomicLong();
    public int A00 = Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{94, 82, 80, 19, 91, 92, 94, 88, 95, 82, 82, 86, 19, 92, 89, 78, Ascii.GS, 73, 85, 79, 88, 92, 89, Ascii.DLE, Ascii.CAN, 89, Ascii.GS, Ascii.CAN, 73, 123, Ascii.GS, Ascii.CAN, 1, 73, 105};
    }

    private final String A00() {
        return String.format(Locale.US, A01(0, 35, 90), Long.valueOf(this.A01.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
