package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Hl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0637Hl implements InterfaceC0894Rp {
    public static boolean A03;
    public static byte[] A04;
    public static final InterfaceC0892Rn A05;
    public static final String A06;
    public long A00 = 0;
    public final InterfaceC0893Ro A01;
    public final InterfaceC0899Ru A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{Byte.MAX_VALUE, -88, -85, -100, -94, -89, -96, 89, -89, -98, -79, -83, 89, -84, -78, -89, -100, 89, -102, -83, 89, -77, -57, -40, -47, -122, -57, -39, -122, -44, -43, -122, -39, -33, -44, -55, -50, -40, -43, -44, -49, -32, -57, -38, -49, -43, -44, -122, -39, -55, -50, -53, -54, -37, -46, -53, -54, -108, -122, -78, -57, -39, -38, -122, -39, -33, -44, -55, -122, -57, -38, -122, -117, -54, -108, -122, -76, -53, -34, -38, -122, -39, -33, -44, -55, -122, -57, -38, -122, -117, -54, -108, -51, -26, -33, -33, -22, -102, -32, -23, -20, -102, -97, -34, -102, -25, -29, -26, -26, -29, -19, -88, -14, -15, -43, -8, -15, -55, -20, -15, -20, -10, -21, -24, -25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0894Rp
    public final synchronized void A5k(int i10) {
        long A4z = this.A02.A4z() + (i10 * 1000000 * (A03 ? 1 : 1000));
        long j3 = this.A00;
        if (j3 == 0 || j3 > A4z) {
            this.A00 = A4z;
            notifyAll();
        }
    }

    static {
        A02();
        A06 = C0637Hl.class.getSimpleName();
        A05 = new C0640Ho();
        A03 = false;
    }

    public C0637Hl(InterfaceC0893Ro interfaceC0893Ro, InterfaceC0899Ru interfaceC0899Ru) {
        this.A01 = interfaceC0893Ro;
        this.A02 = interfaceC0899Ru;
        Thread scheduler = new Thread(new RunnableC0895Rq(this));
        scheduler.start();
    }

    private void A01() {
        while (true) {
            synchronized (this) {
                if (this.A00 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    long A4z = this.A02.A4z();
                    long j3 = this.A00;
                    if (A4z < j3) {
                        int millisToSleep = (int) ((j3 - A4z) / 1000000);
                        if (millisToSleep >= 1) {
                            String.format(Locale.US, A00(92, 20, 69), Integer.valueOf(millisToSleep));
                            try {
                                long current = millisToSleep;
                                this.A02.AGQ(this, current);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                    this.A00 = 0L;
                    this.A01.AFP();
                    long A4z2 = this.A02.A4z();
                    if (0 != 0) {
                        break;
                    }
                    synchronized (this) {
                        if (this.A00 < A4z2) {
                            String.format(Locale.US, A00(21, 71, 49), Long.valueOf(A4z2), Long.valueOf(this.A00));
                            this.A00 = 0L;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(A00(112, 13, 78));
    }

    public static /* synthetic */ void A03(C0637Hl c0637Hl) {
        c0637Hl.A01();
        throw null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0894Rp
    public final synchronized void A5l() {
        this.A00 = this.A02.A4z();
        String str = A00(0, 21, 4) + this.A00;
        notifyAll();
    }
}
