package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.instagram.common.viewpoint.core.HD;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class HC<T extends HD> extends Handler implements Runnable {
    public static byte[] A0A;
    public static String[] A0B = {"jnbmIE2916PFpUTPOA8pGlKEXy6RHOsj", "9rhOhRNdxlxAg8zNXDvdXeOLZ3R", "9E94u0qc0K0USfGlf79CEW8gWN5Gt", "Qc5NHzHyAtQ93FWvZt19c61s8RDFcyv6", "ZqeOda301Fdz3JQ2hYEiJQV5PqrnYtOf", "ayOQ3imumLDr4CxNka1OeixDC9uOGZjB", "c8BnLV9KGCbGJHkN4eSXXrImznfnFd0b", "IX3a2OshrR8CckanHKp7BtIP31Kfs"};
    public int A00;
    public HB<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C0973Wv A09;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{105, 122, 54, 57, 38, 107, 78, 109, 99, 102, 86, 99, 113, 105, 8, 50, 51, 8, 33, 10, 34, 42, 40, 53, 62, 103, 34, 53, 53, 40, 53, 103, 43, 40, 38, 35, 46, 41, 32, 103, 52, 51, 53, 34, 38, 42, 100, 95, 84, 73, 65, 84, 82, 69, 84, 85, 17, 84, 67, 67, 94, 67, 17, 93, 94, 80, 85, 88, 95, 86, 17, 66, 69, 67, 84, 80, 92, 41, 18, 25, 4, 12, 25, 31, 8, 25, 24, 92, 25, 4, 31, 25, 12, 8, 21, 19, 18, 92, 20, 29, 18, 24, 16, 21, 18, 27, 92, 16, 19, 29, 24, 92, 31, 19, 17, 12, 16, 25, 8, 25, 24, 46, 21, 30, 3, 11, 30, 24, 15, 30, 31, 91, 30, 3, 24, 30, 11, 15, 18, 20, 21, 91, 23, 20, 26, 31, 18, 21, 28, 91, 8, 15, 9, 30, 26, 22, 111, 108, 98, 103, 57, Utf8.REPLACEMENT_BYTE, 96, 111, 112, 61};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (KQ.A02(this)) {
            return;
        }
        try {
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
        if (this.A08) {
            return;
        }
        if (message.what == 0) {
            A02();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        A03();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.A04;
        if (this.A07) {
            this.A01.ACQ(this.A05, elapsedRealtime, j2, false);
            return;
        }
        switch (message.what) {
            case 1:
                this.A01.ACQ(this.A05, elapsedRealtime, j2, false);
                return;
            case 2:
                try {
                    this.A01.ACS(this.A05, elapsedRealtime, j2);
                    return;
                } catch (RuntimeException e) {
                    Log.e(A01(6, 8, 41), A01(77, 44, 87), e);
                    this.A09.A01 = new HH(e);
                    return;
                }
            case 3:
                this.A02 = (IOException) message.obj;
                int ACT = this.A01.ACT(this.A05, elapsedRealtime, j2, this.A02);
                if (ACT == 3) {
                    this.A09.A01 = this.A02;
                    return;
                } else {
                    if (ACT != 2) {
                        int i2 = 1;
                        if (ACT != 1) {
                            i2 = 1 + this.A00;
                        }
                        this.A00 = i2;
                        A06(A00());
                        return;
                    }
                    return;
                }
            default:
                return;
        }
        KQ.A00(th, this);
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HB != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.HD> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public HC(C0973Wv c0973Wv, Looper looper, T loadable, HB<T> hb, int i2, long j2) {
        super(looper);
        this.A09 = c0973Wv;
        this.A05 = loadable;
        this.A01 = hb;
        this.A03 = i2;
        this.A04 = j2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private void A02() {
        ExecutorService executorService;
        HC hc;
        this.A02 = null;
        executorService = this.A09.A02;
        hc = this.A09.A00;
        executorService.execute(hc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A05(int i2) throws IOException {
        if (this.A02 == null || this.A00 <= i2) {
        } else {
            throw this.A02;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A06(long j2) {
        HC hc;
        hc = this.A09.A00;
        AbstractC0576Hf.A04(hc == null);
        C0973Wv c0973Wv = this.A09;
        String[] strArr = A0B;
        if (strArr[5].charAt(15) != strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        A0B[1] = "zIFvZ9";
        c0973Wv.A00 = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    public final void A07(boolean z2) {
        this.A08 = z2;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z2) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A4W();
            if (this.A06 != null) {
                Thread thread = this.A06;
                if (A0B[4].charAt(9) == 'w') {
                    throw new RuntimeException();
                }
                A0B[4] = "r4RNyVnork5imI2VujkZnwWbxz1Yztux";
                thread.interrupt();
            }
        }
        if (z2) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.ACQ(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HC != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HD> */
    @Override // java.lang.Runnable
    public final void run() {
        String A01 = A01(6, 8, 41);
        if (KQ.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                IH.A02(A01(156, 10, 40) + this.A05.getClass().getSimpleName() + A01(0, 6, 126));
                                try {
                                    this.A05.A9o();
                                } finally {
                                    IH.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (Error e) {
                            Log.e(A01, A01(46, 31, 26), e);
                            if (!this.A08) {
                                obtainMessage(4, e).sendToTarget();
                            }
                            throw e;
                        } catch (InterruptedException unused) {
                            AbstractC0576Hf.A04(this.A07);
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        }
                    } catch (Exception e2) {
                        Log.e(A01, A01(Opcodes.LSHL, 35, 80), e2);
                        if (!this.A08) {
                            obtainMessage(3, new HH(e2)).sendToTarget();
                        }
                    }
                } catch (OutOfMemoryError e3) {
                    Log.e(A01, A01(14, 32, 108), e3);
                    if (!this.A08) {
                        obtainMessage(3, new HH(e3)).sendToTarget();
                    }
                }
            } catch (IOException e4) {
                if (!this.A08) {
                    obtainMessage(3, e4).sendToTarget();
                }
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
