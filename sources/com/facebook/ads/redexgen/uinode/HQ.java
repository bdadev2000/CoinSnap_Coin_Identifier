package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public abstract class HQ {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:44:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:46:0x00ae */
    public static long A00(C0625Gy c0625Gy, long j3, long j10, InterfaceC0621Gu interfaceC0621Gu, byte[] bArr, I3 i32, int i10, HP hp) throws IOException, InterruptedException {
        InterfaceC0621Gu interfaceC0621Gu2;
        while (true) {
            if (i32 != null) {
                i32.A01(i10);
            }
            try {
                break;
            } catch (I2 unused) {
            } finally {
                IF.A0W(interfaceC0621Gu2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0625Gy c0625Gy2 = new C0625Gy(c0625Gy.A04, c0625Gy.A06, j3, (c0625Gy.A03 + j3) - c0625Gy.A01, -1L, c0625Gy.A05, c0625Gy.A00 | 2);
        long ADl = interfaceC0621Gu2.ADl(c0625Gy2);
        if (hp.A01 == -1 && ADl != -1) {
            hp.A01 = c0625Gy2.A01 + ADl;
        }
        long j11 = 0;
        while (true) {
            if (j11 == j10) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int read = interfaceC0621Gu2.read(bArr, 0, j10 != -1 ? (int) Math.min(bArr.length, j10 - j11) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (read != -1) {
                j11 += read;
                hp.A02 += read;
            } else if (hp.A01 == -1) {
                hp.A01 = c0625Gy2.A01 + j11;
            }
        }
        return j11;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0625Gy c0625Gy) {
        if (c0625Gy.A05 != null) {
            return c0625Gy.A05;
        }
        Uri uri = c0625Gy.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C0625Gy c0625Gy, HK hk, C0992Vk c0992Vk, byte[] bArr, I3 i32, int i10, HP hp, AtomicBoolean atomicBoolean, boolean z10) throws IOException, InterruptedException {
        long start;
        HP hp2 = hp;
        AbstractC0626Ha.A01(c0992Vk);
        AbstractC0626Ha.A01(bArr);
        if (hp2 != null) {
            A04(c0625Gy, hk, hp2);
        } else {
            hp2 = new HP();
        }
        String A02 = A02(c0625Gy);
        long j3 = c0625Gy.A01;
        long start2 = c0625Gy.A02;
        if (start2 != -1) {
            start = c0625Gy.A02;
        } else {
            start = hk.A6W(A02);
        }
        while (true) {
            long j10 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long A6G = hk.A6G(A02, j3, start != -1 ? start : Long.MAX_VALUE);
                    if (A6G <= 0) {
                        long j11 = -A6G;
                        A6G = j11;
                        if (A00(c0625Gy, j3, j11, c0992Vk, bArr, i32, i10, hp2) < A6G) {
                            if (!z10 || start == -1) {
                                return;
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    j3 += A6G;
                    if (start != -1) {
                        j10 = A6G;
                    }
                    start -= j10;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C0625Gy c0625Gy, HK hk, HP hp) {
        long left;
        String A02 = A02(c0625Gy);
        long j3 = c0625Gy.A01;
        if (c0625Gy.A02 != -1) {
            left = c0625Gy.A02;
        } else {
            left = hk.A6W(A02);
        }
        hp.A01 = left;
        hp.A00 = 0L;
        hp.A02 = 0L;
        while (left != 0) {
            long A6G = hk.A6G(A02, j3, left != -1 ? left : Long.MAX_VALUE);
            if (A6G > 0) {
                hp.A00 += A6G;
            } else {
                A6G = -A6G;
                if (A6G == Long.MAX_VALUE) {
                    return;
                }
            }
            j3 += A6G;
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
