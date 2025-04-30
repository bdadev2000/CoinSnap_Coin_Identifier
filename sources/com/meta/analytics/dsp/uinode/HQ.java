package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public abstract class HQ {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:44:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:46:0x00ae */
    public static long A00(C1191Gy c1191Gy, long j7, long j9, InterfaceC1187Gu interfaceC1187Gu, byte[] bArr, I3 i32, int i9, HP hp) throws IOException, InterruptedException {
        InterfaceC1187Gu interfaceC1187Gu2;
        while (true) {
            if (i32 != null) {
                i32.A01(i9);
            }
            try {
                break;
            } catch (I2 unused) {
            } finally {
                IF.A0W(interfaceC1187Gu2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C1191Gy c1191Gy2 = new C1191Gy(c1191Gy.A04, c1191Gy.A06, j7, (c1191Gy.A03 + j7) - c1191Gy.A01, -1L, c1191Gy.A05, c1191Gy.A00 | 2);
        long ADl = interfaceC1187Gu2.ADl(c1191Gy2);
        if (hp.A01 == -1 && ADl != -1) {
            hp.A01 = c1191Gy2.A01 + ADl;
        }
        long j10 = 0;
        while (true) {
            if (j10 == j9) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int read = interfaceC1187Gu2.read(bArr, 0, j9 != -1 ? (int) Math.min(bArr.length, j9 - j10) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (read != -1) {
                j10 += read;
                hp.A02 += read;
            } else if (hp.A01 == -1) {
                hp.A01 = c1191Gy2.A01 + j10;
            }
        }
        return j10;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C1191Gy c1191Gy) {
        if (c1191Gy.A05 != null) {
            return c1191Gy.A05;
        }
        Uri uri = c1191Gy.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C1191Gy c1191Gy, HK hk, C1558Vk c1558Vk, byte[] bArr, I3 i32, int i9, HP hp, AtomicBoolean atomicBoolean, boolean z8) throws IOException, InterruptedException {
        long start;
        HP hp2 = hp;
        AbstractC1192Ha.A01(c1558Vk);
        AbstractC1192Ha.A01(bArr);
        if (hp2 != null) {
            A04(c1191Gy, hk, hp2);
        } else {
            hp2 = new HP();
        }
        String A02 = A02(c1191Gy);
        long j7 = c1191Gy.A01;
        long start2 = c1191Gy.A02;
        if (start2 != -1) {
            start = c1191Gy.A02;
        } else {
            start = hk.A6W(A02);
        }
        while (true) {
            long j9 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long A6G = hk.A6G(A02, j7, start != -1 ? start : Long.MAX_VALUE);
                    if (A6G <= 0) {
                        long j10 = -A6G;
                        A6G = j10;
                        if (A00(c1191Gy, j7, j10, c1558Vk, bArr, i32, i9, hp2) < A6G) {
                            if (!z8 || start == -1) {
                                return;
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    j7 += A6G;
                    if (start != -1) {
                        j9 = A6G;
                    }
                    start -= j9;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C1191Gy c1191Gy, HK hk, HP hp) {
        long left;
        String A02 = A02(c1191Gy);
        long j7 = c1191Gy.A01;
        if (c1191Gy.A02 != -1) {
            left = c1191Gy.A02;
        } else {
            left = hk.A6W(A02);
        }
        hp.A01 = left;
        hp.A00 = 0L;
        hp.A02 = 0L;
        while (left != 0) {
            long A6G = hk.A6G(A02, j7, left != -1 ? left : Long.MAX_VALUE);
            if (A6G > 0) {
                hp.A00 += A6G;
            } else {
                A6G = -A6G;
                if (A6G == Long.MAX_VALUE) {
                    return;
                }
            }
            j7 += A6G;
            if (left == -1) {
                A6G = 0;
            }
            left -= A6G;
        }
    }

    public static void A05(HK hk, String str) {
        Iterator<HO> it = hk.A6H(str).iterator();
        while (it.hasNext()) {
            try {
                hk.AF9(it.next());
            } catch (HI unused) {
            }
        }
    }
}
