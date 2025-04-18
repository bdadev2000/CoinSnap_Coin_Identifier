package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.redexgen.X.Ls, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ThreadFactoryC0741Ls implements ThreadFactory {
    public static byte[] A03;
    public final AtomicInteger A00 = new AtomicInteger(1);
    public final /* synthetic */ ExecutorC0742Lt A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{96, 103, 104, Ascii.FS, 3, 85, 6, 5, 3, 66};
    }

    public ThreadFactoryC0741Ls(ExecutorC0742Lt executorC0742Lt, String str) {
        this.A01 = executorC0742Lt;
        this.A02 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format(Locale.US, A00(0, 10, 15), this.A02, Integer.valueOf(this.A00.getAndIncrement())));
    }
}
