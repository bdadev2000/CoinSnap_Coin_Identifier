package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class F1 {
    public static String[] A04 = {"XHo", "ubtbrXFiKU0aMD9WZdFFXMvL5SNCKhBD", "k9cdhOGQS1oEdCdR21VeueSE4nGT", "BZNadIlHUT8LbNbZ8qdMYncW4fXCJJFh", "22DNreJXUwzG5I9t9ymbmjKefjfUTWMr", "OkM0GcBH5aVjMNZagw1JqhxPR8ijdnHI", "ik3Hzc9el9B7KCBCFVHKN4tCPL2D2JGF", "0FgMGgJ2UsG2ZcXwt2m5OtQLezKmVI44"};
    public final int A00;
    public final C1132Eo A01;
    public final long A02;
    public final CopyOnWriteArrayList<F0> A03;

    public F1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public F1(CopyOnWriteArrayList<F0> copyOnWriteArrayList, int i9, C1132Eo c1132Eo, long j7) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i9;
        this.A01 = c1132Eo;
        this.A02 = j7;
    }

    private long A00(long j7) {
        long A01 = C9W.A01(j7);
        if (A01 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final F1 A02(int i9, C1132Eo c1132Eo, long j7) {
        return new F1(this.A03, i9, c1132Eo, j7);
    }

    public final void A03() {
        AbstractC1192Ha.A04(this.A01 != null);
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC1135Er(this, listener));
        }
    }

    public final void A04() {
        AbstractC1192Ha.A04(this.A01 != null);
        String[] strArr = A04;
        if (strArr[4].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rYA4ryMG3XFm73cnSWA4HWNW3HUxv7KC";
        strArr2[1] = "1YJ2rSWw51hvYcz1kikUBhJeKIWd76IZ";
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC1136Es(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        AbstractC1192Ha.A04(this.A01 != null);
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC1141Ex(this, listener));
        }
    }

    public final void A06(int i9, Format format, int i10, Object obj, long j7) {
        A0C(new F3(1, i9, format, i10, obj, A00(j7), C.TIME_UNSET));
    }

    public final void A07(Handler handler, F4 f42) {
        AbstractC1192Ha.A03((handler == null || f42 == null) ? false : true);
        this.A03.add(new F0(handler, f42));
    }

    public final void A08(F2 f22, F3 f32) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC1139Ev(this, listener, f22, f32));
        }
    }

    public final void A09(F2 f22, F3 f32) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC1138Eu(this, listener, f22, f32));
        }
    }

    public final void A0A(F2 f22, F3 f32) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC1137Et(this, listener, f22, f32));
        }
    }

    public final void A0B(F2 f22, F3 f32, IOException iOException, boolean z8) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            A01(next.A00, new RunnableC1140Ew(this, next.A01, f22, f32, iOException, z8));
        }
    }

    public final void A0C(F3 f32) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC1143Ez(this, listener, f32));
        }
    }

    public final void A0D(F4 f42) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == f42) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C1191Gy c1191Gy, int i9, int i10, Format format, int i11, Object obj, long j7, long j9, long j10) {
        A0A(new F2(c1191Gy, j10, 0L, 0L), new F3(i9, i10, format, i11, obj, A00(j7), A00(j9)));
    }

    public final void A0F(C1191Gy c1191Gy, int i9, int i10, Format format, int i11, Object obj, long j7, long j9, long j10, long j11, long j12) {
        A08(new F2(c1191Gy, j10, j11, j12), new F3(i9, i10, format, i11, obj, A00(j7), A00(j9)));
    }

    public final void A0G(C1191Gy c1191Gy, int i9, int i10, Format format, int i11, Object obj, long j7, long j9, long j10, long j11, long j12) {
        A09(new F2(c1191Gy, j10, j11, j12), new F3(i9, i10, format, i11, obj, A00(j7), A00(j9)));
    }

    public final void A0H(C1191Gy c1191Gy, int i9, int i10, Format format, int i11, Object obj, long j7, long j9, long j10, long j11, long j12, IOException iOException, boolean z8) {
        A0B(new F2(c1191Gy, j10, j11, j12), new F3(i9, i10, format, i11, obj, A00(j7), A00(j9)), iOException, z8);
    }
}
