package Q7;

import u7.C2814e;

/* loaded from: classes3.dex */
public abstract class L extends AbstractC0251t {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f2534h = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f2535d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2536f;

    /* renamed from: g, reason: collision with root package name */
    public C2814e f2537g;

    public final void l(boolean z8) {
        long j7;
        long j9 = this.f2535d;
        if (z8) {
            j7 = 4294967296L;
        } else {
            j7 = 1;
        }
        long j10 = j9 - j7;
        this.f2535d = j10;
        if (j10 <= 0 && this.f2536f) {
            shutdown();
        }
    }

    public abstract Thread m();

    public final void o(boolean z8) {
        long j7;
        long j9 = this.f2535d;
        if (z8) {
            j7 = 4294967296L;
        } else {
            j7 = 1;
        }
        this.f2535d = j7 + j9;
        if (!z8) {
            this.f2536f = true;
        }
    }

    public abstract long p();

    public final boolean q() {
        Object removeFirst;
        C2814e c2814e = this.f2537g;
        if (c2814e == null) {
            return false;
        }
        if (c2814e.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = c2814e.removeFirst();
        }
        E e4 = (E) removeFirst;
        if (e4 == null) {
            return false;
        }
        e4.run();
        return true;
    }

    public abstract void shutdown();
}
