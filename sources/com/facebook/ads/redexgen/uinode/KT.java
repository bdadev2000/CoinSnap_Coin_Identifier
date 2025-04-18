package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class KT implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<KJ> A04;
    public final KH A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, Ascii.SO, 77, 92, 75, 79, 90, 75, 74, 0, Ascii.SO, 122, 70, 92, 75, 79, 74, Ascii.DC4, Ascii.SO};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public KT() {
        if (A03.get()) {
            this.A00 = KY.A01(new KX(A01(0, 26, 90) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A03(boolean z10) {
        A03.set(z10);
    }

    public static void A04(boolean z10, KJ kj) {
        A02.set(z10);
        A04.set(kj);
    }

    public final KH A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                KY.A03(this);
            }
            try {
                A06();
            } catch (Throwable th2) {
                if (A02.get()) {
                    AbstractC0700Ka.A00().A9S(3301, th2);
                    KJ kj = A04.get();
                    if (kj != null) {
                        kj.AFC(th2, this);
                    }
                } else {
                    throw th2;
                }
            }
            if (A03.get()) {
                KY.A04(this);
            }
        } catch (Throwable th3) {
            KL.A00(th3, this);
        }
    }
}
