package b1;

/* loaded from: classes2.dex */
public final class u0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f22379c;

    public u0(Runnable runnable, long j2) {
        super(j2);
        this.f22379c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22379c.run();
    }

    @Override // b1.v0
    public final String toString() {
        return super.toString() + this.f22379c;
    }
}
