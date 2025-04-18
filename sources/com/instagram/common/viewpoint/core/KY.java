package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class KY implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<KO> A04;
    public final KM A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{44, 11, 16, 16, 31, 28, 18, 27, 94, 29, 12, 27, 31, 10, 27, 26, 80, 94, 42, 22, 12, 27, 31, 26, 68, 94};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public KY() {
        if (A03.get()) {
            this.A00 = C0647Kd.A01(new C0646Kc(A01(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A03(boolean z2) {
        A03.set(z2);
    }

    public static void A04(boolean z2, KO ko) {
        A02.set(z2);
        A04.set(ko);
    }

    public final KM A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C0647Kd.A03(this);
            }
            try {
                A06();
            } catch (Throwable th) {
                if (A02.get()) {
                    AbstractC0649Kf.A00().A9s(3301, th);
                    KO ko = A04.get();
                    if (ko != null) {
                        ko.AFg(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                C0647Kd.A04(this);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
