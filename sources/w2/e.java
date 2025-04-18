package w2;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final h f26680b;

    /* renamed from: c, reason: collision with root package name */
    public final ua.b f26681c;

    public e(h hVar, ua.b bVar) {
        this.f26680b = hVar;
        this.f26681c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26680b.f26688b != this) {
            return;
        }
        if (h.f26686h.h(this.f26680b, this, h.e(this.f26681c))) {
            h.b(this.f26680b);
        }
    }
}
