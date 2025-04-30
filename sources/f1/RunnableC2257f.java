package f1;

/* renamed from: f1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2257f implements Runnable {
    public final AbstractC2260i b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.c f20257c;

    public RunnableC2257f(AbstractC2260i abstractC2260i, f4.c cVar) {
        this.b = abstractC2260i;
        this.f20257c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b != this) {
            return;
        }
        if (AbstractC2260i.f20262h.f(this.b, this, AbstractC2260i.e(this.f20257c))) {
            AbstractC2260i.b(this.b);
        }
    }
}
