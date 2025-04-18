package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class F6 {
    public final int A00;
    public final Et A01;
    public final long A02;
    public final CopyOnWriteArrayList<F5> A03;

    public F6() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public F6(CopyOnWriteArrayList<F5> copyOnWriteArrayList, int i2, Et et, long j2) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i2;
        this.A01 = et;
        this.A02 = j2;
    }

    private long A00(long j2) {
        long A01 = AbstractC03849b.A01(j2);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
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

    public final F6 A02(int i2, Et et, long j2) {
        return new F6(this.A03, i2, et, j2);
    }

    public final void A03() {
        AbstractC0576Hf.A04(this.A01 != null);
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new Ew(this, listener));
        }
    }

    public final void A04() {
        AbstractC0576Hf.A04(this.A01 != null);
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new RunnableC0520Ex(this, listener));
        }
    }

    public final void A05() {
        AbstractC0576Hf.A04(this.A01 != null);
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new F2(this, listener));
        }
    }

    public final void A06(int i2, Format format, int i3, Object obj, long j2) {
        A0C(new F8(1, i2, format, i3, obj, A00(j2), -9223372036854775807L));
    }

    public final void A07(Handler handler, F9 f9) {
        AbstractC0576Hf.A03((handler == null || f9 == null) ? false : true);
        this.A03.add(new F5(handler, f9));
    }

    public final void A08(F7 f7, F8 f8) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new F0(this, listener, f7, f8));
        }
    }

    public final void A09(F7 f7, F8 f8) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new RunnableC0522Ez(this, listener, f7, f8));
        }
    }

    public final void A0A(F7 f7, F8 f8) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new RunnableC0521Ey(this, listener, f7, f8));
        }
    }

    public final void A0B(F7 f7, F8 f8, IOException iOException, boolean z2) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            A01(next.A00, new F1(this, next.A01, f7, f8, iOException, z2));
        }
    }

    public final void A0C(F8 f8) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 next = it.next();
            F9 listener = next.A01;
            A01(next.A00, new F4(this, listener, f8));
        }
    }

    public final void A0D(F9 f9) {
        Iterator<F5> it = this.A03.iterator();
        while (it.hasNext()) {
            F5 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == f9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(H3 h3, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4) {
        A0A(new F7(h3, j4, 0L, 0L), new F8(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0F(H3 h3, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
        A08(new F7(h3, j4, j5, j6), new F8(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0G(H3 h3, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
        A09(new F7(h3, j4, j5, j6), new F8(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0H(H3 h3, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6, IOException iOException, boolean z2) {
        A0B(new F7(h3, j4, j5, j6), new F8(i2, i3, format, i4, obj, A00(j2), A00(j3)), iOException, z2);
    }
}
