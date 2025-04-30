package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6N {
    public static C6O A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C6N.class) {
            if (A00 == null) {
                return;
            }
            C8B c8b = new C8B(A00.AFE());
            c8b.A05(1);
            C1635Ym A002 = AbstractC09637e.A00();
            if (A002 != null) {
                A002.A07().A9a(A00(0, 9, 109), 3401, c8b);
            }
            A00.reset();
        }
    }

    public static void A03(final long j7) {
        if (j7 > 0) {
            A00 = new C1645Yw();
            new Thread(j7) { // from class: com.facebook.ads.redexgen.X.6P
                public final long A00;

                {
                    this.A00 = j7;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (KL.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (InterruptedException unused) {
                            }
                            C6N.A01();
                        } catch (Throwable th) {
                            KL.A00(th, this);
                            return;
                        }
                    }
                }
            };
        }
    }
}
