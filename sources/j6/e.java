package j6;

/* loaded from: classes3.dex */
public final class e implements Runnable {
    public final m b;

    public e(m mVar) {
        G7.j.e(mVar, "balloon");
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f();
    }
}
