package g4;

/* loaded from: classes.dex */
public final class q implements w4.f {

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f18143b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18144c;

    public /* synthetic */ q(Object obj) {
        this.f18144c = obj;
    }

    public final i4.a a() {
        if (((i4.a) this.f18143b) == null) {
            synchronized (this) {
                if (((i4.a) this.f18143b) == null) {
                    this.f18143b = ((i4.c) this.f18144c).a();
                }
                if (((i4.a) this.f18143b) == null) {
                    this.f18143b = new com.facebook.b(11);
                }
            }
        }
        return (i4.a) this.f18143b;
    }

    @Override // w4.f
    public final Object get() {
        if (this.f18143b == null) {
            synchronized (this) {
                if (this.f18143b == null) {
                    Object obj = ((w4.f) this.f18144c).get();
                    com.bumptech.glide.c.l(obj);
                    this.f18143b = obj;
                }
            }
        }
        return this.f18143b;
    }
}
