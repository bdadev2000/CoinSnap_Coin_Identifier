package b1;

/* loaded from: classes4.dex */
public final class h2 extends g1.y implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final long f22327f;

    public h2(long j2, h0.g gVar) {
        super(gVar, gVar.getContext());
        this.f22327f = j2;
    }

    @Override // b1.a, b1.r1
    public final String c0() {
        return super.c0() + "(timeMillis=" + this.f22327f + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0.a.h0(this.f22283c);
        w(new g2("Timed out waiting for " + this.f22327f + " ms", this));
    }
}
