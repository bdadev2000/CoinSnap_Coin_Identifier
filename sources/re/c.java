package re;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final fe.c f24111e = new fe.c(c.class.getSimpleName());
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24112b = null;

    /* renamed from: c, reason: collision with root package name */
    public long f24113c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f24114d = -1;

    public c(d dVar) {
        this.a = dVar;
        dVar.getClass();
    }

    public final long a() {
        boolean z10;
        if (this.f24112b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return this.f24113c;
        }
        f24111e.a(3, "Frame is dead! time:", Long.valueOf(this.f24113c), "lastTime:", Long.valueOf(this.f24114d));
        throw new RuntimeException("You should not access a released frame. If this frame was passed to a FrameProcessor, you can only use its contents synchronously, for the duration of the process() method.");
    }

    public final void b() {
        boolean z10;
        boolean z11 = true;
        if (this.f24112b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        f24111e.a(0, "Frame with time", Long.valueOf(this.f24113c), "is being released.");
        Object obj = this.f24112b;
        this.f24112b = null;
        this.f24113c = -1L;
        d dVar = this.a;
        if (dVar.f24117c == null) {
            z11 = false;
        }
        if (z11) {
            dVar.b(obj, dVar.f24118d.offer(this));
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f24113c == this.f24113c;
    }
}
