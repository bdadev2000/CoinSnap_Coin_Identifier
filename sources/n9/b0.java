package n9;

import android.os.SystemClock;
import s7.b2;

/* loaded from: classes3.dex */
public final class b0 implements p {

    /* renamed from: b, reason: collision with root package name */
    public final a f22519b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22520c;

    /* renamed from: d, reason: collision with root package name */
    public long f22521d;

    /* renamed from: f, reason: collision with root package name */
    public long f22522f;

    /* renamed from: g, reason: collision with root package name */
    public b2 f22523g = b2.f24301f;

    public b0(a aVar) {
        this.f22519b = aVar;
    }

    @Override // n9.p
    public final void a(b2 b2Var) {
        if (this.f22520c) {
            b(getPositionUs());
        }
        this.f22523g = b2Var;
    }

    public final void b(long j3) {
        this.f22521d = j3;
        if (this.f22520c) {
            ((c0) this.f22519b).getClass();
            this.f22522f = SystemClock.elapsedRealtime();
        }
    }

    public final void c() {
        if (!this.f22520c) {
            ((c0) this.f22519b).getClass();
            this.f22522f = SystemClock.elapsedRealtime();
            this.f22520c = true;
        }
    }

    @Override // n9.p
    public final b2 getPlaybackParameters() {
        return this.f22523g;
    }

    @Override // n9.p
    public final long getPositionUs() {
        long j3;
        long j10 = this.f22521d;
        if (this.f22520c) {
            ((c0) this.f22519b).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f22522f;
            if (this.f22523g.f24302b == 1.0f) {
                j3 = h0.H(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * r4.f24304d;
            }
            return j10 + j3;
        }
        return j10;
    }
}
