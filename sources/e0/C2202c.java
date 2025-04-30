package e0;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2202c extends H {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19962a;
    public final int b;

    public C2202c(Object obj, int i9) {
        this.f19962a = obj;
        this.b = i9;
    }

    public final void a() {
        int i9;
        boolean z8 = false;
        Object obj = this.f19962a;
        if (obj != null) {
            i9 = obj.hashCode();
        } else {
            i9 = 0;
        }
        if (i9 == this.b) {
            z8 = true;
        }
        if (z8) {
        } else {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
